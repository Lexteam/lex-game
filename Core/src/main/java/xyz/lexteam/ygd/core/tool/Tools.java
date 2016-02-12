/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.core.tool;

import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import xyz.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import xyz.lexteam.ygd.core.panel.Direction;
import xyz.lexteam.ygd.core.panel.Panel;
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
    public static final Tool ADD_CONNECTION = Tool.builder()
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
                public ToolManipulatorOptions getManipulateOptions(Panel panel) {
                    return ToolManipulatorOptions.builder()
                            .option(panel.getConnection().getTo() == Direction.NONE &&
                                    panel.getConnection().getFrom() == Direction.NONE)
                            .build();
                }
            })
            .build();

    /**
     * Tool that clears a panel's connection.
     */
    public static final Tool REMOVE_CONNECTION = Tool.builder()
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
                public ToolManipulatorOptions getManipulateOptions(Panel panel) {
                    return ToolManipulatorOptions.builder()
                            .option(panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE)
                            .build();
                }
            })
            .build();

    /**
     * Tool that reverses a panel's connection, so that the 'to' becomes the 'from', and vise versa.
     */
    public static final Tool REVERSE_CONNECTION = Tool.builder()
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
                public ToolManipulatorOptions getManipulateOptions(Panel panel) {
                    return ToolManipulatorOptions.builder()
                            .option(panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE)
                            .build();
                }
            })
            .build();

    /**
     * Tool that can change the duration of a panel's pulse.
     */
    public static final Tool CHANGE_DURATION = Tool.builder()
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
                public ToolManipulatorOptions getManipulateOptions(Panel panel) {
                    return ToolManipulatorOptions.builder()
                            .option(panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE)
                            .build();
                }
            })
            .build();

    /**
     * Tools that repairs burnt out panels. Weak and strong relate to chance to repair.
     */
    public static final Tool WEAK_REPAIR_PANEL = Tool.builder()
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

    public static final Tool STRONG_REPAIR_PANEL = Tool.builder()
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
}
