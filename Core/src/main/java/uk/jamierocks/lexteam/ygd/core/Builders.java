package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.level.LevelBuilder;
import uk.jamierocks.lexteam.ygd.core.object.tool.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.section.SectionBuilder;

/**
 * Class to create new builders fast.
 *
 * @author Jamie Mansfield
 */
public final class Builders {

    /**
     * Constructs a new {@link LevelBuilder}
     *
     * @return new level builder
     */
    public static LevelBuilder newLevelBuilder() {
        return new LevelBuilder();
    }

    /**
     * Constructs a new {@link LevelBuilder}, with the connections supplied.
     *
     * @param connections the supplied connections.
     * @return new level builder with the connections supplied
     */
    public static LevelBuilder newLevelBuilder(Connection... connections) {
        return newLevelBuilder().connection(connections);
    }

    /**
     * Constructs a {@link SectionBuilder}
     *
     * @return new section builder
     */
    public static SectionBuilder newSectionBuilder() {
        return new SectionBuilder();
    }

    /**
     * Constructs a new {@link SectionBuilder}, with the levels supplied.
     *
     * @param levels the supplied levels.
     * @return new section builder with the levels supplied
     */
    public static SectionBuilder newSectionBuilder(Level... levels) {
        return newSectionBuilder().level(levels);
    }

}
