package uk.jamierocks.lexteam.ygd.core.objects.tools;

import uk.jamierocks.lexteam.ygd.core.objects.GameObject;
import uk.jamierocks.lexteam.ygd.core.objects.tools.ability.ToolAbility;

/**
 * Represents a tool that can be used to affect a connection
 *
 * @author Tom Drever
 */
public abstract class Tool<T extends ToolAbility> extends GameObject{

    public T toolAbility;

    public Tool(T ability){
        this.toolAbility = ability;
    }
}
