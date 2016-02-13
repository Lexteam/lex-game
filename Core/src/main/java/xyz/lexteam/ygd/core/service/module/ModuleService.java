/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
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
