/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game;

import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.meta.MetaManager;
import uk.jamierocks.lexteam.ygd.core.meta.value.ValueManager;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.core.service.event.IEventBus;
import uk.jamierocks.lexteam.ygd.core.service.event.SimpleEventBus;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.GameMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionFromValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionToValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDurationValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.GameDirectoryValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.GameLoggerValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.service.event.GameEvents;
import uk.jamierocks.lexteam.ygd.game.impl.tool.GameTools;

public class GameLaunch {

    private static Game game;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        game = new LexGame();
        game.getMeta().logger().info(String.format("lex-game version %s loading", Game.VERSION));
        try {
            registerServices();
        } catch (ProviderExistsException e) {
            game.getMeta().logger().error("A provider already exists for that service!", e);
        }
        GameEvents.initialise();
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

    public static void registerProcessors() {
        MetaManager.registerProcessor(new GameMetaProcessor());
    }

    public static void registerValueProcessors() {
        ValueManager.registerProcessor(new GameLoggerValueProcessor());
        ValueManager.registerProcessor(new GameDirectoryValueProcessor());
        ValueManager.registerProcessor(new ToolDurationValueProcessor());
        ValueManager.registerProcessor(new ToolDirectionToValueProcessor());
        ValueManager.registerProcessor(new ToolDirectionFromValueProcessor());
    }
}
