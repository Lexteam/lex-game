package com.gmail.riley787cmplex.engine.media.data;

import javax.annotation.PostConstruct;

/**
 * Created by ethan on 24/09/15.
 */
public class EffectData extends MediaData<String> {

    public EffectData(String Filename){
        super(Filename);
        parse(Filename);
    }

    @PostConstruct //will this compile?
    private void init(String Filename){
        EffectMediaLib.register(Filename, this);
    }
}
