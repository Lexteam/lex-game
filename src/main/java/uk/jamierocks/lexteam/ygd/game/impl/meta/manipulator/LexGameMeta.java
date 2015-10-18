package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.GameMeta;

import java.io.File;

/**
 * The meta implementation of {@link GameMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexGameMeta implements GameMeta {

    private Logger logger;
    private File directory;

    public LexGameMeta(Logger logger, File directory) {
        this.logger = logger;
        this.directory = directory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logger logger() {
        return this.logger;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File directory() {
        return this.directory;
    }
}
