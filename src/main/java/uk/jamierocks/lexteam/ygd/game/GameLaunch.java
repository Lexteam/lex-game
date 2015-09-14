package uk.jamierocks.lexteam.ygd.game;

import com.google.common.eventbus.EventBus;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.data.DataManager;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.data.processor.DirectionFromValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.data.processor.DirectionToValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.data.processor.DurationValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.data.processor.LoggerValueProcessor;

public class GameLaunch {

    private static Game game;

    public static void main(String[] args) {
        game = new Game();
        try {
            registerServices();
        } catch (ProviderExistsException e) {
            game.get(Keys.LOGGER).error("A provider already exists for that service!", e);
        }
        registerProcessors();
    }

    public static Game getGame() {
        return game;
    }

    private static void registerServices() throws ProviderExistsException {
        getGame().getServiceManager().setProvider(EventBus.class, new EventBus());
    }

    private static void registerProcessors() {
        DataManager.registerProcessor(new LoggerValueProcessor());
        DataManager.registerProcessor(new DurationValueProcessor());
        DataManager.registerProcessor(new DirectionToValueProcessor());
        DataManager.registerProcessor(new DirectionFromValueProcessor());
    }
}
