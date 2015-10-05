package com.gmail.riley787cmplex.engine;

import com.flowpowered.math.vector.Vector4f;
import com.flowpowered.math.imaginary.Quaternionf;
import java.util.Map;
import java.util.Set;

/**
 * Created by Games on 20/09/2015.
 */
public class KeyFrameData {

    public void compute(int percentile){

    }

    public boolean isComplete(){
        return completeAnimation;
    }

    public Map getVelocity_rot_time(){return Velocity_rot_time;}
    public Set<Vector4f> getVelocity_trans_time(){return Velocity_trans_time;}

    private Map<Float, Quaternionf> Velocity_rot_time;
    private Set<Vector4f> Velocity_trans_time;

    private boolean completeAnimation;
}
