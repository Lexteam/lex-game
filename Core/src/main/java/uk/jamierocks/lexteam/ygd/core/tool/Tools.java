package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;

public final class Tools {

    public static final Tool ADD_CONNECTION = new Tool("add_connection", (panel, info) -> {
        panel.getConnection().setTo(info.get(Keys.DIRECTION_TO));
        panel.getConnection().setFrom(info.get(Keys.DIRECTION_FROM));
    });

    public static final Tool REMOVE_CONNECTION = new Tool("remove_connection", (panel, info) -> {
        panel.getConnection().setTo(Direction.NONE);
        panel.getConnection().setFrom(Direction.NONE);
    });

    public static final Tool REVERSE_CONNECTION = new Tool("reverse_connection", (panel, info) -> {
        Direction from = panel.getConnection().getFrom();
        Direction to = panel.getConnection().getTo();
        panel.getConnection().setFrom(to);
        panel.getConnection().setTo(from);
    });

    public static final Tool CHANGE_DURATION = new Tool("change_duration", (panel, info) -> {
        panel.setDuration(info.get(Keys.DURATION));
    });
}
