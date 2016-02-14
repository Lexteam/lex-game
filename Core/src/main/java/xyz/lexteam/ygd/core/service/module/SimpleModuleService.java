/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
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
