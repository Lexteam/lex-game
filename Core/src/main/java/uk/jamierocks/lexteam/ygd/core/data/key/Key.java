package uk.jamierocks.lexteam.ygd.core.data.key;

import uk.jamierocks.lexteam.ygd.core.data.value.Value;

public interface Key<V extends Value<?>> {

    Class<V> getValueClass();
}
