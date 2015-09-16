package uk.jamierocks.lexteam.ygd.core.path;

import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;

public interface Path {

    BasePanel getStart();

    BasePanel getFinish();

    boolean isComplete();

    int getPulseTime();
}
