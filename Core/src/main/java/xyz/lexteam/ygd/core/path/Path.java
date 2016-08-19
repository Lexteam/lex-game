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
package xyz.lexteam.ygd.core.path;

import xyz.lexteam.ygd.core.panel.BasePanel;

/**
 * Represents a 'path'.
 *
 * @author Jamie Mansfield
 */
public interface Path {

    /**
     * Gets the first panel in the circuit.
     *
     * @return the starting panel.
     */
    BasePanel getStart();

    /**
     * Gets the last panel in the circuit.
     *
     * @return the finishing panel.
     */
    BasePanel getFinish();

    /**
     * Sees if the circuit is complete.
     *
     * @return {@code true} if the circuit is complete.
     */
    boolean isComplete();

    /**
     * Gets the time it takes for the pulse, to get from the starting position to the end or the circuit.
     *
     * @return the pulse time.
     */
    int getPulseTime();
}
