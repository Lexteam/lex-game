/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core;

import com.google.common.collect.Sets;
import uk.jamierocks.lexteam.ygd.core.section.level.Level;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a {@link Level}'s difficulty.
 *
 * @author Jamie Mansfield
 */
public class Difficulty {

    private Set<Tool> tools;

    public Difficulty(Tool... tools) {
        this.tools = Sets.newHashSet(tools);
    }

    public Difficulty(Difficulty difficulty, Tool... tools) {
        this.tools = Sets.newHashSet(tools);
        this.tools.addAll(difficulty.tools());
    }

    /**
     * The set of available tools to the player for this difficulty.
     *
     * @return a set of available tools.
     */
    public Set<Tool> tools() {
        return Sets.newHashSet(this.tools);
    }
}
