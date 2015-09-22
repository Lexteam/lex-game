package uk.jamierocks.lexteam.ygd.game.impl.meta.processor;

import uk.jamierocks.lexteam.ygd.core.meta.GameMeta;
import uk.jamierocks.lexteam.ygd.core.meta.api.MetaOwner;
import uk.jamierocks.lexteam.ygd.core.meta.api.MetaProcessor;
import uk.jamierocks.lexteam.ygd.game.impl.LexGame;

import java.util.Optional;

public class GameMetaProcessor implements MetaProcessor<GameMeta> {

    @Override
    public Class<GameMeta> getMetaType() {
        return GameMeta.class;
    }

    @Override
    public boolean supports(MetaOwner container) {
        return container instanceof LexGame;
    }

    @Override
    public Optional<GameMeta> getMetaFromContainer(MetaOwner container) {
        if (container instanceof LexGame) {
            return Optional.of((LexGame) container);
        }
        return Optional.empty();
    }
}
