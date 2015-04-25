package uk.jamierocks.lexteam.ygd.core.section;

import uk.jamierocks.lexteam.ygd.core.level.Level;

import java.util.Set;

/**
 * Represents a section
 *
 * @author Jamie Mansfield
 * @author Tom Dreverz
 */
public interface Section {

    /**
     * Collection of levels
     *
     * @return all levels
     */
    Set<Level> getLevels();

    /**
     * Adds a level/multiple levels to the Levels collection
     *
     * @param levels the level/s to be added
     */
    void addLevel(Level... levels);
}
