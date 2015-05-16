package uk.jamierocks.lexteam.ygd.core.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.connection.Connection;

/**
 * Created by Tom
 */
public abstract class MultipleConnectionToolAbilityBaseEvent {
    private final Level level;
    private final Connection connectionOne;
    private final Connection connectionTwo;

    public MultipleConnectionToolAbilityBaseEvent(Level level, Connection connectionOne, Connection connectionTwo) {
        this.level = level;
        this.connectionOne = connectionOne;
        this.connectionTwo = connectionTwo;
    }

    public Level getLevel() {
        return level;
    }

    public Connection getConnectionOne() {
        return connectionOne;
    }

    public Connection getConnectionTwo() {
        return connectionTwo;
    }
}
