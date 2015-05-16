package uk.jamierocks.lexteam.ygd.core.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.connection.ConnectionFrequency;

/**
 * Created by Tom
 */
public abstract class ConnectionFrequencyToolAbilityBaseEvent {
    private final Level level;
    private final Connection connection;
    private final ConnectionFrequency connectionFrequency;

    public ConnectionFrequencyToolAbilityBaseEvent(Level level, Connection connection, ConnectionFrequency connectionFrequency) {
        this.level = level;
        this.connection = connection;
        this.connectionFrequency = connectionFrequency;
    }

    public Level getLevel() {
        return level;
    }

    public Connection getConnection() {
        return connection;
    }

    public ConnectionFrequency getConnectionFrequency() {
        return connectionFrequency;
    }
}
