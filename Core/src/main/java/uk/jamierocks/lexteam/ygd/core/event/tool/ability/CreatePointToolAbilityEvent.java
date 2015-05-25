package uk.jamierocks.lexteam.ygd.core.event.tool.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.object.Point;
import uk.jamierocks.lexteam.ygd.core.object.tool.ToolAbility;
import uk.jamierocks.lexteam.ygd.core.object.tool.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.util.event.tool.ability.PointToolAbilityBaseEvent;

/**
 * @author Jamie Mansfield
 */
public class CreatePointToolAbilityEvent extends PointToolAbilityBaseEvent {

    public CreatePointToolAbilityEvent(ToolAbility ability, Level level, Connection connection, Point point) {
        super(ability, level, connection, point);
    }
}
