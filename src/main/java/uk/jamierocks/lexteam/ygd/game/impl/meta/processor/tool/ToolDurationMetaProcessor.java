/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolDurationMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.AbstractMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.ChangeDurationInfo;

import java.util.Optional;

public class ToolDurationMetaProcessor extends AbstractMetaProcessor<ToolDurationMeta> {

    public ToolDurationMetaProcessor() {
        super(ToolDurationMeta.class);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof ChangeDurationInfo;
    }

    @Override
    public Optional<ToolDurationMeta> getMetaFromContainer(MetaOwner container) {
        if (container instanceof ChangeDurationInfo) {
            ChangeDurationInfo info = (ChangeDurationInfo) container;
            return Optional.of(new LexToolDurationMeta(info.getDuration()));
        }
        return Optional.empty();
    }
}
