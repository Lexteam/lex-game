package uk.jamierocks.lexteam.ygd.core.data.value;

public interface Value<V> {

    V get();

    boolean isPresent();
}
