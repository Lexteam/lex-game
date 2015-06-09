package uk.jamierocks.lexteam.ygd.core.provider.section;

import uk.jamierocks.lexteam.ygd.core.section.Section;

import java.util.Set;

/**
 * The {@link Section} service
 *
 * @author Jamie Mansfield
 */
public interface SectionService {

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
