/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolDirectionMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolDirectionMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.AbstractMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;

import java.util.Optional;

public class ToolDirectionMetaProcessor extends AbstractMetaProcessor<ToolDirectionMeta> {

    public ToolDirectionMetaProcessor() {
        super(ToolDirectionMeta.class);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public Optional<ToolDirectionMeta> getMetaFromContainer(MetaOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo info = (AddConnectionInfo) container;
            return Optional.of(new LexToolDirectionMeta(info.getTo(), info.getFrom()));
        }
        return Optional.empty();
    }
}
