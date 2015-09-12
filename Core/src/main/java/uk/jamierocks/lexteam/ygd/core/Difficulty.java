package uk.jamierocks.lexteam.ygd.core;

import com.google.common.collect.Lists;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

import java.util.List;

public enum Difficulty {

    LOW(Tools.REVERSE_CONNECTION, Tools.ADD_CONNECTION, Tools.REMOVE_CONNECTION),
    MEDIUM(Tools.REVERSE_CONNECTION, Tools.ADD_CONNECTION, Tools.REMOVE_CONNECTION),
    HARD(Tools.REVERSE_CONNECTION, Tools.ADD_CONNECTION, Tools.REMOVE_CONNECTION, Tools.CHANGE_DURATION);

    private final List<Tool> tools;

    Difficulty(Tool... tools) {
        this.tools = Lists.newArrayList(tools);
    }

    public List<Tool> getTools() {
        return tools;
    }
}
