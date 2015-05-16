package uk.jamierocks.lexteam.ygd.core.tools.ability.base;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.connection.ConnectionFrequency;
import uk.jamierocks.lexteam.ygd.core.tools.ability.ConnectionFrequencyToolAbilityBaseEvent;

/**
 * Created by Tom
 */
public class ChangeConnectionFrequencyToolAbilityEvent extends ConnectionFrequencyToolAbilityBaseEvent{
    public ChangeConnectionFrequencyToolAbilityEvent(Level level, Connection connection, ConnectionFrequency connectionFrequency){
        super(level, connection, connectionFrequency);
    }
}
