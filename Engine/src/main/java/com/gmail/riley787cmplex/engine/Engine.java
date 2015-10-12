package com.gmail.riley787cmplex.engine;

import com.gmail.riley787cmplex.engine.media.data.EffectData;
import com.gmail.riley787cmplex.engine.media.data.KeyFrameData;
import com.gmail.riley787cmplex.engine.media.libraries.MediaLibrary;

/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
public class Engine{

      protected static MediaLibrary effectlibrary = new MediaLibrary<String, EffectData>();

      protected static MediaLibrary keyframelibrary = new MediaLibrary<String, KeyFrameData>();


      private final static int  SIDES = 6;


      public Engine(int panelsperface){

      }

      

      public int getSides(){ return SIDES;}


}
