/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.service;

import java.util.Optional;

/**
 * Represents the service manager.
 * The service manager stores services, and is able to map them to a provider upon request.
 *
 * @author Jamie Mansfield
 */
public interface ServiceManager {

    /**
     * Sets the given service to be provided with the given provider.
     * The type of the given provider is also registered for convenience.
     *
     * @param service the service you wish to map to the given provider.
     * @param provider the provider you wish to be mapped to the given service.
     * @param <T> the type of the provider.
     * @throws ProviderExistsException if the given service has already been mapped to a provider.
     */
    <T> void setProvider(Class<T> service, T provider) throws ProviderExistsException;

    /**
     * Gets the provider for the given service.
     *
     * @param service the service you wish to receive a provider for.
     * @param <T> the type of the provider.
     * @return {@link Optional#empty()} if no provider exists for the requested service,
     *         else {@link Optional#of(Object)} of the provider.
     */
    <T> Optional<T> provide(Class<T> service);
}
