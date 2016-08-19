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

import xyz.lexteam.ygd.core.event.CancellableEvent;
import xyz.lexteam.ygd.core.panel.Panel;
import xyz.lexteam.ygd.core.tool.Tool;

/**
 * Represents the manipulate event.
 *
 * @author Jamie Mansfield
 */
public class ToolManipulateEvent implements ToolEvent, CancellableEvent {

    private final Tool tool;
    private final Panel panel;
    private boolean cancelled = false;

    public ToolManipulateEvent(Tool tool, Panel panel) {
        this.tool = tool;
        this.panel = panel;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tool getTool() {
        return this.tool;
    }

    /**
     * Gets the panel about to be manipulated.
     *
     * @return the panel.
     */
    public Panel getPanel() {
        return this.panel;
    }
}
