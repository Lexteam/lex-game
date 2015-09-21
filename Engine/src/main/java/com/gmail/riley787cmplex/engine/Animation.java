package com.gmail.riley787cmplex.engine;

import com.flowpowered.math.vector.Vector3f;

/**
 * Created by Games on 20/09/2015.
 */
public class Animation {

    public class Second{
        Second(float Seconds){seconds = Seconds;}
        float getSeconds(){return seconds;}
        private float seconds;
    }

    public Vector3f getVelocity() {return velocity;}
    public Vector3f getVelocity_rot() {return velocity_rot;}
    public Second getTimetaken(){return timetaken;}

    public void setVelocity(Vector3f Velocity){velocity = Velocity;}
    public void setVelocity_rot(Vector3f Velocity_rot) { velocity_rot = Velocity_rot;}

    public void setTimetaken(Second Timetaken){ Timetaken = timetaken;}

    private Vector3f velocity;
    private Vector3f velocity_rot;

    //in seconds
    private Second timetaken;
}
