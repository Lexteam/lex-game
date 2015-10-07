package uk.jamierocks.lexteam.ygd.core.meta;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.meta.api.Meta;

import java.io.File;

/**
 * Meta for {@link Game}.
 *
 * @author Jamie Mansfield
 */
public interface GameMeta extends Meta {

    /**
     * Gets the game's logger.
     *
     * @return the game's {@link Logger}.
     */
    Logger getLogger();

    /**
     * Gets the game's directory.
     *
     * @return the game's {@link File}.
     */
    File getDirectory();
}
