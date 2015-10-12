package com.gmail.riley787cmplex.engine.media.data;

/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
public class EffectData extends MediaData<String> {

    public EffectData(String Filename){
        super(Filename);
        parse(Filename);
    }


}
