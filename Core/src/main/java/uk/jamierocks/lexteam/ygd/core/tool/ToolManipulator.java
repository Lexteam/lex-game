/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.meta.api.MetaHolder;

/**
 * Represents the tool manipulator.
 *
 * @author Jamie Mansfield
 */
public interface ToolManipulator {

    /**
     * Called when a tool is used.
     *
     * @param panel the panel to manipulate.
     * @param info the manipulator information.
     */
    ToolManipulateResult manipulate(Panel panel, MetaHolder info);

    /**
     * Gets an array of options, to check if the panel can be manipulated.
     *
     * @param panel The panel.
     * @return {@code True} if can manipulate, {@code false} otherwise.
     */
    default boolean[] getManipulateOptions(Panel panel) {
        return new boolean[0];
    }

    /**
     * Checks if this panel, can manipulate a panel.
     *
     * @param panel The panel.
     * @return {@code True} if can manipulate, {@code false} otherwise.
     */
    default boolean canManipulate(Panel panel) {
        boolean[] options = getManipulateOptions(panel);

        if (!panel.isCoolingDown() || !panel.isFixedPanel()) {
            return false;
        }

        for (boolean option : options) {
            if (!option) {
                return false;
            }
        }

        return true;
    }
}
