/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
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
