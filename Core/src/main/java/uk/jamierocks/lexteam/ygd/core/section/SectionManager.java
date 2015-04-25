package uk.jamierocks.lexteam.ygd.core.section;

import java.util.Set;

/**
 * The manager for {@link Section}s
 *
 * @author Jamie Mansfield
 */
public interface SectionManager {

    /**
     * Gets all the registered {@link Section}s
     *
     * @return all the registered {@link Section}s
     */
    Set<Section> getSections();

    /**
     * Registers a {@link Section}/multiple {@link Section}s
     *
     * @param sections the {@link Section}s to register
     */
    void registerSection(Section... sections);
}
