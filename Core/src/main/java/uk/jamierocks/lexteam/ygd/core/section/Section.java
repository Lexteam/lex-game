package uk.jamierocks.lexteam.ygd.core.section;

import uk.jamierocks.lexteam.ygd.core.Difficulty;

/**
 * Represents a section, with a name and difficulty
 * @author Tom
 */
public class Section {
    /**
     * Creates a new Section
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
     * @return name String name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
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
     * @return Difficulty difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty
     * @param difficulty the new difficulty value
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
