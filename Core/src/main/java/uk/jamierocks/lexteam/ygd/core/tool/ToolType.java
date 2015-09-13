package uk.jamierocks.lexteam.ygd.core.tool;

/**
 * An enum representation of Tools.
 *
 * @author Jamie Mansfield
 */
public enum ToolType {
    ADD_CONNECTION(Tools.ADD_CONNECTION),
    REMOVE_CONNECTION(Tools.REMOVE_CONNECTION),
    REVERSE_CONNECTION(Tools.REVERSE_CONNECTION),
    CHANGE_DURATION(Tools.CHANGE_DURATION),
    WEAK_REPAIR_PANEL(Tools.WEAK_REPAIR_PANEL),
    STRONG_REPAIR_PANEL(Tools.STRONG_REPAIR_PANEL);

    private final Tool tool;

    ToolType(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }

    public static ToolType fromTool(Tool tool) {
        for (ToolType type : values()) {
            if (type.tool == tool) {
                return type;
            }
        }
        return null;
    }
}
