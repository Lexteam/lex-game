/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolAddConnectionMeta;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.tool.ToolChangeDurationMeta;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;
import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulatorInfo;
import uk.jamierocks.lexteam.ygd.core.tool.Tools;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * The implementation for all the tools.
 *
 * @author Jamie Mansfield
 */
public class GameTools {

    public static final Tool ADD_CONNECTION =
            new Tool("add_connection", 1,
                    new MetaBackedGameToolManipulator<ToolAddConnectionMeta>(
                            Tools.ADD_CONNECTION, ToolAddConnectionMeta.class) {

                        @Override
                        public void manipulatePanel(Panel panel, ToolAddConnectionMeta meta) {
                            panel.getConnection().setTo(meta.to());
                            panel.getConnection().setFrom(meta.from());
                        }

                        @Override
                        public boolean[] getManipulateOptions(Panel panel) {
                            return new boolean[]{
                                    panel.getConnection().getTo() == Direction.NONE &&
                                            panel.getConnection().getFrom() == Direction.NONE
                            };
                        }
                    });
    public static final Tool REMOVE_CONNECTION =
            new Tool("remove_connection", 1, new GameToolManipulator(Tools.REMOVE_CONNECTION) {
                @Override
                public void manipulate(Panel panel, ToolManipulatorInfo info) {
                    panel.getConnection().setTo(Direction.NONE);
                    panel.getConnection().setFrom(Direction.NONE);
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[]{
                            panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE
                    };
                }
            });
    public static final Tool REVERSE_CONNECTION =
            new Tool("reverse_connection", 1, new GameToolManipulator(Tools.REVERSE_CONNECTION) {
                @Override
                public void manipulate(Panel panel, ToolManipulatorInfo info) {
                    Direction from = panel.getConnection().getFrom();
                    Direction to = panel.getConnection().getTo();
                    panel.getConnection().setFrom(to);
                    panel.getConnection().setTo(from);
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[]{
                            panel.getConnection().getTo() != Direction.NONE &&
                                    panel.getConnection().getFrom() != Direction.NONE
                    };
                }
            });
    public static final Tool CHANGE_DURATION =
            new Tool("change_duration", 1,
                    new MetaBackedGameToolManipulator<ToolChangeDurationMeta>(
                            Tools.CHANGE_DURATION, ToolChangeDurationMeta.class) {

                        @Override
                        public void manipulatePanel(Panel panel, ToolChangeDurationMeta meta) {
                            panel.setDuration(meta.duration());
                        }

                        @Override
                        public boolean[] getManipulateOptions(Panel panel) {
                            return new boolean[]{
                                    panel.getConnection().getTo() != Direction.NONE &&
                                            panel.getConnection().getFrom() != Direction.NONE
                            };
                        }
                    });
    public static final Tool WEAK_REPAIR_PANEL =
            new Tool("weak_repair_panel", 3, new GameToolManipulator(Tools.WEAK_REPAIR_PANEL) {
                @Override
                public void manipulate(Panel panel, ToolManipulatorInfo info) {
                    double chance = Math.random() * 100;
                    if (panel.isBurntout()) {
                        if (chance <= 50) {
                            panel.setBurntout(false);
                        }
                    } else {
                        panel.setBurntout(true);
                    }
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[0];
                }
            });
    public static final Tool STRONG_REPAIR_PANEL =
            new Tool("strong_repair_panel", 3, new GameToolManipulator(Tools.STRONG_REPAIR_PANEL) {
                @Override
                public void manipulate(Panel panel, ToolManipulatorInfo info) {
                    double chance = Math.random() * 100;
                    if (panel.isBurntout()) {
                        if (chance <= 90) {
                            panel.setBurntout(false);
                        }
                    } else {
                        panel.setBurntout(true);
                    }
                }

                @Override
                public boolean[] getManipulateOptions(Panel panel) {
                    return new boolean[0];
                }
            });

    public static void injectTools() throws NoSuchFieldException, IllegalAccessException {
        setTool("ADD_CONNECTION", ADD_CONNECTION);
        setTool("REMOVE_CONNECTION", REMOVE_CONNECTION);
        setTool("REVERSE_CONNECTION", REVERSE_CONNECTION);
        setTool("CHANGE_DURATION", CHANGE_DURATION);
        setTool("WEAK_REPAIR_PANEL", WEAK_REPAIR_PANEL);
        setTool("STRONG_REPAIR_PANEL", STRONG_REPAIR_PANEL);
    }

    private static void setTool(String tool, Tool to) throws NoSuchFieldException, IllegalAccessException {
        Field toolField = Tools.class.getDeclaredField(tool);
        toolField.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(toolField, toolField.getModifiers() & ~Modifier.FINAL);

        toolField.set(null, to);
    }
}
