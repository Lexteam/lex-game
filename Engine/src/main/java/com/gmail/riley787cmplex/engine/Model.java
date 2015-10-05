package com.gmail.riley787cmplex.engine;


import com.flowpowered.math.imaginary.Quaternionf;
import com.flowpowered.math.vector.Vector3f;


import java.util.Set;

/**
 * Created by ethan on 21/09/15.
 * handles absoultes
 */
public class Model {




    public boolean KeyFramesExist(){if(KeyFrames != null)return true; return false;}

    public void setKeyFrames(KeyFrameData Data){KeyFrames = Data;}

    //returns false if animation is absent
    public boolean setKeyFrameDataifabsent(KeyFrameData Data){
        if(KeyFrames == null){
            KeyFrames =  Data;
            return true;
        }
        else{
            return  false;
        }
    }

    public boolean isAnimationPlaying(int instance){return animationPlaying;}

    public KeyFrameData getKeyFrameData(){return KeyFrames;}

    private KeyFrameData KeyFrames;

    private Set<Vector3f> verticies;
    private Set<Vector3f> faces;

    private boolean animationPlaying;
}
