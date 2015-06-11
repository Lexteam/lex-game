package uk.jamierocks.lexteam.ygd.core.util.event.provider;

/**
 * Base provider event.
 *
 * @author Jamie Mansfield
 */
public class ProviderBaseEvent {

    private final Class<?> providerClass;
    private final Object provider;

    public ProviderBaseEvent(Class<?> providerClass, Object provider) {
        this.providerClass = providerClass;
        this.provider = provider;
    }

    public Class<?> getProviderClass() {
        return providerClass;
    }

    public Object getProvider() {
        return provider;
    }
}
