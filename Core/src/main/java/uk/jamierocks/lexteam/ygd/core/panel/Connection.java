package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * Represents a connection on a panel. Contains representations of the sides of the
 * panel the connection goes to and from.
 *
 * @author Tom Drever
 */
public class Connection {

    /**
     * A blank connection
     */
    public static final Connection BLANK = new Connection(Direction.NONE, Direction.NONE);
    private Direction to;
    private Direction from;

    /**
     * Construct a panel with set to and from directions
     *
     * @param to the 'to' direction value
     * @param from the 'from' direction value
     */
    public Connection(Direction to, Direction from) {
        this.to = to;
        this.from = from;
    }

    /**
     * Gets the {@link Direction} going into the 'to' side of this connection.
     *
     * @return the direction of the 'to' side of the connection
     */
    public Direction getTo() {
        return to;
    }

    /**
     * Sets the direction of the 'to' side of the connection
     *
     * @param direction the new value
     */
    public void setTo(Direction direction) {
        this.to = direction;
    }

    /**
     * Gets the {@link Direction} going into the 'from' side of this connection.
     *
     * @return the direction of the 'from' side of the connection
     */
    public Direction getFrom() {
        return from;
    }

    /**
     * Sets the direction of the 'from' side of the connection
     *
     * @param direction the new value
     */
    public void setFrom(Direction direction) {
        this.from = direction;
    }
}
