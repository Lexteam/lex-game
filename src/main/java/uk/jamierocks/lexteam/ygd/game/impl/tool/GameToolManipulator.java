/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.eventbus.IEventBus;
import uk.jamierocks.lexteam.ygd.core.event.tool.ToolManipulateEvent;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;
import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulator;
import uk.jamierocks.lexteam.ygd.game.GameLaunch;

/**
 * Extension on {@link ToolManipulator} to post events.
 *
 * @author Jamie Mansfield
 */
public abstract class GameToolManipulator implements ToolManipulator {

    private final Tool tool;

    public GameToolManipulator(Tool tool) {
        this.tool = tool;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canManipulate(Panel panel) {
        boolean[] options = getManipulateOptions(panel);

        if (!panel.isCoolingDown() || !panel.isFixedPanel()) {
            return false;
        }

        for (boolean option : options) {
            if (!option) {
                return false;
            }
        }

        ToolManipulateEvent event = new ToolManipulateEvent(tool, panel);
        GameLaunch.getGame().getServiceManager().provide(IEventBus.class).get().post(event);

        return !event.isCancelled();
    }
}
