package com.gmail.riley787cmplex.engine;

import com.flowpowered.math.imaginary.Quaternionf;
import com.flowpowered.math.vector.Vector3f;

/**
 * Created by ethan on 03/10/15.
 * handles non-absoulte values
 * lazyness is key!
 */
public class ModelInstance {

    public void setPosition(Vector3f position){
        Position = position;
    }

    public void setRotation(Quaternionf rotation){
        Rotation = rotation;
    }

    public void setScale(Vector3f scale){
        Scale = scale;
    }



    public void incPosition(Vector3f position){
        Position.add(position);
    }

    public void incRotation(Quaternionf rotation){
        Rotation.add(rotation);
    }

    public void incScale(Vector3f scale){
        Scale.add(scale);
    }




    public Vector3f getScale(){
        return Scale;
    }

    public Vector3f getPosition(){
        return Position;
    }

    public Quaternionf getRotation(){
        return Rotation;
    }




    private Vector3f Position;
    private Quaternionf Rotation;
    private Vector3f Scale;

}
