/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.MetaHolder;
import uk.jamierocks.lexteam.ygd.core.meta.key.Keys;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.AbstractMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.info.ChangeDurationInfo;

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
    public Optional<ToolChangeDurationMeta> getMetaFromContainer(MetaHolder container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo info = (ChangeDurationInfo) container;
            return Optional.of(new LexToolChangeDurationMeta(info.getDuration()));
        }
        return Optional.empty();
    }
}
