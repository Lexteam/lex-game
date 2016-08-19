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

import com.google.common.collect.Sets;
import xyz.lexteam.ygd.core.event.module.ModulesEnableEvent;
import xyz.lexteam.ygd.core.module.ModuleContainer;
import xyz.lexteam.ygd.core.service.event.Events;

import java.io.File;
import java.io.FileFilter;
import java.util.Set;
import java.util.jar.JarFile;

/**
 * A simple implementation of {@link ModuleService}.
 *
 * @author Jamie Mansfield
 */
public class SimpleModuleService implements ModuleService {

    private Set<ModuleContainer> modules = Sets.newHashSet();

    @Override
    public void loadModules(File directory) {
        for (File f : directory.listFiles(pathname -> {
            return pathname.getName().endsWith(".jar");
        })) {
            // TODO:
        }
    }

    @Override
    public void enableModules() {
        Events.post(new ModulesEnableEvent());
    }

    @Override
    public Set<ModuleContainer> getModules() {
        return this.modules;
    }
}
