/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.engine.meta.values;

import com.flowpowered.math.imaginary.Quaternionf;
import com.flowpowered.math.vector.Vector4f;

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
