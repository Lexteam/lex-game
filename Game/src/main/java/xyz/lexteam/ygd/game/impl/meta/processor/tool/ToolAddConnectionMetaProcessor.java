/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.processor.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolAddConnectionMeta;
import xyz.lexteam.ygd.game.impl.tool.info.AddConnectionInfo;
import uk.jamierocks.meta.api.MetaContainer;
import uk.jamierocks.meta.api.MetaHolder;
import uk.jamierocks.meta.impl.processor.AbstractMetaProcessor;

import java.util.Optional;

public class ToolAddConnectionMetaProcessor extends AbstractMetaProcessor<ToolAddConnectionMeta> {

    public ToolAddConnectionMetaProcessor() {
        super(ToolAddConnectionMeta.class);
    }

    @Override
    public boolean supports(MetaHolder container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public boolean apply(MetaHolder owner, ToolAddConnectionMeta manipulator) {
        if (owner instanceof AddConnectionInfo) {
            AddConnectionInfo info = (AddConnectionInfo) owner;

            info.offer(Keys.TOOL_DIRECTION_TO, manipulator.to());
            info.offer(Keys.TOOL_DIRECTION_TO, manipulator.to());

            return info.getTo() == manipulator.to() &&
                    info.getFrom() == manipulator.from();
        }
        return false;
    }

    @Override
    public void apply(MetaContainer container, ToolAddConnectionMeta manipulator) {
        // TODO: implement
    }

    @Override
    public Optional<ToolAddConnectionMeta> getMetaFromContainer(MetaHolder container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo info = (AddConnectionInfo) container;
            return Optional.of(new LexToolAddConnectionMeta(info.getTo(), info.getFrom()));
        }
        return Optional.empty();
    }
}
