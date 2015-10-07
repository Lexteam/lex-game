package com.gmail.riley787cmplex.engine.media;


import com.flowpowered.math.imaginary.Quaternionf;
import com.flowpowered.math.vector.Vector3f;
import com.gmail.riley787cmplex.engine.media.data.ModelInstance;


import java.util.Map;
import java.util.Set;

/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 * handles absoultes
 */
public class Model {

    public int addInstance(ModelInstance.Friend friend){++no_ofInstances; return  no_ofInstances;}

    //change to bitmap
    public Boolean isAnimationPlaying(int instance){return animationPlaying.get(instance);}
    public Boolean isEffectPlaying(int instance){return effectPlaying.get(instance);}

    private Set<Vector3f> verticies;
    private Set<Vector3f> faces;

    private Map<Integer, Boolean> animationPlaying;
    private Map<Integer, Boolean> effectPlaying;

    private int no_ofInstances;
}
