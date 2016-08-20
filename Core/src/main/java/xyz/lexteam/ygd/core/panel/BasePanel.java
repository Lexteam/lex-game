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
package xyz.lexteam.ygd.core.panel;

/**
 * The most basic possible panel. Just holds its position.
 *
 * @author Tom Drever
 */
public interface BasePanel {

    /**
     * Gets the position of the panel represented as a {@link CubePosition}.
     *
     * @return the position of the panel.
     */
    CubePosition getCubePosition();

    /**
     * Sets the position of the panel.
     *
     * @param cubePosition the new position.
     */
    void setCubePosition(CubePosition cubePosition);
}