package uk.jamierocks.lexteam.ygd.core.tool;

import uk.jamierocks.lexteam.ygd.core.data.key.Keys;
import uk.jamierocks.lexteam.ygd.core.panel.Direction;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;

/**
 * A class containing the variety of tools within the game.
 *
 * @author Jamie Mansfield
 * @author Tom
 */
public final class Tools {

    /**
     * Tool that can add a new connection to a blank panel.
     */
    public static final Tool ADD_CONNECTION = new Tool("add_connection", 1, new ToolManipulator() {
        @Override
        public void manipulate(Panel panel, ToolManipulatorInfo info) {
            panel.getConnection().setTo(info.get(Keys.DIRECTION_TO));
            panel.getConnection().setFrom(info.get(Keys.DIRECTION_FROM));
        }

        @Override
        public boolean canManipulate(Panel panel) {
            return panel.getConnection().getTo() == Direction.NONE &&
                    panel.getConnection().getFrom() == Direction.NONE &&
                    !panel.isCoolingDown() &&
                    !panel.isFixedPanel();
        }
    });

    /**
     * Tool that clears a panel's connection.
     */
    public static final Tool REMOVE_CONNECTION = new Tool("remove_connection", 1, new ToolManipulator() {
        @Override
        public void manipulate(Panel panel, ToolManipulatorInfo info) {
            panel.getConnection().setTo(Direction.NONE);
            panel.getConnection().setFrom(Direction.NONE);
        }

        @Override
        public boolean canManipulate(Panel panel) {
            return panel.getConnection().getTo() != Direction.NONE &&
                    panel.getConnection().getFrom() != Direction.NONE &&
                     !panel.isCoolingDown() &&
                    !panel.isFixedPanel();
        }
    });

    /**
     * Tool that reverses a panel's connection, so that the 'to' becomes the 'from', and vise versa.
     */
    public static final Tool REVERSE_CONNECTION = new Tool("reverse_connection", 1, new ToolManipulator() {
        @Override
        public void manipulate(Panel panel, ToolManipulatorInfo info) {
            Direction from = panel.getConnection().getFrom();
            Direction to = panel.getConnection().getTo();
            panel.getConnection().setFrom(to);
            panel.getConnection().setTo(from);
        }

        @Override
        public boolean canManipulate(Panel panel) {
            return panel.getConnection().getTo() != Direction.NONE &&
                    panel.getConnection().getFrom() != Direction.NONE &&
                    !panel.isCoolingDown() &&
                    !panel.isFixedPanel();
        }
    });

    /**
     * Tool that can change the duration of a panel's pulse.
     */
    public static final Tool CHANGE_DURATION = new Tool("change_duration", 1, new ToolManipulator() {
        @Override
        public void manipulate(Panel panel, ToolManipulatorInfo info) {
            panel.setDuration(info.get(Keys.DURATION));
        }

        @Override
        public boolean canManipulate(Panel panel) {
            return panel.getConnection().getTo() != Direction.NONE &&
                    panel.getConnection().getFrom() != Direction.NONE &&
                    !panel.isCoolingDown() &&
                    !panel.isFixedPanel();
        }
    });

    /**
     * Tools that repairs burnt out panels.
     */
    public static final Tool WEAK_REPAIR_PANEL = new Tool("weak_repair_panel", 3, new ToolManipulator() {
        @Override
        public void manipulate(Panel panel, ToolManipulatorInfo info) {
            double chance = Math.random() * 100;
            if(panel.isBurntout()){
                if (chance <= 50) {
                    panel.setBurntout(false);
                }
            }
            else{
                panel.setBurntout(true);
            }
        }

        @Override
        public boolean canManipulate(Panel panel) {
            return !panel.isCoolingDown() &&
                    !panel.isFixedPanel();
        }
    });

    public static final Tool STRONG_REPAIR_PANEL = new Tool("strong_repair_panel", 3, new ToolManipulator() {
        @Override
        public void manipulate(Panel panel, ToolManipulatorInfo info) {
            double chance = Math.random() * 100;
            if(panel.isBurntout()){
                if (chance <= 90) {
                    panel.setBurntout(false);
                }
            }
            else{
                panel.setBurntout(true);
            }
        }

        @Override
        public boolean canManipulate(Panel panel) {
            return !panel.isCoolingDown() &&
                    !panel.isFixedPanel();
        }
    });
}
