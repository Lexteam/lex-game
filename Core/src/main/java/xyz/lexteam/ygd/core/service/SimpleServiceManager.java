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
