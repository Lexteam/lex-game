package uk.jamierocks.lexteam.ygd.core.section;

import com.google.common.base.Preconditions;
import uk.jamierocks.lexteam.ygd.core.level.Level;

import java.util.HashSet;
import java.util.Set;

/**
 * Factory to create a {@link Section}
 *
 * @author Jamie Mansfield
 */
public class SectionFactory {

    /**
     * Creates a populated {@link Section}
     *
     * @param levels the initial levels
     * @return the created {@link Section}
     */
    public Section createPopulatedSection(Set<Level> levels) {
        return new CreatedSection(levels);
    }

    /**
     * Creates an empty {@link Section}
     *
     * @return an empty {@link Section}
     */
    public Section createEmptySection() {
        return new CreatedSection();
    }

    /**
     * Basic Section structure
     *
     * @author Jamie Mansfield
     */
    private class CreatedSection implements Section {

        private Set<Level> levels;

        public CreatedSection() {
            levels = new HashSet<>();
        }

        public CreatedSection(Set<Level> levels) {
            this.levels = levels;
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
