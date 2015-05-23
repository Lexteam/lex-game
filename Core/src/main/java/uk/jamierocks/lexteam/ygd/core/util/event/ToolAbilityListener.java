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
        // TODO: this event
    }
}
