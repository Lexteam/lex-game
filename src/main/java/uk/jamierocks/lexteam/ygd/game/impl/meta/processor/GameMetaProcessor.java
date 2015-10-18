/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor;

import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
import uk.jamierocks.lexteam.ygd.core.meta.api.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.api.MetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.meta.LexGameMeta;

import java.util.Optional;

public class GameMetaProcessor implements MetaProcessor<GameMeta> {

    @Override
    public Class<GameMeta> getMetaType() {
        return GameMeta.class;
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof LexGame;
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
