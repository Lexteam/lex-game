package uk.jamierocks.lexteam.ygd.core.meta.api.value;

import uk.jamierocks.lexteam.ygd.core.meta.api.key.Key;

import java.util.Optional;

public interface ValueProcessor<E, V extends Value<E>> {

    Key<? extends Value<E>> getKey();

    boolean supports(ValueOwner container);

    Optional<E> getValueFromContainer(ValueOwner container);
}

