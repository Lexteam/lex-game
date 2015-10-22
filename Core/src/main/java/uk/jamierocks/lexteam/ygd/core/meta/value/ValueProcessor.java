package uk.jamierocks.lexteam.ygd.core.meta.value;

import uk.jamierocks.lexteam.ygd.core.meta.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;

import java.util.Optional;

public interface ValueProcessor<E, V extends Value<E>> {

    Key<? extends Value<E>> getKey();

    boolean supports(MetaOwner container);

    boolean offer(MetaOwner container, E value);

    Optional<E> getValueFromContainer(MetaOwner container);
}

