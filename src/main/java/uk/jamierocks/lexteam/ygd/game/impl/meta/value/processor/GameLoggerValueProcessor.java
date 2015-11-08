/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.meta.MetaHolder;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;

import java.util.Optional;

public class GameLoggerValueProcessor extends AbstractValueProcessor<Logger, Value<Logger>> {

    public GameLoggerValueProcessor() {
        super(Keys.GAME_LOGGER);
    }

    @Override
    public boolean supports(MetaHolder container) {
        return container instanceof LexGame;
    }

    @Override
    public boolean offer(MetaHolder container, Logger value) {
        return false; // currently not allowed.
    }

    @Override
    public Optional<Logger> getValueFromContainer(MetaHolder container) {
        if (container instanceof LexGame) {
            return Optional.of(((LexGame) container).getLogger());
        }
        return Optional.empty();
    }
}
