package uk.jamierocks.lexteam.ygd.core.tools.ability.base;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.tools.ability.SimpleToolAbilityBaseEvent;

/**
 * Created by Tom
 */
public class ReverseConnectionToolAbilityEvent extends SimpleToolAbilityBaseEvent {
    public ReverseConnectionToolAbilityEvent(Level level, Connection connection){
        super(level, connection);
    }
}
