package uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.value.Value;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;

import java.util.Optional;

public class GameLoggerValueProcessor implements ValueProcessor<Logger, Value<Logger>> {

    @Override
    public Key<? extends Value<Logger>> getKey() {
        return Keys.GAME_LOGGER;
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof LexGame;
    }

    @Override
    public boolean offer(MetaOwner container, Logger value) {
        return false; // currently not allowed.
    }

    @Override
    public Optional<Logger> getValueFromContainer(MetaOwner container) {
        if (container instanceof LexGame) {
            return Optional.of(((LexGame) container).getLogger());
        }
        return Optional.empty();
    }
}
