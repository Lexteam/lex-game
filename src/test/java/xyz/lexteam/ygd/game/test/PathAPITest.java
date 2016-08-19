/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
