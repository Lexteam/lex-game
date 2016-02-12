/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.engine.meta.values;

import com.flowpowered.math.imaginary.Quaternionf;
import com.flowpowered.math.vector.Vector3f;
import xyz.lexteam.ygd.engine.meta.util.InstanceCounter;


public class ModelInstance extends InstanceCounter {

    public ModelInstance(){

    }


    public void playAnimation(Animation Data){}

    public void playAnimation(String animationName){}


    public void playEffect(Effect Data){}

    public void playEffect(String animationName){}

    public Boolean isPlayingAnimation(){
        return animationPlaying;
    }
    
    public Boolean playingEffect(){
        return effectPlaying;
    }


    public void setPosition(Vector3f position){
        position = position;
    }

    public void setRotation(Quaternionf rotation){
        rotation = rotation;
    }

    public void setScale(Vector3f scale){
        scale = scale;
    }



    public void incPosition(Vector3f position){
        position.add(position);
    }

    public void incRotation(Quaternionf rotation){
        rotation.add(rotation);
    }

    public void incScale(Vector3f scale){scale.add(scale);}


    public Vector3f getScale(){return scale;}

    public Vector3f getPosition(){
        return position;
    }

    public Quaternionf getRotation(){
        return rotation;
    }


    private Vector3f position;
    private Quaternionf rotation;
    private Vector3f scale;

    private boolean effectPlaying;
    private boolean animationPlaying;
}
