/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.data.Constants;
import uk.jamierocks.lexteam.ygd.core.meta.api.MetaManager;
import uk.jamierocks.lexteam.ygd.core.meta.api.value.ValueManager;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.core.service.event.IEventBus;
import uk.jamierocks.lexteam.ygd.core.service.event.SimpleEventBus;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.GameMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.DirectionFromValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.DirectionToValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.DurationValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.GameTools;

public class GameLaunch {

    private static Game game;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        game = new LexGame();
        game.getMeta().getLogger().info(String.format("lex-game version %s loading", Constants.VERSION));
        try {
            registerServices();
        } catch (ProviderExistsException e) {
            game.getMeta().getLogger().error("A provider already exists for that service!", e);
        }
        registerProcessors();
        registerValueProcessors();
        GameTools.injectTools();
    }

    public static Game getGame() {
        return game;
    }

    private static void registerServices() throws ProviderExistsException {
        getGame().getServiceManager().setProvider(IEventBus.class, new SimpleEventBus());
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
