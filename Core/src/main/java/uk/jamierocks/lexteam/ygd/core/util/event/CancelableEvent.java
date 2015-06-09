package uk.jamierocks.lexteam.ygd.core.util.event;

public interface CancelableEvent {

    boolean isCanceled();

    void setCanceled(boolean cancel);
}
