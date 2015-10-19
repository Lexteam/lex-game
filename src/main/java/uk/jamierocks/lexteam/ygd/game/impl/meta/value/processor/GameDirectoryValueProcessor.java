/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;

import java.io.File;
import java.util.Optional;

public class GameDirectoryValueProcessor extends AbstractValueProcessor<File, Value<File>> {

    public GameDirectoryValueProcessor() {
        super(Keys.GAME_DIRECTORY);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof LexGame;
    }

    @Override
    public boolean offer(MetaOwner container, File value) {
        return false; // currently not allowed.
    }

    @Override
    public Optional<File> getValueFromContainer(MetaOwner container) {
        if (container instanceof LexGame) {
            return Optional.of(((LexGame) container).getDirectory());
        }
        return Optional.empty();
    }
}
