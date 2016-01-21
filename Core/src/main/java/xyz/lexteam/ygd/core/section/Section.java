/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
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
