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
package xyz.lexteam.ygd.game.impl.service.event;

import xyz.lexteam.eventbus.IEventBus;
import xyz.lexteam.ygd.core.service.event.Events;
import xyz.lexteam.ygd.game.impl.util.ReflectionHelper;
import xyz.lexteam.ygd.game.impl.util.ReflectionHelperException;

/**
 * Implementation utilities pertaining to events
 *
 * @author Jamie Mansfield
 */
public final class GameEvents {

    /**
     * Initialises the EVENT_BUS <code>static final</code> variable in {@link Events}.
     *
     * @param eventBus The event bus instance
     * @throws ReflectionHelperException If there is an issue setting the variable
     */
    public static void initialise(IEventBus eventBus) throws ReflectionHelperException {
        ReflectionHelper.setStaticFinal(Events.class, "EVENT_BUS", eventBus);
    }

}
