package uk.jamierocks.lexteam.ygd.core;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.level.LevelBuilder;
import uk.jamierocks.lexteam.ygd.core.object.tool.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.section.SectionBuilder;

/**
 * Class to create builders easier and with less code.
 *
 * This class is able to minimise the amount of code it takes to create builders.
 *
 * @author Jamie Mansfield
 */
public final class Builders {

    /**
     * Constructs a new {@link LevelBuilder}.
     *
     * @return a new level builder
     */
    public static LevelBuilder newLevelBuilder() {
        return new LevelBuilder();
    }

    /**
     * Constructs a new {@link LevelBuilder}, with the connections supplied.
     *
     * @param connections the supplied connections.
     * @return a new level builder with the connections supplied
     */
    public static LevelBuilder newLevelBuilder(Connection... connections) {
        return newLevelBuilder().connection(connections);
    }

    /**
     * Constructs a {@link SectionBuilder}.
     *
     * @return a new section builder
     */
    public static SectionBuilder newSectionBuilder() {
        return new SectionBuilder();
    }

    /**
     * Constructs a new {@link SectionBuilder}, with the levels supplied.
     *
     * @param levels the supplied levels.
     * @return a new section builder with the levels supplied
     */
    public static SectionBuilder newSectionBuilder(Level... levels) {
        return newSectionBuilder().level(levels);
    }
}
