package uk.jamierocks.lexteam.ygd.core.section;

import uk.jamierocks.lexteam.ygd.core.Difficulty;

/**
 * @author Tom
 */
public class Section {
    public Section(String name, Difficulty difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Difficulty difficulty;
    public Difficulty getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
