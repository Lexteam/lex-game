package uk.jamierocks.lexteam.ygd.core.data.value;

import uk.jamierocks.lexteam.ygd.core.data.DataContainer;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;

import java.util.Optional;

public interface ValueProcessor<E, V extends Value<E>> {

    Key<? extends Value<E>> getKey();

    boolean supports(DataContainer container);

    Optional<E> getValueFromContainer(DataContainer container);
}