package uk.jamierocks.lexteam.ygd.core.tool;

/**
 * Represents a tool.
 *
 * @author Jamie Mansfield
 */
public class Tool {

    /**
     * The name of the tool
     */
    private final String name;
    /**
     * The tool's manipulator
     */
    private final ToolManipulator manipulator;

    /**
     * Creates a new tool with a set name and manipulator
     * @param name the new name value
     * @param manipulator the new manipulator value
     */
    public Tool(String name, ToolManipulator manipulator) {
        this.name = name;
        this.manipulator = manipulator;
    }

    /**
     * Gets the tool's name
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the tool's manipulator
     * @return ToolManipulator manipulator
     */
    public ToolManipulator getManipulator() {
        return manipulator;
    }
}
