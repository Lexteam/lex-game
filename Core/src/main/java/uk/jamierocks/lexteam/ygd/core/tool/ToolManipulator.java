package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.panel.Panel;

public interface ToolManipulator {

    /**
     * Called when a tool is used.
     *
     * <b>YOU SHOULD HAVE ALREADY CHECKED IF YOU CAN MANIPULATE THE PANEL!</b>
     *
     * @param panel teh panel to manipulate.
     * @param info the manipulator information.
     */
    void manipulate(Panel panel, ToolManipulatorInfo info);

    boolean[] getManipulateOptions(Panel panel);

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
