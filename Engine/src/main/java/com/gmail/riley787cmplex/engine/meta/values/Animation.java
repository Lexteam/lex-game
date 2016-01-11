/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package com.gmail.riley787cmplex.engine.meta.values;

import com.flowpowered.math.vector.Vector4f;
import com.flowpowered.math.imaginary.Quaternionf;

import java.util.Map;
import java.util.Set;

public class Animation {

    public boolean isComplete(){
        return completeAnimation;
    }


    public Map getVelocity_rot_time(){return Velocity_rot_time;}

    public Set<Vector4f> getVelocity_trans_time(){return Velocity_trans_time;}


    private Map<Float, Quaternionf> Velocity_rot_time;
    private Set<Vector4f> Velocity_trans_time;

    private boolean completeAnimation;
}
