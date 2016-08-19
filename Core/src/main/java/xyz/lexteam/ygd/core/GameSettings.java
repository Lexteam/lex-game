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

import ninja.leaping.configurate.ConfigurationNode;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;

import java.io.File;
import java.io.IOException;

/**
 * A HOCON serialized settings file for lex-game.
 *
 * @author Jamie Mansfield
 */
public class GameSettings {

    private final Game game;
    private final ConfigurationLoader<CommentedConfigurationNode> loader;
    private final ConfigurationNode rootNode;

    /**
     * Resolution
     */
    private int resolutionWidth;
    private int resolutionHeight;

    public GameSettings(Game game, File configFile, String defaultFile) {
        this.game = game;

        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            try {
                configFile.createNewFile();
            } catch (IOException e) {
            }
        }

        this.loader = HoconConfigurationLoader.builder().setFile(configFile).build();

        ConfigurationNode rootNode = null;
        try {
            rootNode = this.loader.load();
            if (defaultFile != null && !defaultFile.isEmpty()) {
                rootNode.mergeValuesFrom(HoconConfigurationLoader.builder()
                        .setURL(Game.class.getResource(defaultFile)).build().load());
            }
        } catch (IOException e) {
            game.getLogger().error("Error loading root node", e);
        }

        this.rootNode = rootNode;
        this.save();

        // Resolution
        /////////////
        this.resolutionWidth = rootNode.getNode("resolution", "width").getInt();
        this.resolutionHeight = rootNode.getNode("resolution", "height").getInt();
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public void save() {
        try {
            this.loader.save(this.rootNode);
        } catch (IOException e) {
            game.getLogger().error("Error saving root node", e);
        }
    }
}
