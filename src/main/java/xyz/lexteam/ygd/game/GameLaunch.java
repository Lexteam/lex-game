/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.lexteam.ygd.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import xyz.lexteam.eventbus.IEventBus;
import xyz.lexteam.eventbus.SimpleEventBus;
import xyz.lexteam.meta.api.MetaRegistry;
import xyz.lexteam.meta.api.builder.Builders;
import xyz.lexteam.meta.api.value.ValueRegistry;
import xyz.lexteam.ygd.core.Game;
import xyz.lexteam.ygd.core.service.ProviderExistsException;
import xyz.lexteam.ygd.game.impl.meta.builder.tool.ToolAddConectionMetaBuilder;
import xyz.lexteam.ygd.game.impl.meta.builder.tool.ToolChangeDurationMetaBuilder;
import xyz.lexteam.ygd.game.impl.meta.processor.tool.ToolAddConnectionMetaProcessor;
import xyz.lexteam.ygd.game.impl.meta.processor.tool.ToolChangeDurationMetaProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionFromValueProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDirectionToValueProcessor;
import xyz.lexteam.ygd.game.impl.meta.value.processor.tool.ToolDurationValueProcessor;
import xyz.lexteam.ygd.game.impl.service.event.GameEvents;
import xyz.lexteam.ygd.game.impl.util.ReflectionHelper;
import xyz.lexteam.ygd.game.impl.util.ReflectionHelperException;

public final class GameLaunch {

    private static Game game;

    public static void main(String[] args) throws ReflectionHelperException {
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

    public static void initialiseLexGame() throws ReflectionHelperException {
        ReflectionHelper.setStaticFinal(xyz.lexteam.ygd.core.LexGame.class, "GAME", game);
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
