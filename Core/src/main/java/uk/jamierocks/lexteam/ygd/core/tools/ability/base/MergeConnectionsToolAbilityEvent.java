package uk.jamierocks.lexteam.ygd.core.tools.ability.base;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.tools.ability.MultipleConnectionToolAbilityBaseEvent;

/**
 * Created by Tom
 */
public class MergeConnectionsToolAbilityEvent extends MultipleConnectionToolAbilityBaseEvent {
    public MergeConnectionsToolAbilityEvent(Level level, Connection connectionOne, Connection connectionTwo){
        super(level, connectionOne, connectionTwo);
    }
}
