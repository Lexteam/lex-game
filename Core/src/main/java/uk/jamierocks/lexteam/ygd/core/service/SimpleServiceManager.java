/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.service;

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
