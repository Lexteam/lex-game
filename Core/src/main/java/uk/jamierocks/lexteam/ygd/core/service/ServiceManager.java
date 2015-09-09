package uk.jamierocks.lexteam.ygd.core.service;

import java.util.Optional;

public interface ServiceManager {

    <T> void setProvider(Class<T> service, T provider) throws ProviderExistsException;

    <T> Optional<T> provide(Class<T> service);
}
