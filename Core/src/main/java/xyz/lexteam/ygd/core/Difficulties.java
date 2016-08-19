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

import xyz.lexteam.ygd.core.tool.Tools;

/**
 * Static access to all the difficulties within the game.
 *
 * @author Jamie Mansfield
 */
public final class Difficulties {

    public static final Difficulty LOWEST = new Difficulty(Tools.REVERSE_CONNECTION, Tools.WEAK_REPAIR_PANEL);

    public static final Difficulty LOW = new Difficulty(LOWEST, Tools.ADD_CONNECTION);

    public static final Difficulty EASY = new Difficulty(LOW, Tools.REMOVE_CONNECTION);

    public static final Difficulty MEDIUM = new Difficulty(EASY, Tools.CHANGE_DURATION);

    public static final Difficulty HARD =
            new Difficulty(Tools.REVERSE_CONNECTION, Tools.STRONG_REPAIR_PANEL, Tools.ADD_CONNECTION,
                    Tools.REMOVE_CONNECTION, Tools.CHANGE_DURATION);

    public static final Difficulty HIGH = new Difficulty(HARD);

    public static final Difficulty HIGHEST = new Difficulty(HIGH);
}
