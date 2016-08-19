/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.lexteam.ygd.game.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.utils.IApplication;
import xyz.lexteam.ygd.core.Game;
import xyz.lexteam.ygd.core.GameSettings;
import xyz.lexteam.ygd.core.service.ServiceManager;
import xyz.lexteam.ygd.core.service.SimpleServiceManager;

import java.io.File;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame implements IApplication, Game {

    private final ServiceManager serviceManager = new SimpleServiceManager();
    private final GameSettings gameSettings = new GameSettings(this,
                    new File(getDirectory(), "settings.conf"), "/settings.conf");

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "lex-game";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File getDirectory() {
        File directory = new File(LEXTEAM_BASE_DIRECTORY, getSafeName());
        if (!directory.exists()) {
            directory.mkdirs();
        }
        return directory;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Logger getLogger() {
        return LoggerFactory.getLogger(getSafeName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceManager getServiceManager() {
        return this.serviceManager;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GameSettings getSettings() {
        return this.gameSettings;
    }
}
