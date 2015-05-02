package uk.jamierocks.lexteam.ygd.core.objects.tools;

import uk.jamierocks.lexteam.ygd.core.objects.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.GameObject;
import uk.jamierocks.lexteam.ygd.core.objects.tools.ability.ToolAbility;

/**
 * Represents a tool that can be used to affect a {@link Connection}
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public class Tool<T extends ToolAbility> extends GameObject {

    private T toolAbility;

    public Tool(T ability) {
        this.toolAbility = ability;
    }

    /**
     * Gets the {@link T}
     *
     * @return the {@link T}
     */
    public T getAbility() {
        return toolAbility;
    }
}
