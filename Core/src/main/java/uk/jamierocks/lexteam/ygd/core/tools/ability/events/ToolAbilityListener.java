package uk.jamierocks.lexteam.ygd.core.tools.ability.events;

import net.engio.mbassy.listener.Handler;
import uk.jamierocks.lexteam.ygd.core.tools.ability.base.*;
import uk.jamierocks.lexteam.ygd.core.objects.Point;

public class ToolAbilityListener {

    @Handler
    public void onCreatePoint(CreatePointToolAbilityEvent event) {
        if (event.getConnection().pointTo == null){
            event.getConnection().pointTo = event.getPoint();
            event.getConnection().availablePoints.remove(event.getPoint());
        }

        if (event.getConnection().pointFrom == null){
            event.getConnection().pointFrom = event.getPoint();
            event.getConnection().availablePoints.remove(event.getPoint());
        }
    }

    @Handler
    public void onRemovePoint(RemovePointToolAbilityEvent event){
        if(event.getPoint() == event.getConnection().pointTo){
            event.getConnection().pointTo = null;
            event.getConnection().availablePoints.add(event.getPoint());
        }

        if(event.getPoint() == event.getConnection().pointFrom){
            event.getConnection().pointFrom = null;
            event.getConnection().availablePoints.add(event.getPoint());
        }
    }

    @Handler
    public void onReverseConnection(ReverseConnectionToolAbilityEvent event){
        Point pointToBePointFrom = event.getConnection().pointTo;
        Point pointToBePointTo = event.getConnection().pointFrom;

        event.getConnection().pointTo = pointToBePointTo;
        event.getConnection().pointFrom = pointToBePointFrom;
    }

    @Handler
    public void onChangeConnectionFrequency(ChangeConnectionFrequencyToolAbilityEvent event){
        event.getConnection().connectionFrequency = event.getConnectionFrequency();
    }

    @Handler
    public void onMergeConnection(MergeConnectionsToolAbilityEvent event){
        event.getConnectionOne().pointTo = event.getConnectionTwo().pointTo;

        event.getLevel().removeConnection(event.getConnectionTwo());
    }

}
