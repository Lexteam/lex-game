package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
/*
 * A class containing the variety of tools within the game.
 *
 * @author Jamie Mansfield
  *@author Tom
 */
public final class Tools {

    /*
     * Tool that can add a new connection to a blank panel.
     */
    public static final Tool ADD_CONNECTION = new Tool("add_connection", (panel, info) -> {
        if(panel.getConnection().getTo() == Direction.NONE && panel.getConnection().getFrom() == Direction.NONE){
            panel.getConnection().setTo(info.get(Keys.DIRECTION_TO));
            panel.getConnection().setFrom(info.get(Keys.DIRECTION_FROM));
        }
    });

    /*
     * Tool that clears a panel's connection.
     */
    public static final Tool REMOVE_CONNECTION = new Tool("remove_connection", (panel, info) -> {
        panel.getConnection().setTo(Direction.NONE);
        panel.getConnection().setFrom(Direction.NONE);
    });

    /*
     * Tool that reverses a panel's connection, so that the 'to' becomes the 'from', and vise versa.
     */
    public static final Tool REVERSE_CONNECTION = new Tool("reverse_connection", (panel, info) -> {
        Direction from = panel.getConnection().getFrom();
        Direction to = panel.getConnection().getTo();
        panel.getConnection().setFrom(to);
        panel.getConnection().setTo(from);
    });

    /*
     * Tool that can change the duration of a tile.
     */
    public static final Tool CHANGE_DURATION = new Tool("change_duration", (panel, info) -> {
        panel.setDuration(info.get(Keys.DURATION));
    });

    public static final Tool REMOVE_BURNTOUT = new Tool("remove_burntout", (panel, info) -> {
        panel.setBurntout(false);
    });
}
