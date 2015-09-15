package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * Represents a connection on a panel. Contains representations of the sides of the
 * panel the connection goes to and from.
 * @author Tom
 */
public class Connection {

    private Direction to;
    private Direction from;

    /**
     * A blank connection
     */
    public static final Connection BLANK = new Connection(Direction.NONE, Direction.NONE);

    /**
     * Construct a panel with set to and from directions
     * @param to the 'to' direction value
     * @param from the 'from' direction value
     */
    public Connection(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    /**
     * @return the direction of the 'to' side of the connection
     */
    public Direction getTo() {
        return to;
    }

    /**
     * Sets the direction of the 'to' side of the connection
     * @param direction the new value
     */
    public void setTo(Direction direction) {
        this.to = direction;
    }

    /**
     * @return the direction of the 'from' side of the connection
     */
    public Direction getFrom() {
        return from;
    }

    /**
     * Sets the direction of the 'from' side of the connection
     * @param direction the new value
     */
    public void setFrom(Direction direction) {
        this.from = direction;
    }
}
