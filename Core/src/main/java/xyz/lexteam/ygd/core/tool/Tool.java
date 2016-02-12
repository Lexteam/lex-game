/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.tool;

/**
 * Represents a tool.
 *
 * @author Jamie Mansfield
 */
public interface Tool {

    /**
     * Gets the tool's name.
     *
     * @return the tool's name.
     */
    String getName();

    /**
     * Gets the tool's cooldown time.
     * The time should be in seconds.
     *
     * @return the cooldown time in seconds.
     */
    int getCooldown();

    /**
     * Gets the tool's manipulator.
     *
     * @return the tool's manipulator.
     */
    ToolManipulator getManipulator();

    /**
     * Creates a blank builder to create a tool.
     *
     * @return A blank builder.
     */
    static Builder builder() {
        return new Builder() {
            private String name = "";
            private int cooldown = 1;
            private ToolManipulator manipulator;

            @Override
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            @Override
            public Builder cooldown(int cooldown) {
                this.cooldown = cooldown;
                return this;
            }

            @Override
            public Builder manipulator(ToolManipulator manipulator) {
                this.manipulator = manipulator;
                return this;
            }

            @Override
            public Tool build() {
                return new Tool() {
                    @Override
                    public String getName() {
                        return name;
                    }

                    @Override
                    public int getCooldown() {
                        return cooldown;
                    }

                    @Override
                    public ToolManipulator getManipulator() {
                        return manipulator;
                    }
                };
            }
        };
    }

    /**
     * The {@link Tool} builder.
     *
     * @author Jamie Mansfield
     */
    interface Builder extends xyz.lexteam.ygd.core.util.Builder<Tool> {

        /**
         * Sets the name of the tool.
         *
         * @param name The name.
         * @return this.
         */
        Builder name(String name);

        /**
         * Sets the cooldown time of this tool.
         *
         * @param cooldown The cooldown time.
         * @return this.
         */
        Builder cooldown(int cooldown);

        /**
         * Sets the manipulator for this tool.
         *
         * @param manipulator The manipulator.
         * @return this.
         */
        Builder manipulator(ToolManipulator manipulator);
    }
}
