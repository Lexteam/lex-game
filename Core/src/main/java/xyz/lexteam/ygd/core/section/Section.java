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
package xyz.lexteam.ygd.core.section;

import xyz.lexteam.ygd.core.Difficulty;
import xyz.lexteam.ygd.core.section.level.Level;

import java.util.Set;

/**
 * Represents a section.
 *
 * @author Tom Drever
 */
public class Section {

    private String name;
    private Difficulty difficulty;
    private Set<Level> levels;

    /**
     * Creates a new Section
     *
     * @param name the name
     * @param difficulty the difficulty
     */
    public Section(String name, Difficulty difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    /**
     * Gets the name of this level.
     *
     * @return the level's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this level.
     *
     * @param name the new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the difficulty of this level.
     *
     * @return the level's difficulty.
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty of this level.
     *
     * @param difficulty the new difficulty.
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets the levels.
     *
     * @return the levels.
     */
    public Set<Level> getLevels() {
        return levels;
    }

    /**
     * Sets the section's levels
     *
     * @param levels the new value for levels
     */
    public void setLevels(Set<Level> levels) {
        this.levels = levels;
    }
}
