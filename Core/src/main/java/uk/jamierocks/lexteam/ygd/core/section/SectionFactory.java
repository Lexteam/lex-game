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
    public static Section createPopulatedSection(Set<Level> levels) {
        return new CreatedSection(levels);
    }

    /**
     * Creates an empty {@link Section}
     *
     * @return an empty {@link Section}
     */
    public static Section createEmptySection() {
        return new CreatedSection();
    }

    /**
     * Basic Section structure
     *
     * @author Jamie Mansfield
     */
    private static class CreatedSection implements Section {

        private final Set<Level> levels;

        /**
         * Creates an empty {@link Section}
         */
        public CreatedSection() {
            levels = new HashSet<>();
        }

        /**
         * Creates a populated {@link Section}
         *
         * @param levels the initial levels
         */
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
