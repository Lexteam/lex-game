package uk.jamierocks.lexteam.ygd.core.structure.section;

import uk.jamierocks.lexteam.ygd.core.structure.level.Level;

import java.util.Set;

/**
 * Represents a section
 *
 * @author Jamie Mansfield
 * @author Tom Drever
 */
public interface Section {

    /**
     * Collection of {@link Level}s
     *
     * @return all {@link Level}s
     */
    Set<Level> getLevels();

    /**
     * Adds a {@link Level}/multiple {@link Level}s to the {@link Level}s collection
     *
     * @param levels the {@link Level}/s to be added
     */
    void addLevel(Level... levels);
}
