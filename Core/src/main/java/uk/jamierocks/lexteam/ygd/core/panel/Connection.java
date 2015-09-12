package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * @author Tom
 */
public class Connection {
    public Connection(Direction to, Direction from){
        this.to = to;
        this.from = from;
    }

    private Direction to;
    public Direction getTo(){
        return to;
    }
    public void setTo(Direction direction){
        this.to = direction;
    }

    private Direction from;
    public Direction getFrom(){
        return from;
    }
    public void setFrom(Direction direction) {
        this.from = direction;
    }
}
