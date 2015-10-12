package com.gmail.riley787cmplex.engine.media.data;

import com.flowpowered.math.imaginary.Quaternionf;
import com.flowpowered.math.vector.Vector3f;
import com.gmail.riley787cmplex.engine.media.Model;

/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 * handles non-absoulte values
 * lazyness is key!
 */
public class ModelInstance extends MediaDataFriend<Integer> {

    static Friend<Integer> friend = new Friend<>();

    public ModelInstance(Model model){
        super(model.addInstance(friend));
    }


    public void playAnimation(KeyFrameData Data){

    }
    public void playAnimation(String animationName){

    }


    public void playEffect(EffectData Data){

    }
    public void playEffect(String animationName){

    }


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
