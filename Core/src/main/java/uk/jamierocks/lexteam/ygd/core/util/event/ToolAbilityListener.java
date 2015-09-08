package uk.jamierocks.lexteam.ygd.core.util.event;

import com.google.common.eventbus.Subscribe;
import uk.jamierocks.lexteam.ygd.core.event.tool.ability.CreatePointToolAbilityEvent;

/**
 * The listener for tool ability events
 *
 * @author Jamie Mansfield
 */
public class ToolAbilityListener {

    @Subscribe
    public void onCreatePoint(CreatePointToolAbilityEvent event) {
        // TODO: this event
    }
}
