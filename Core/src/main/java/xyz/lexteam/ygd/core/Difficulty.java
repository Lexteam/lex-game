/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
