package uk.jamierocks.lexteam.ygd.core.meta.manipulator;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.Game;

import java.io.File;

/**
 * Meta for {@link Game}.
 *
 * @author Jamie Mansfield
 */
public interface GameMeta extends MetaManipulator {

    /**
     * Gets the game's logger.
     *
     * @return the game's {@link Logger}.
     */
    Logger logger();

    /**
     * Gets the game's directory.
     *
     * @return the game's {@link File}.
     */
    File directory();
}
