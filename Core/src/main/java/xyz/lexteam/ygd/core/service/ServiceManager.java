/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.lexteam.ygd.core.service;

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
