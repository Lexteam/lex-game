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
package xyz.lexteam.ygd.core.tool;

import xyz.lexteam.ygd.core.panel.Panel;
import xyz.lexteam.meta.api.MetaHolder;

/**
 * Represents the tool manipulator.
 *
 * @author Jamie Mansfield
 */
public interface ToolManipulator {

    /**
     * Called when a tool is used.
     *
     * @param panel the panel to manipulate.
     * @param info the manipulator information.
     */
    ToolManipulateResult manipulate(Panel panel, MetaHolder info);

    /**
     * Gets an array of options, to check if the panel can be manipulated.
     *
     * @param panel The panel.
     * @return {@code True} if can manipulate, {@code false} otherwise.
     */
    default ToolManipulatorOptions getManipulateOptions(Panel panel) {
        return ToolManipulatorOptions.builder()
                .build();
    }

    /**
     * Checks if this panel, can manipulate a panel.
     *
     * @param panel The panel.
     * @return {@code True} if can manipulate, {@code false} otherwise.
     */
    default boolean canManipulate(Panel panel) {
        if (!panel.isCoolingDown() || !panel.isFixedPanel()) {
            return false;
        }

        return this.getManipulateOptions(panel).canManipulate();
    }
}
