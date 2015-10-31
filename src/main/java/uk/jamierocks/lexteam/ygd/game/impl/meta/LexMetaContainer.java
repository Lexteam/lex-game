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
import java.util.Set;
import java.util.stream.Collectors;

public class LexMetaContainer implements MetaContainer {

    private Map<String, Object> queries = Maps.newHashMap();

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<MetaQuery> getQueries() {
        return this.queries.keySet().stream().map(MetaQuery::of).collect(Collectors.toSet());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<MetaQuery, Object> getValues() {
        Map<MetaQuery, Object> values = Maps.newHashMap();
        for (MetaQuery query : this.getQueries()) {
            values.put(query, this.queries.get(query));
        }
        return values;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains(MetaQuery query) {
        return this.queries.containsKey(query.getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Object> get(MetaQuery query) {
        if (this.contains(query)) {
            return Optional.of(this.queries.get(query.getName()));
        }
        return Optional.empty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetaContainer set(MetaQuery query, Object value) {
        this.queries.put(query.getName(), value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(MetaQuery query) {
        this.queries.remove(query.getName());
    }
}
