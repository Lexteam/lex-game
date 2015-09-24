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

    public Map getVelocity_Rot_time(){return Velocity_Rot_time;}
    public Set<Vector4f> getTimeVelocity(){return Velocity_time;}

    private Map<Float, Quaternionf> Velocity_Rot_time;
    private Set<Vector4f> Velocity_time;

}
