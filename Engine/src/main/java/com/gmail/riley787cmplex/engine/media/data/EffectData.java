package com.gmail.riley787cmplex.engine.media.data;

import com.gmail.riley787cmplex.engine.media.libraries.EffectLibrary;
import com.gmail.riley787cmplex.engine.Engine;

import javax.annotation.PostConstruct;

/**
 * Created by ethan on 24/09/15.
 */
public class EffectData extends MediaData<String> {

    public EffectData(String Filename){
        super(Filename);
        parse(Filename);
    }


}
