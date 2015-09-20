package com.gmail.riley787cmplex.engine;

import com.flowpowered.math.vector.Vector3f;

/**
 * Created by Games on 20/09/2015.
 */
public class AnimationData {

    public Vector3f getVelocity() {
        return velocity;
    }
    public Vector3f getVelocity_rot() {
        return velocity_rot;
    }
    public float getTimetaken(){
        return timetaken;
    }

    private Vector3f velocity;
    private Vector3f velocity_rot;

    //in seconds
    private float timetaken;
}
