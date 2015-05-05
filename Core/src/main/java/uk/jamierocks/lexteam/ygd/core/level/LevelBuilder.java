package uk.jamierocks.lexteam.ygd.core.level;

import com.google.common.base.Preconditions;
import uk.jamierocks.lexteam.ygd.core.objects.tools.connection.Connection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Builder for levels
 * @author  Tom Drever
 */
public class LevelBuilder {

    private Level level;

    public LevelBuilder() {
        level = new Level() {
        };
    }

    public LevelBuilder addConnection(Connection... connections) {
        for (Connection connection : connections){
            level.connections.add(connection);
        }

        for (Connection connection : connections){
            if (this.level.availablePoints.contains(connection.pointTo)){
                this.level.availablePoints.remove(connection.pointTo);
            }

            if (this.level.availablePoints.contains(connection.pointFrom)){
                this.level.availablePoints.remove(connection.pointFrom);
            }
        }
        return this;
    }

    // currently seems a bit ood -
    // TODO: make a "populate availablepoints method"
}
