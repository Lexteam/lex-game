package uk.jamierocks.lexteam.ygd.core.panel;

/**
 * Created by Jamie_2 on 12/09/2015.
 */
public class Connection {
    public Connection(Direction to, Direction from){
        this.setTo(to);
        this.setFrom(from);
    }

    private Direction to;
    public Direction getTo(){
        return to;
    }
    public void setTo(Direction direction){
        to = direction;
    }

    private Direction from;
    public Direction getFrom(){
        return from;
    }
    public void setFrom(Direction direction){
        from = direction;
    }



}
