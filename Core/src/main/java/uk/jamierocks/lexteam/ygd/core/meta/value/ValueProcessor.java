package uk.jamierocks.lexteam.ygd.core.meta.value;

import uk.jamierocks.lexteam.ygd.core.meta.key.Key;

import java.util.Optional;

public interface ValueProcessor<E, V extends Value<E>> {

    Key<? extends Value<E>> getKey();

    boolean supports(ValueOwner container);

    boolean offer(ValueOwner container, E value);

    Optional<E> getValueFromContainer(ValueOwner container);
}

