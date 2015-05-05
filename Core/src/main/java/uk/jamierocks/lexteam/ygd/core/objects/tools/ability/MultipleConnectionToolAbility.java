package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

/**
 * Interface for toolabilities that use multiple connections
 * @author Tom Drever
 */
public interface MultipleConnectionToolAbility extends ToolAbility {
    void use (Level level, Connection connectionOne, Connection connectionTwo);
}
