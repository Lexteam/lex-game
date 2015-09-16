package uk.jamierocks.lexteam.ygd.core.section;

import uk.jamierocks.lexteam.ygd.core.Difficulty;
import uk.jamierocks.lexteam.ygd.core.section.level.Level;

import java.util.Set;

/**
 * Represents a section, with a name and difficulty
 *
 * @author Tom Drever
 */
public class Section {
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
     * The Section's name
     */
    private String name;
    /**
     * Gets the name
     *
     * @return name String name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     *
     * @param name the new name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The Section's difficulty
     */
    private Difficulty difficulty;

    /**
     * Gets the difficulty
     *
     * @return Difficulty difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty
     *
     * @param difficulty the new difficulty value
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * The levels in the section
     */
    private Set<Level> levels;

    /**
     * Gets the levels
     *
     * @return Set<Level> levels
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
