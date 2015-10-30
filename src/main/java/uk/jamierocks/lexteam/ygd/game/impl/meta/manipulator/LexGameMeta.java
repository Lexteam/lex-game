/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator;

import org.slf4j.Logger;
import uk.jamierocks.lexteam.ygd.core.meta.MetaContainer;
import uk.jamierocks.lexteam.ygd.core.meta.Queries;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.GameMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.LexMetaContainer;
import uk.jamierocks.lexteam.ygd.game.impl.meta.utils.MetaConstants;

import java.io.File;

/**
 * The meta implementation of {@link GameMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexGameMeta extends AbstractMeta implements GameMeta {

    private Logger logger;
    private File directory;

    public LexGameMeta(Logger logger, File directory) {
        this.logger = logger;
        this.directory = directory;
        this.registerGettersAndSetters();
    }

    public LexGameMeta() {
        this(MetaConstants.DEFAULT_GAME_LOGGER, MetaConstants.DEFAULT_GAME_DIRECTORY);
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

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void setDirectory(File directory) {
        this.directory = directory;
    }

    @Override
    protected void registerGettersAndSetters() {
        this.registerGetter(Keys.GAME_LOGGER, LexGameMeta.this::logger);
        this.registerSetter(Keys.GAME_LOGGER, LexGameMeta.this::setLogger);

        this.registerGetter(Keys.GAME_DIRECTORY, LexGameMeta.this::directory);
        this.registerSetter(Keys.GAME_DIRECTORY, LexGameMeta.this::setDirectory);
    }

    @Override
    public MetaContainer toContainer() {
        return new LexMetaContainer()
                .set(Queries.LOGGER, this.logger)
                .set(Queries.DIRECTORY, this.directory);
    }
}
