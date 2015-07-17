package uk.jamierocks.lexteam.ygd.core.util.provider.save;

import uk.jamierocks.lexteam.ygd.core.provider.save.SaveService;

import java.io.File;

/**
 * The default implementation of {@link SaveService}
 *
 * @author Jamie Mansfield
 */
public class DefaultSaveService implements SaveService {

    private File saveDir = new File("saves/");

    @Override
    public File getSaveDir() {
        return saveDir;
    }
}
