package uk.jamierocks.lexteam.ygd.core;

import com.google.common.collect.Lists;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

import java.util.List;

public enum Difficulty {

    LOWEST(Tools.REVERSE_CONNECTION, Tools.WEAK_REPAIR_PANEL),
    LOW(LOWEST, Tools.ADD_CONNECTION),
    EASY(LOW, Tools.REMOVE_CONNECTION),
    MEDIUM(EASY, Tools.CHANGE_DURATION),
    HARD(Tools.REVERSE_CONNECTION, Tools.STRONG_REPAIR_PANEL, Tools.ADD_CONNECTION, Tools.REMOVE_CONNECTION,  Tools.CHANGE_DURATION),
    HIGH(HARD),
    HIGHEST(HIGH);

    private final List<Tool> tools;

    Difficulty(Difficulty difficulty, Tool... tools) {
        this.tools = Lists.newArrayList(difficulty.getTools());
        for (Tool tool : tools) {
            this.tools.add(tool);
        }
    }

    Difficulty(Tool... tools) {
        this.tools = Lists.newArrayList(tools);
    }

    public List<Tool> getTools() {
        return this.tools;
    }
}
