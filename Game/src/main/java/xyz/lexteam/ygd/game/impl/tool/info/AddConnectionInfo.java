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
package xyz.lexteam.ygd.game.impl.tool.info;

import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.core.tool.Tools;
import xyz.lexteam.meta.api.MetaHolder;

/**
 * This is the {@link MetaHolder} implementation for {@link Tools#ADD_CONNECTION}.
 *
 * @author Jamie Mansfield
 */
public class AddConnectionInfo implements MetaHolder {

    private Direction to;
    private Direction from;

    public AddConnectionInfo(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    public Direction getTo() {
        return to;
    }

    public void setTo(Direction to) {
        this.to = to;
    }

    public Direction getFrom() {
        return from;
    }

    public void setFrom(Direction from) {
        this.from = from;
    }
}
