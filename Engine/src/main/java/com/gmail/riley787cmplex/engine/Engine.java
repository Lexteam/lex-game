package com.gmail.riley787cmplex.engine;

import com.flowpowered.math.*;
import com.flowpowered.math.vector.*;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.lexteam.ygd.core.section.*;
import uk.jamierocks.lexteam.ygd.core.section.level.*;
import uk.jamierocks.lexteam.ygd.core.tool.*;

import java.rmi.NoSuchObjectException;
import java.util.Map;
import java.io.File.*;
import com.google.gson.*;


public class Engine{


      private final static int  SIDES = 6;

      public Engine(int panelsperface){

      }


      public void overrideAnimation(Tool tool, Animation animation){
            toolAnimations.put(tool, animation);
      }
      public void overrideAnimation(Panel panel, Animation animation){
            panelAnimations.put(panel, animation);
      }

      public boolean setAnimationIfAbsent(Tool tool, Animation animation){
            if(toolAnimations.putIfAbsent(tool, animation) != null) return  true;
            else return false;
      }
      public boolean setAnimationIfAbsent(Panel panel, Animation animation){
            if(panelAnimations.putIfAbsent(panel, animation) != null) return  true;
            else return false;
      }

      public boolean setAnimationsFromFiles(String MediaPath){
            return true;
      }

      public void playToolAnimation(Tool tool, Panel panel)  throws NoSuchObjectException{
            if(checkAnimationExists(tool)){
                  if(panel.isBurntout()){

                  }
                  if(checkAnimationExists(panel)){

                  }
                  else{
                        String err = "no animation for Panel " + tool.getName();
                        throw(new NoSuchObjectException(err));
                  }

            }
            else{
                  String err = "no animation for Tool " + tool.getName();
                  throw(new NoSuchObjectException(err));
            }
      }

      public int getSides(){ return SIDES;}

      private boolean checkAnimationExists(Tool tool){
            return toolAnimations.containsKey(tool);
      }

      private boolean checkAnimationExists(Panel panel){
            return toolAnimations.containsKey(panel);
      }


      private static Map<Tool, Animation> toolAnimations;
      private static Map<Panel, Animation> panelAnimations;
      private static Animation burntoutPanel;
      private static Animation panelCooldownAnim;


}
