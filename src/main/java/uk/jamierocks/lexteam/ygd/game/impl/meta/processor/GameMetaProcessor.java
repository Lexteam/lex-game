/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor;

import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.GameMeta;
import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.LexGameMeta;

import java.util.Optional;

public class GameMetaProcessor extends AbstractMetaProcessor<GameMeta> {

    public GameMetaProcessor() {
        super(GameMeta.class);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof LexGame;
    }

    @Override
    public boolean apply(MetaOwner owner, GameMeta manipulator) {
        if (owner instanceof LexGame) {
            LexGame game = (LexGame) owner;

            game.offer(Keys.GAME_LOGGER, manipulator.logger());
            game.offer(Keys.GAME_DIRECTORY, manipulator.directory());

            return game.getLogger() == manipulator.logger() &&
                    game.getDirectory() == manipulator.directory();
        }
        return false;
    }

    @Override
    public Optional<GameMeta> getMetaFromContainer(MetaOwner container) {
        if (container instanceof LexGame) {
            LexGame game = (LexGame) container;
            return Optional.of(new LexGameMeta(game.getLogger(), game.getDirectory()));
        }
        return Optional.empty();
    }
}
