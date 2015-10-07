package com.gmail.riley787cmplex.engine;

import com.gmail.riley787cmplex.engine.media.data.EffectData;
import com.gmail.riley787cmplex.engine.media.libraries.EffectLibrary;

public class Engine{


      private final static int  SIDES = 6;

      public static EffectLibrary effectLibrary = new EffectLibrary();

      public Engine(int panelsperface){

      }

      

      public int getSides(){ return SIDES;}


      private static EffectData burntoutPanel;
      private static EffectData panelCooldownAnim;


}
