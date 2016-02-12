/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game;

import xyz.lexteam.eventbus.IEventBus;
import xyz.lexteam.eventbus.SimpleEventBus;
import xyz.lexteam.ygd.core.Game;
import xyz.lexteam.ygd.core.service.ProviderExistsException;
import xyz.lexteam.ygd.game.impl.LexGame;
import xyz.lexteam.ygd.game.impl.meta.builder.tool.ToolAddConectionMetaBuilder;
import xyz.lexteam.ygd.game.impl.meta.builder.tool.ToolChangeDurationMetaBuilder;
import xyz.lexteam.ygd.game.impl.meta.processor.tool.ToolAddConnectionMetaProcessor;
import xyz.lexteam.ygd.game.impl.meta.processor.tool.ToolChangeDurationMetaProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionFromValueProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionToValueProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDurationValueProcessor;
import xyz.lexteam.ygd.game.impl.service.event.GameEvents;
import uk.jamierocks.meta.api.MetaRegistry;
import uk.jamierocks.meta.api.builder.Builders;
import uk.jamierocks.meta.api.value.ValueRegistry;

public class GameLaunch {

    private static Game game;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        game = new LexGame();
        game.getLogger().info(String.format("lex-game version %s loading", Game.VERSION));
        try {
            registerServices();
        } catch (ProviderExistsException e) {
            game.getLogger().error("A provider already exists for that service!", e);
        }
        GameEvents.initialise(game.getServiceManager().provide(IEventBus.class).get());
        registerProcessors();
        registerManipulatorBuilders();
        registerValueProcessors();
    }

    public static Game getGame() {
        return game;
    }

    private static void registerServices() throws ProviderExistsException {
        getGame().getServiceManager().setProvider(IEventBus.class, new SimpleEventBus());
    }

    public static void registerProcessors() {
        MetaRegistry.registerProcessor(new ToolAddConnectionMetaProcessor());
        MetaRegistry.registerProcessor(new ToolChangeDurationMetaProcessor());
    }

    public static void registerManipulatorBuilders() {
        Builders.registerBuilder(new ToolAddConectionMetaBuilder());
        Builders.registerBuilder(new ToolChangeDurationMetaBuilder());
    }

    public static void registerValueProcessors() {
        ValueRegistry.registerProcessor(new ToolDurationValueProcessor());
        ValueRegistry.registerProcessor(new ToolDirectionToValueProcessor());
        ValueRegistry.registerProcessor(new ToolDirectionFromValueProcessor());
    }
}
