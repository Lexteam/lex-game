package uk.jamierocks.lexteam.ygd.core.util.event.tool.ability;

import uk.jamierocks.lexteam.ygd.core.objects.tools.ToolAbility;

/**
 * Describes an event to do with a tool ability.
 *
 * @author Jamie Mansfield
 */
public class ToolAbilityBaseEvent {

    private final ToolAbility ability;

    public ToolAbilityBaseEvent(ToolAbility ability) {
        this.ability = ability;
    }

    public ToolAbility getAbility() {
        return ability;
    }
}
