package uk.jamierocks.lexteam.ygd.core.tools;

import uk.jamierocks.lexteam.ygd.core.tools.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.GameObject;
import uk.jamierocks.lexteam.ygd.core.tools.ability.ToolAbility;

/**
 * Represents a tool that can be used to affect a {@link Connection}
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public abstract class Tool implements GameObject{
    public abstract void use();
}
