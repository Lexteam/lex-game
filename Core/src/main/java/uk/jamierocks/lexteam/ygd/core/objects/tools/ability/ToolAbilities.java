package uk.jamierocks.lexteam.ygd.core.objects.tools.ability;

/**
 * The list of tool abilities
 *
 * @author Jamie Mansfield
 */
public final class ToolAbilities {

    /**
     * A class representing the ToolAbility to add points to a connection
     */
    public static final ToolAbility ADD_POINT = new ToolAbilityAddPoint();

    /**
     * A class representing for the ToolAbility to change the frequency of the connection
     */
    public static final ToolAbility CHANGE_CONNECTION_FREQUENCY = new ToolAbilityChangeConnectionFrequency();

    /**
     * A class representing for the ToolAbility to change the direction of the connection
     */
    public static final ToolAbility CHANGE_DIRECTION = new ToolAbilityChangeDirection();

    /**
     * A class representing for the ToolAbility to merge two connections into one
     */
    public static final ToolAbility MERGE_CONNECTIONS = new ToolAbilityMergeConnections();

    /**
     * A class representing for the ToolAbility to remove a point in a connection
     */
    public static final ToolAbility REMOVE_POINT = new ToolAbilityRemovePoint();

    /**
     * A class representing for the ToolAbility to split a connection into two new connections
     */
    public static final ToolAbility SPLIT_CONNECTION = new ToolAbilitySplitConnection();
}
