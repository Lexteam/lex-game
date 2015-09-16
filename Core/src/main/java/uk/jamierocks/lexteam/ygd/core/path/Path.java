package uk.jamierocks.lexteam.ygd.core.path;

import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;

/**
 * Represents a 'path'.
 *
 * @author Jamie Mansfield
 */
public interface Path {

    BasePanel getStart();

    BasePanel getFinish();

    boolean isComplete();

    int getPulseTime();
}
