/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.processor.tool;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.tool.LexToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.processor.AbstractMetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.tool.AddConnectionInfo;

import java.util.Optional;

public class ToolAddConnectionMetaProcessor extends AbstractMetaProcessor<ToolAddConnectionMeta> {

    public ToolAddConnectionMetaProcessor() {
        super(ToolAddConnectionMeta.class);
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof AddConnectionInfo;
    }

    @Override
    public Optional<ToolAddConnectionMeta> getMetaFromContainer(MetaOwner container) {
        if (container instanceof AddConnectionInfo) {
            AddConnectionInfo info = (AddConnectionInfo) container;
            return Optional.of(new LexToolAddConnectionMeta(info.getTo(), info.getFrom()));
        }
        return Optional.empty();
    }
}
