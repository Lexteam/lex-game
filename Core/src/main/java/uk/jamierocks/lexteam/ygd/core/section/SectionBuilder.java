package uk.jamierocks.lexteam.ygd.core.section;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import uk.jamierocks.lexteam.ygd.core.level.Level;

import java.util.Set;

/**
 * Builder to create a {@link Section}
 *
 * @author Jamie Mansfield
 */
public class SectionBuilder {

    private final Set<Level> levels;

    public SectionBuilder() {
        levels = Sets.newHashSet();
    }

    public SectionBuilder level(Level... levels) {
        for (Level level : Preconditions.checkNotNull(levels)) {
            this.levels.add(Preconditions.checkNotNull(level));
        }
        return this;
    }

    public Section build() {
        return new CreatedSection(levels);
    }

    /**
     * Basic Section structure
     *
     * @author Jamie Mansfield
     */
    private class CreatedSection implements Section {

        private final Set<Level> levels;

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
