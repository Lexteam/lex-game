package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * @author Tom
 */
public class Connection {

    private Direction to;
    private Direction from;

    public static final Connection BLANK = new Connection(Direction.NONE, Direction.NONE);

    public Connection(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    public Direction getTo() {
        return to;
    }

    public void setTo(Direction direction) {
        this.to = direction;
    }

    public Direction getFrom() {
        return from;
    }

    public void setFrom(Direction direction) {
        this.from = direction;
    }
}
