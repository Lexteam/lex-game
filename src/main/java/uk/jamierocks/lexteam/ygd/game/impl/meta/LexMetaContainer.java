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

    private Map<String, Object> queries = Maps.newHashMap();

    @Override
    public boolean contains(MetaQuery query) {
        return this.queries.containsKey(query.getName());
    }

    @Override
    public Optional<Object> get(MetaQuery query) {
        if (this.contains(query)) {
            return Optional.of(this.queries.get(query.getName()));
        }
        return Optional.empty();
    }

    @Override
    public MetaContainer set(MetaQuery query, Object value) {
        this.queries.put(query.getName(), value);
        return this;
    }
}
