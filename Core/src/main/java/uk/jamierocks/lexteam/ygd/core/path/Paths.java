/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.path;

import com.flowpowered.math.vector.Vector2f;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.CubeFace;
import uk.jamierocks.lexteam.ygd.core.panel.CubePosition;
import uk.jamierocks.lexteam.ygd.core.section.level.Level;

/**
 * Static access to methods required to make paths.
 *
 * @author Jamie Mansfield
 */
public final class Paths {

    public static Path of(Level level) {
        int pulseTime = 0;
        boolean completed = false;

        // do shit

        return new Path() {
            @Override
            public BasePanel getStart() {
                return level.getPanel(new CubePosition(CubeFace.FRONT, new Vector2f(1, 1)));
            }

            @Override
            public BasePanel getFinish() {
                return level.getPanel(new CubePosition(CubeFace.BACK,
                        new Vector2f(level.getPanelsPerFace(), level.getPanelsPerFace())));
            }

            @Override
            public boolean isComplete() {
                return completed;
            }

            @Override
            public int getPulseTime() {
                return pulseTime;
            }
        };
    }
}
