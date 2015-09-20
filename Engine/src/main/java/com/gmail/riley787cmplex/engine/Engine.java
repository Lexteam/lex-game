package com.gmail.riley787cmplex.engine;

import com.flowpowered.math.*;
import com.flowpowered.math.vector.*;
import uk.jamierocks.lexteam.ygd.core.panel.BasePanel;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.lexteam.ygd.core.section.*;
import uk.jamierocks.lexteam.ygd.core.section.level.*;
import uk.jamierocks.lexteam.ygd.core.tool.*;

public class Engine{
      private final static int  SIDES = 6;

      public Engine(int panelsperface){

      }


      public void animate(ToolType tool, Panel panel) {

            if (!panel.isBurntout()) {
                  switch (tool) {
                        case ADD_CONNECTION:
                              break;
                        case REMOVE_CONNECTION:
                              break;
                        case REVERSE_CONNECTION:
                              break;
                        case CHANGE_DURATION:
                              break;
                        case WEAK_REPAIR_PANEL:
                        case STRONG_REPAIR_PANEL:
                              break;
                  }

            }
            else{
                  switch (tool) {
                        case ADD_CONNECTION:
                        case REMOVE_CONNECTION:
                        case REVERSE_CONNECTION:
                        case CHANGE_DURATION:
                              break;
                        case WEAK_REPAIR_PANEL:
                              break;
                        case STRONG_REPAIR_PANEL:
                              break;
                  }
            }
      }


      public int getSides(){ return SIDES;}


}
