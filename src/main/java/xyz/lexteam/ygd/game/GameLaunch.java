/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.lexteam.eventbus.IEventBus;
import xyz.lexteam.eventbus.SimpleEventBus;
import xyz.lexteam.ygd.core.Game;
import xyz.lexteam.ygd.core.service.ProviderExistsException;
import xyz.lexteam.ygd.core.service.event.Events;
import xyz.lexteam.ygd.game.impl.meta.builder.tool.ToolAddConectionMetaBuilder;
import xyz.lexteam.ygd.game.impl.meta.builder.tool.ToolChangeDurationMetaBuilder;
import xyz.lexteam.ygd.game.impl.meta.processor.tool.ToolAddConnectionMetaProcessor;
import xyz.lexteam.ygd.game.impl.meta.processor.tool.ToolChangeDurationMetaProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionFromValueProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionToValueProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDurationValueProcessor;
import xyz.lexteam.ygd.game.impl.service.event.GameEvents;
import xyz.lexteam.meta.api.MetaRegistry;
import xyz.lexteam.meta.api.builder.Builders;
import xyz.lexteam.meta.api.value.ValueRegistry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class GameLaunch {

    private static Game game;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        game = new xyz.lexteam.ygd.game.impl.LexGame();
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
        initialiseLexGame();

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "lex-game v" + Game.VERSION;
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new LexGame(), config);
    }

    public static Game getGame() {
        return game;
    }

    public static void initialiseLexGame() throws IllegalAccessException, NoSuchFieldException {
        Field field = xyz.lexteam.ygd.core.LexGame.class.getDeclaredField("GAME");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, game);
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
