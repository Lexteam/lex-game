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
package xyz.lexteam.ygd.core.event.tool;

import xyz.lexteam.ygd.core.event.Event;
import xyz.lexteam.ygd.core.tool.Tool;

/**
 * Represents an event that is centered around a {@link Tool}.
 *
 * @author Jamie Mansfield
 */
public interface ToolEvent extends Event {

    /**
     * Gets the tool the event is centered around.
     *
     * @return the tool.
     */
    Tool getTool();
}
