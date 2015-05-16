package uk.jamierocks.lexteam.ygd.core.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;

/**
 * Created by Tom
 */
public abstract class SimpleToolAbilityBaseEvent {
    private final Level level;
    private final Connection connection;

    public SimpleToolAbilityBaseEvent(Level level, Connection connection) {
        this.level = level;
        this.connection = connection;
    }

    public Level getLevel() {
        return level;
    }

    public Connection getConnection() {
        return connection;
    }
}
