/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.service;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Optional;

/**
 * The simple implementation of {@link ServiceManager}.
 *
 * @author Jamie Mansfield
 */
public class SimpleServiceManager implements ServiceManager {

    private final Map<Class<?>, Object> providers = Maps.newConcurrentMap();

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> void setProvider(Class<T> service, T provider) throws ProviderExistsException {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(provider);

        if (!this.providers.containsKey(service) && !this.providers.containsKey(provider.getClass())) {
            this.providers.put(service, provider);
            this.providers.put(provider.getClass(), provider);
        } else {
            throw new ProviderExistsException();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> Optional<T> provide(Class<T> service) {
        Preconditions.checkNotNull(service);
        T provider = (T) this.providers.get(service);
        return provider != null ? Optional.of(provider) : Optional.empty();
    }
}
