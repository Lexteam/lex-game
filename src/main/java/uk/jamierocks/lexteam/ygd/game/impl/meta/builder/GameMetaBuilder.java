/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta.builder;

import uk.jamierocks.lexteam.ygd.core.meta.builder.MetaManipulatorBuilder;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.GameMeta;
import uk.jamierocks.lexteam.ygd.game.impl.meta.manipulator.LexGameMeta;

/**
 * The builder implementation for {@link GameMeta}.
 *
 * @author Jamie Mansfield
 */
public class GameMetaBuilder implements MetaManipulatorBuilder<GameMeta> {

    /**
     * {@inheritDoc}
     */
    @Override
    public GameMeta create() {
        return new LexGameMeta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<GameMeta> getType() {
        return GameMeta.class;
    }
}
