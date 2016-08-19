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

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Represents the many flags a ToolManipulator needs to check before manipulating a panel.
 *
 * @author Jamie Mansfield
 */
public interface ToolManipulatorOptions {

    Boolean[] getOptions();

    default boolean canManipulate() {
        for (boolean option : this.getOptions()) {
            if (!option) {
                return false;
            }
        }

        return true;
    }

    static Builder builder() {
        return new Builder() {
            private List<Boolean> options = Lists.newArrayList();

            @Override
            public Builder option(boolean option) {
                this.options.add(option);
                return this;
            }

            @Override
            public ToolManipulatorOptions build() {
                return () -> this.options.toArray(new Boolean[this.options.size()]);
            }
        };
    }

    interface Builder extends xyz.lexteam.ygd.core.util.Builder<ToolManipulatorOptions> {

        Builder option(boolean option);
    }
}
