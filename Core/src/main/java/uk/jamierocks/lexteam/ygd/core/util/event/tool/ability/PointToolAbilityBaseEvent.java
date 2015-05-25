package uk.jamierocks.lexteam.ygd.core.util.event.tool.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.tools.ToolAbility;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

/**
 * @author Jamie Mansfield
 */
public class PointToolAbilityBaseEvent extends ToolAbilityBaseEvent {

    private final Level level;
    private final Connection connection;
    private final Point point;

    public PointToolAbilityBaseEvent(ToolAbility ability, Level level, Connection connection, Point point) {
        super(ability);
        this.level = level;
        this.connection = connection;
        this.point = point;
    }

    public Level getLevel() {
        return level;
    }

    public Connection getConnection() {
        return connection;
    }

    public Point getPoint() {
        return point;
    }
}
