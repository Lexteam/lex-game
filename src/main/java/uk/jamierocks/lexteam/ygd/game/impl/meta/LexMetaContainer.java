/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.meta;

import com.google.common.collect.Maps;
import uk.jamierocks.lexteam.ygd.core.meta.MetaContainer;
import uk.jamierocks.lexteam.ygd.core.meta.MetaQuery;

import java.util.Map;
import java.util.Optional;

public class LexMetaContainer implements MetaContainer {

    private Map<MetaQuery, Object> queries = Maps.newHashMap();

    @Override
    public Optional<Object> get(MetaQuery path) {
        if (this.queries.containsKey(path)) {
            return Optional.of(this.queries.get(path));
        }
        return Optional.empty();
    }

    @Override
    public MetaContainer set(MetaQuery path, Object value) {
        this.queries.put(path, value);
        return this;
    }
}
