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
package xyz.lexteam.ygd.core.service.module;

import xyz.lexteam.ygd.core.module.ModuleContainer;

import java.io.File;
import java.util.Set;

/**
 * The module service.
 *
 * @author Jamie Mansfield
 */
public interface ModuleService {

    /**
     * Loads all the modules from the given directory.
     *
     * @param directory The directory.
     */
    void loadModules(File directory);

    /**
     * Enables all the loaded modules.
     */
    void enableModules();

    /**
     * Gets all the loaded modules.
     *
     * @return The loaded modules.
     */
    Set<ModuleContainer> getModules();
}
