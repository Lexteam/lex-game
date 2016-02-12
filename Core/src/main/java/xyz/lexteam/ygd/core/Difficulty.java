/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core;

import com.google.common.collect.Sets;
import xyz.lexteam.ygd.core.section.level.Level;
import xyz.lexteam.ygd.core.tool.Tool;

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
