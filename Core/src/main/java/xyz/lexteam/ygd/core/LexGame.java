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
package xyz.lexteam.ygd.core;

import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import xyz.lexteam.ygd.core.service.ServiceManager;

import java.io.File;

/**
 * Static access to {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class LexGame {

    private static final Game GAME = null;

    public static Game getGame() {
        Preconditions.checkNotNull(GAME, "Game not yet initialised!");
        return GAME;
    }

    /**
     * @see Game#getServiceManager()
     */
    public static ServiceManager getServiceManager() {
        return GAME.getServiceManager();
    }

    /**
     * @see Game#getSettings()
     */
    public static GameSettings getSettings() {
        return GAME.getSettings();
    }

    /**
     * @see Game#getLogger()
     */
    public static Logger getLogger() {
        return GAME.getLogger();
    }

    /**
     * @see Game#getDirectory()
     */
    public static File getDirectory() {
        return GAME.getDirectory();
    }
}
