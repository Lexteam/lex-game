package uk.jamierocks.lexteam.ygd.core.provider.save;

import uk.jamierocks.lexteam.ygd.core.save.Save;

import java.io.File;

/**
 * The {@link Save} service
 *
 * @author Jamie Mansfield
 */
public interface SaveService {

    /**
     * The directory containing all the saves.
     *
     * A save is stored within a directory, containing a save.json file.
     *
     * @return the save directory.
     */
    File getSaveDir();
}
