/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game;

import uk.jamierocks.eventbus.IEventBus;
import uk.jamierocks.eventbus.SimpleEventBus;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.service.ProviderExistsException;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;
import uk.jamierocks.lexteam.ygd.game.impl.meta.builder.tool.ToolAddConectionMetaBuilder;
import uk.jamierocks.lexteam.ygd.game.impl.meta.builder.tool.ToolChangeDurationMetaBuilder;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.tool.ToolAddConnectionMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.tool.ToolChangeDurationMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionFromValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionToValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDurationValueProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.service.event.GameEvents;
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
