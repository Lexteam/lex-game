package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

/**
 * Interface for toolabilities that requires a point
 * @author Tom Drever
 */
public interface PointToolAbility extends ToolAbility{
    void use (Level level, Connection connection, Point point);
}
