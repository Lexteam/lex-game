/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.meta.api.MetaHolder;

/**
 * A class containing the variety of tools within the game.
 *
 * @author Jamie Mansfield
 * @author Tom Drever
 */
public final class Tools {

    /**
     * Tool that can add a new connection to a blank panel.
     */
    public static final Tool ADD_CONNECTION = Tools.builder()
            .name("add_connection")
            .manipulator(new ToolManipulator() {
                @Override
                public ToolManipulateResult manipulate(Panel panel, MetaHolder info) {
                    if (!this.canManipulate(panel)) {
                        return ToolManipulateResult.CANT_MANIPULATE;
                    }
                    if (info.supports(ToolAddConnectionMeta.class)) {
                        ToolAddConnectionMeta meta = info.obtain(ToolAddConnectionMeta.class);
                        panel.getConnection().setTo(meta.to());
                        panel.getConnection().setFrom(meta.from());
                    } else {
                        return ToolManipulateResult.FAILURE;
                    }
                    return ToolManipulateResult.SUCCESS;
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[]{
                            panel.getConnection().getTo() == Direction.NONE &&
                                    panel.getConnection().getFrom() == Direction.NONE
                    };
                }
            })
            .build();

    /**
     * Tool that clears a panel's connection.
     */
    public static final Tool REMOVE_CONNECTION = Tools.builder()
            .name("remove_connection")
            .manipulator(new ToolManipulator() {
                @Override
                public ToolManipulateResult manipulate(Panel panel, MetaHolder info) {
                    if (!this.canManipulate(panel)) {
                        return ToolManipulateResult.CANT_MANIPULATE;
                    }
                    panel.getConnection().setTo(Direction.NONE);
                    panel.getConnection().setFrom(Direction.NONE);
                    return ToolManipulateResult.SUCCESS;
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[]{
                            panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE
                    };
                }
            })
            .build();

    /**
     * Tool that reverses a panel's connection, so that the 'to' becomes the 'from', and vise versa.
     */
    public static final Tool REVERSE_CONNECTION = Tools.builder()
            .name("reverse_connection")
            .manipulator(new ToolManipulator() {
                @Override
                public ToolManipulateResult manipulate(Panel panel, MetaHolder info) {
                    if (!this.canManipulate(panel)) {
                        return ToolManipulateResult.CANT_MANIPULATE;
                    }
                    Direction from = panel.getConnection().getFrom();
                    Direction to = panel.getConnection().getTo();
                    panel.getConnection().setFrom(to);
                    panel.getConnection().setTo(from);
                    return ToolManipulateResult.SUCCESS;
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[]{
                            panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE
                    };
                }
            })
            .build();

    /**
     * Tool that can change the duration of a panel's pulse.
     */
    public static final Tool CHANGE_DURATION = Tools.builder()
            .name("change_duration")
            .manipulator(new ToolManipulator() {
                @Override
                public ToolManipulateResult manipulate(Panel panel, MetaHolder info) {
                    if (!this.canManipulate(panel)) {
                        return ToolManipulateResult.CANT_MANIPULATE;
                    }
                    if (info.supports(ToolChangeDurationMeta.class)) {
                        ToolChangeDurationMeta meta = info.obtain(ToolChangeDurationMeta.class);
                        panel.setDuration(meta.duration());
                    } else {
                        return ToolManipulateResult.FAILURE;
                    }
                    return ToolManipulateResult.SUCCESS;
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[]{
                            panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE
                    };
                }
            })
            .build();

    /**
     * Tools that repairs burnt out panels. Weak and strong relate to chance to repair.
     */
    public static final Tool WEAK_REPAIR_PANEL = Tools.builder()
            .name("weak_repair_panel")
            .cooldown(3)
            .manipulator(new ToolManipulator() {
                @Override
                public ToolManipulateResult manipulate(Panel panel, MetaHolder info) {
                    if (!this.canManipulate(panel)) {
                        return ToolManipulateResult.CANT_MANIPULATE;
                    }
                    double chance = Math.random() * 100;
                    if (panel.isBurntout()) {
                        if (chance <= 50) {
                            panel.setBurntout(false);
                        }
                    } else {
                        panel.setBurntout(true);
                    }
                    return ToolManipulateResult.SUCCESS;
                }
            })
            .build();

    public static final Tool STRONG_REPAIR_PANEL = Tools.builder()
            .name("strong_repair_panel")
            .cooldown(3)
            .manipulator(new ToolManipulator() {
                @Override
                public ToolManipulateResult manipulate(Panel panel, MetaHolder info) {
                    if (!this.canManipulate(panel)) {
                        return ToolManipulateResult.CANT_MANIPULATE;
                    }
                    double chance = Math.random() * 100;
                    if (panel.isBurntout()) {
                        if (chance <= 90) {
                            panel.setBurntout(false);
                        }
                    } else {
                        panel.setBurntout(true);
                    }
                    return ToolManipulateResult.SUCCESS;
                }
            })
            .build();

    /**
     * Creates a blank builder to create a tool.
     *
     * @return A blank builder.
     */
    public static ToolBuilder builder() {
        return new ToolBuilderImpl();
    }

    private static class ToolBuilderImpl implements ToolBuilder {

        private String name = "";
        private int cooldown = 1;
        private ToolManipulator manipulator;

        /**
         * {@inheritDoc}
         */
        @Override
        public ToolBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ToolBuilder cooldown(int cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public ToolBuilder manipulator(ToolManipulator manipulator) {
            this.manipulator = manipulator;
            return this;
        }

        /**
         * {@inheritDoc}
         */
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
    }
}
