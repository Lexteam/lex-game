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

import org.slf4j.Logger;
import xyz.lexteam.ygd.core.service.ServiceManager;

import java.io.File;

/**
 * The game reference - This will be the central place for most actions.
 *
 * @author Jamie Mansfield
 */
public interface Game {

    String VERSION = "%project.version%";

    /**
     * Gets the game's service manager.
     *
     * @return the {@link ServiceManager}.
     */
    ServiceManager getServiceManager();

    /**
     * Gets the user defined game settings.
     *
     * @return the {@link GameSettings}.
     */
    GameSettings getSettings();

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
