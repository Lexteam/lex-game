package uk.jamierocks.lexteam.ygd.core.section;

import com.google.common.base.Preconditions;
import uk.jamierocks.lexteam.ygd.core.level.Level;

import java.util.HashSet;
import java.util.Set;

/**
 * Builder to create a {@link Section}
 *
 * @author Jamie Mansfield
 */
public class SectionBuilder {

    private Section section;

    public SectionBuilder() {
        section = new CreatedSection();
    }

    public SectionBuilder addLevel(Level... levels) {
        section.addLevel(levels);
        return this;
    }

    public Section build() {
        return section;
    }

    /**
     * Basic Section structure
     *
     * @author Jamie Mansfield
     */
    private class CreatedSection implements Section {

        private final Set<Level> levels;

        /**
         * Creates an empty {@link Section}
         */
        public CreatedSection() {
            levels = new HashSet<>();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Set<Level> getLevels() {
            return levels;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void addLevel(Level... levels) {
            for (Level level : Preconditions.checkNotNull(levels)) {
                this.levels.add(Preconditions.checkNotNull(level));
            }
        }
    }
}
