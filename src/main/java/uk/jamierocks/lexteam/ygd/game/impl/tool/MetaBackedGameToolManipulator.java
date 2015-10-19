package uk.jamierocks.lexteam.ygd.game.impl.tool;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.Meta;
import uk.jamierocks.lexteam.ygd.core.panel.Panel;
import uk.jamierocks.lexteam.ygd.core.tool.Tool;
import uk.jamierocks.lexteam.ygd.core.tool.ToolManipulatorInfo;

/**
 * Extension to {@link GameToolManipulator}, to manipulate with meta directly.
 *
 * @author Jamie Mansfield
 */
public abstract class MetaBackedGameToolManipulator<M extends Meta> extends GameToolManipulator {

    private final Class<M> metaClazz;

    public MetaBackedGameToolManipulator(Tool tool, Class<M> metaClazz) {
        super(tool);
        this.metaClazz = metaClazz;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void manipulate(Panel panel, ToolManipulatorInfo info) {
        if (info.supportsMeta(this.metaClazz)) {
            this.manipulatePanel(panel, info.obtainMeta(this.metaClazz));
        }
    }

    public abstract void manipulatePanel(Panel panel, M meta);
}
