package uk.jamierocks.lexteam.ygd.core.event.provider;

import uk.jamierocks.lexteam.ygd.core.util.event.CancelableEvent;
import uk.jamierocks.lexteam.ygd.core.util.event.provider.ProviderBaseEvent;

public class RegisterProviderEvent extends ProviderBaseEvent implements CancelableEvent {

    private boolean canceled;

    public RegisterProviderEvent(Class<?> providerClass, Object provider) {
        super(providerClass, provider);
    }

    @Override
    public boolean isCanceled() {
        return canceled;
    }

    @Override
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
