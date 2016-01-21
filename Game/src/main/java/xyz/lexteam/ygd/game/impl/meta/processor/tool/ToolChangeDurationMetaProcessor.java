/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.impl.meta.processor.tool;

import xyz.lexteam.ygd.core.meta.key.Keys;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
import xyz.lexteam.ygd.game.impl.tool.info.ChangeDurationInfo;
import uk.jamierocks.meta.api.MetaContainer;
import uk.jamierocks.meta.api.MetaHolder;
import uk.jamierocks.meta.impl.processor.AbstractMetaProcessor;

import java.util.Optional;

public class ToolChangeDurationMetaProcessor extends AbstractMetaProcessor<ToolChangeDurationMeta> {

    public ToolChangeDurationMetaProcessor() {
        super(ToolChangeDurationMeta.class);
    }

    @Override
    public boolean supports(MetaHolder container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public boolean apply(MetaHolder owner, ToolChangeDurationMeta manipulator) {
        if (owner instanceof ChangeDurationInfo) {
            ChangeDurationInfo info = (ChangeDurationInfo) owner;

            owner.offer(Keys.TOOL_DURATION, manipulator.duration());

            return info.getDuration() == manipulator.duration();
        }
        return false;
    }

    @Override
    public void apply(MetaContainer container, ToolChangeDurationMeta manipulator) {
        // TODO: implement
    }

    @Override
    public Optional<ToolChangeDurationMeta> getMetaFromContainer(MetaHolder container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo info = (ChangeDurationInfo) container;
            return Optional.of(new LexToolChangeDurationMeta(info.getDuration()));
        }
        return Optional.empty();
    }
}
