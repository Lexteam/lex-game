package uk.jamierocks.lexteam.ygd.core.service;

import com.google.common.base.Preconditions;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SimpleServiceManager implements ServiceManager {

    private final ConcurrentMap<Class<?>, Object> providers = new ConcurrentHashMap();

    @Override
    public <T> void setProvider(Class<T> service, T provider) throws ProviderExistsException {
        Preconditions.checkNotNull(service, "service");
        Preconditions.checkNotNull(provider, "provider");

        if (!this.providers.containsKey(service) && !this.providers.containsKey(provider.getClass())) {
            this.providers.put(service, provider);
            this.providers.put(provider.getClass(), provider);
        } else {
            throw new ProviderExistsException();
        }
    }

    @Override
    public <T> Optional<T> provide(Class<T> service) {
        Preconditions.checkNotNull(service, "service");
        T provider = (T) this.providers.get(service);
        return provider != null ? Optional.of(provider) : Optional.empty();
    }
}
