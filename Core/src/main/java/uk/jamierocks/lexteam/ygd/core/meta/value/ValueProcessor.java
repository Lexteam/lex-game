package uk.jamierocks.lexteam.ygd.core.meta.value;

import uk.jamierocks.lexteam.ygd.core.meta.MetaHolder;
import uk.jamierocks.lexteam.ygd.core.meta.key.Key;

import java.util.Optional;

public interface ValueProcessor<E, V extends Value<E>> {

    Key<? extends Value<E>> getKey();

    boolean supports(MetaHolder container);

    boolean offer(MetaHolder container, E value);

    Optional<E> getValueFromContainer(MetaHolder container);
}

