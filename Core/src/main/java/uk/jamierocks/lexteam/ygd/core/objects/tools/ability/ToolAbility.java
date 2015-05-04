package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

import uk.jamierocks.lexteam.ygd.core.level.Level;
import uk.jamierocks.lexteam.ygd.core.objects.Point;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.tools.Tool;

/**
 * Represents a {@link Tool}'s ability
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public interface ToolAbility {

    /**
     * Called when a {@link Tool} is used
     * @param connection The connection the tool's use applies to
     * @param level level in which the tool is being used
     */
    void use(Connection connection, Level level);
}
