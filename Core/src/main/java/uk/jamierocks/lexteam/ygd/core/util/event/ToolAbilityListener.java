package uk.jamierocks.lexteam.ygd.core.util.event;

import net.engio.mbassy.listener.Handler;
import uk.jamierocks.lexteam.ygd.core.event.tool.ability.CreatePointToolAbilityEvent;

/**
 * The listener for tool ability events
 *
 * @author Jamie Mansfield
 */
public class ToolAbilityListener {

    @Handler
    public void onCreatePoint(CreatePointToolAbilityEvent event) {
        if (event.getConnection().pointTo == null){
            event.getConnection().pointTo = event.getPoint();
        }

        if (event.getConnection().pointFrom == null){
            event.getConnection().pointFrom = event.getPoint();
        }
    }
}
