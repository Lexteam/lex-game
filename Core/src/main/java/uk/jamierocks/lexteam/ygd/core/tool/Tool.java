package uk.jamierocks.lexteam.ygd.core.tool;

public class Tool {

    private final String name;
    private final ToolManipulator manipulator;

    public Tool(String name, ToolManipulator manipulator) {
        this.name = name;
        this.manipulator = manipulator;
    }

    public String getName() {
        return name;
    }

    public ToolManipulator getManipulator() {
        return manipulator;
    }
}
