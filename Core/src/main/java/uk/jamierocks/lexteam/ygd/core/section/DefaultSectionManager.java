package uk.jamierocks.lexteam.ygd.core.section;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * The default {@link SectionManager}
 *
 * @author Jamie Mansfield
 */
public class DefaultSectionManager implements SectionManager {

    private final Set<Section> sections = Sets.newHashSet();

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Section> getSections() {
        return sections;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerSection(Section... sections) {
        for (Section section : Preconditions.checkNotNull(sections)) {
            this.sections.add(Preconditions.checkNotNull(section));
        }
    }
}
