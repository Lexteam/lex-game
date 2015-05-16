package uk.jamierocks.lexteam.ygd.core.tools.ability.base;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.tools.ability.PointToolAbilityBaseEvent;

/**
 * Created by Tom
 */
public class CreatePointToolAbilityEvent extends PointToolAbilityBaseEvent{
    public CreatePointToolAbilityEvent(Level level, Connection connection, Point pointToAdd){
        super(level, connection, pointToAdd);
    }
}
