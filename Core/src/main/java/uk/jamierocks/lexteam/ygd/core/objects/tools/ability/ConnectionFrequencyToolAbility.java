package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.ConnectionFrequency;

/**
 * Interface for toolabilities that use a connectionfrequency
 * @author Tom Drever
 */
public interface ConnectionFrequencyToolAbility extends ToolAbility{
    void use (Level level, Connection connection, ConnectionFrequency frequency);
}
