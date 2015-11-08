/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.service.meta;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.meta.builder.MetaManipulatorBuilder;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;
import uk.jamierocks.lexteam.ygd.core.service.meta.IMetaService;

import java.util.Map;

/**
 * The implementation of {@link IMetaService}.
 *
 * @author Jamie Mansfield
 */
public class GameMetaService implements IMetaService {

    public final Map<Class<?>, MetaManipulatorBuilder<?>> builders = Maps.newHashMap();

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends MetaManipulator> MetaManipulatorBuilder<T> getMetaManipulatorBuilder(Class<T> clazz) {
        return (MetaManipulatorBuilder<T>) this.builders.get(clazz);
    }

    public void registerManipulatorBuilder(MetaManipulatorBuilder manipulatorBuilder) {
        this.builders.put(manipulatorBuilder.getType(), manipulatorBuilder);
    }
}
