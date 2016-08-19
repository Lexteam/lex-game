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
package xyz.lexteam.ygd.game.impl.meta.manipulator.tool;

import xyz.lexteam.ygd.core.meta.Queries;
import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.game.impl.meta.utils.MetaConstants;
import xyz.lexteam.meta.api.MetaContainer;
import xyz.lexteam.meta.impl.LexMetaContainer;
import xyz.lexteam.meta.impl.manipulator.AbstractMeta;

/**
 * The meta implementation of {@link ToolAddConnectionMeta}.
 *
 * @author Jamie Mansfield
 */
public class LexToolAddConnectionMeta extends AbstractMeta implements ToolAddConnectionMeta {

    private Direction to;
    private Direction from;

    public LexToolAddConnectionMeta(Direction to, Direction from) {
        this.to = to;
        this.from = from;
        this.registerGettersAndSetters();
    }

    public LexToolAddConnectionMeta() {
        this(MetaConstants.DEFAULT_TOOL_DIRECTION_TO, MetaConstants.DEFAULT_TOOL_DIRECTION_FROM);
    }

    @Override
    public Direction to() {
        return this.to;
    }

    @Override
    public Direction from() {
        return this.from;
    }

    public void setTo(Direction to) {
        this.to = to;
    }

    public void setFrom(Direction from) {
        this.from = from;
    }

    @Override
    protected void registerGettersAndSetters() {
        this.registerGetter(Keys.TOOL_DIRECTION_TO, LexToolAddConnectionMeta.this::to);
        this.registerSetter(Keys.TOOL_DIRECTION_TO, LexToolAddConnectionMeta.this::setTo);

        this.registerGetter(Keys.TOOL_DIRECTION_FROM, LexToolAddConnectionMeta.this::from);
        this.registerSetter(Keys.TOOL_DIRECTION_FROM, LexToolAddConnectionMeta.this::setFrom);
    }

    @Override
    public MetaContainer toContainer() {
        return new LexMetaContainer()
                .set(Queries.DIRECTION_TO, this.to)
                .set(Queries.DIRECTION_FROM, this.from);
    }
}
