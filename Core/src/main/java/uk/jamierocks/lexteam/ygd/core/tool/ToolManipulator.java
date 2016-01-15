/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
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
    default ToolManipulatorOptions getManipulateOptions(Panel panel) {
        return ToolManipulatorOptions.builder()
                .build();
    }

    /**
     * Checks if this panel, can manipulate a panel.
     *
     * @param panel The panel.
     * @return {@code True} if can manipulate, {@code false} otherwise.
     */
    default boolean canManipulate(Panel panel) {
        if (!panel.isCoolingDown() || !panel.isFixedPanel()) {
            return false;
        }

        return this.getManipulateOptions(panel).canManipulate();
    }
}
