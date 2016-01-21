/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
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
