/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.game.test;

import com.flowpowered.math.vector.Vector2f;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Assert;
import org.junit.Test;
import xyz.lexteam.ygd.core.panel.BasePanel;
import xyz.lexteam.ygd.core.panel.CubeFace;
import xyz.lexteam.ygd.core.panel.CubePosition;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.core.section.level.Level;
import xyz.lexteam.ygd.game.impl.panel.GameBasePanel;

/**
 * @author Tom Drever
 */
public class PathAPITest {
    @Test
    public void Test(){
        int ppf = 3;

        BiMap<BasePanel, CubePosition> panels = HashBiMap.create();

        CubeFace[] faces = CubeFace.values();

        for(CubeFace face:faces){
            for (int i = 0; i < ppf; i++){
                for (int j = 0; j < ppf; j++){
                    CubePosition pos = new CubePosition(face, new Vector2f(i, j));
                    GameBasePanel gameBasePanel = new GameBasePanel();
                    gameBasePanel.setCubePosition(pos);
                    panels.put(gameBasePanel, pos);
                }
            }
        }

        Level lvl = new Level(panels, ppf);

        GameBasePanel gbp = new GameBasePanel();
        gbp.setCubePosition(new CubePosition(CubeFace.BOTTOM, new Vector2f(1, 2)));

        CubePosition cpos = lvl.getAdjacentPanelPosition(gbp, Direction.UP).get();

        CubePosition potpos = new CubePosition(CubeFace.FRONT, new Vector2f(0, 1));

        Assert.assertTrue(cpos.equals(potpos));
    }
}
