package uk.jamierocks.lexteam.ygd.core.provider.section;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import uk.jamierocks.lexteam.ygd.core.section.Section;

import java.util.Set;

/**
 * The {@link Section} service
 *
 * @author Jamie Mansfield
 */
public class SectionService {

    private Set<Section> sections = Sets.newHashSet();

    /**
     * Gets all the registered {@link Section}s
     *
     * @return all the registered {@link Section}s
     */
    public Set<Section> getSections() {
        return sections;
    }

    /**
     * Registers a {@link Section}/multiple {@link Section}s
     *
     * @param sections the {@link Section}s to register
     */
    public void registerSection(Section... sections) {
        for (Section section : Preconditions.checkNotNull(sections)) {
            this.sections.add(Preconditions.checkNotNull(section));
        }
    }
}
