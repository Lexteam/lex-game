package uk.jamierocks.lexteam.ygd.game;

import com.google.common.eventbus.EventBus;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
import uk.jamierocks.lexteam.ygd.core.meta.api.MetaManager;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.ValueManager;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.core.util.DataUtils;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.GameMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.DirectionFromValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.DirectionToValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.DurationValueProcessor;

public class GameLaunch {

    private static Game game;

    public static void main(String[] args) {
        game = new LexGame();
        try {
            registerServices();
        } catch (ProviderExistsException e) {
            game.obtainMeta(GameMeta.class).getLogger().error("A provider already exists for that service!", e);
        }
        registerProcessors();
        registerValueProcessors();

        if (!DataUtils.getDataPath().toFile().exists()) {
            DataUtils.getDataPath().toFile().mkdir();
        }
    }

    public static Game getGame() {
        return game;
    }

    private static void registerServices() throws ProviderExistsException {
        getGame().getServiceManager().setProvider(EventBus.class, new EventBus());
    }

    private static void registerProcessors() {
        MetaManager.registerProcessor(new GameMetaProcessor());
    }

    private static void registerValueProcessors() {
        ValueManager.registerProcessor(new DurationValueProcessor());
        ValueManager.registerProcessor(new DirectionToValueProcessor());
        ValueManager.registerProcessor(new DirectionFromValueProcessor());
    }
}
