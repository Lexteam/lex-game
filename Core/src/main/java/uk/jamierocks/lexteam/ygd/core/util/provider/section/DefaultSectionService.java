package uk.jamierocks.lexteam.ygd.core.util.provider.section;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import uk.jamierocks.lexteam.ygd.core.provider.section.SectionService;
import uk.jamierocks.lexteam.ygd.core.section.Section;

import java.util.Set;

/**
 * The default implementation of {@link SectionService}
 *
 * @author Jamie Mansfield
 */
public class DefaultSectionService implements SectionService {

    private Set<Section> sections = Sets.newHashSet();

    public Set<Section> getSections() {
        return sections;
    }

    public void registerSection(Section... sections) {
        for (Section section : Preconditions.checkNotNull(sections)) {
            this.sections.add(Preconditions.checkNotNull(section));
        }
    }
}
