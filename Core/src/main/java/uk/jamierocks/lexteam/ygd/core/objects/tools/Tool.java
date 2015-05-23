package uk.jamierocks.lexteam.ygd.core.objects.tools;

import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;
import uk.jamierocks.lexteam.ygd.core.objects.GameObject;
import uk.jamierocks.lexteam.ygd.core.objects.tools.ability.ToolAbility;

/**
 * Represents a tool that can be used to affect a {@link Connection}
 *
 * @author Tom Drever
 * @author Jamie Mansfield
 */
public class Tool extends GameObject {

    private ToolAbility toolAbility;

    public Tool(ToolAbility ability) {
        this.toolAbility = ability;
    }

    /**
     * Gets the {@link ToolAbility}
     *
     * @return the {@link ToolAbility}
     */
    public ToolAbility getAbility() {
        return toolAbility;
    }

    public void Use(){
        toolAbility.Use();
    }
}
