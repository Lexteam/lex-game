package uk.jamierocks.lexteam.ygd.core.tool;

/**
 * Represents a tool.
 *
 * @author Jamie Mansfield
 */
public class Tool {

    private final String name;
    private final int cooldown;
    private final ToolManipulator manipulator;

    /**
     * Creates a new tool with a set name, cooldown time and manipulator.
     *
     * @param name the new name value.
     * @param cooldown the cooldown time in seconds.
     * @param manipulator the new manipulator value.
     */
    public Tool(String name, int cooldown, ToolManipulator manipulator) {
        this.name = name;
        this.cooldown = cooldown;
        this.manipulator = manipulator;
    }

    /**
     * Gets the tool's name.
     *
     * @return the tool's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the tool's cooldown time.
     *
     * The time should be in seconds.
     *
     * @return the cooldown time in seconds.
     */
    public int getCooldown() {
        return cooldown;
    }

    /**
     * Gets the tool's manipulator.
     *
     * @return the tool's manipulator.
     */
    public ToolManipulator getManipulator() {
        return manipulator;
    }
}
