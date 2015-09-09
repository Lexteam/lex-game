package uk.jamierocks.lexteam.ygd.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.jamierocks.lexteam.ygd.core.Game;
import uk.jamierocks.lexteam.ygd.core.data.key.Key;
import uk.jamierocks.lexteam.ygd.core.data.value.Value;
import uk.jamierocks.lexteam.ygd.game.data.DataManager;

/**
 * The implementation of {@link Game}.
 *
 * @author Jamie Mansfield
 */
public class GameLaunch implements Game {

    public final Logger logger = LoggerFactory.getLogger("lex-game");

    public GameLaunch() {
    }

    public static void main(String[] args) {
        new GameLaunch();
    }

    @Override
    public <T> T get(Key<Value<T>> key) {
        return DataManager.get(this, key);
    }

    @Override
    public <T> void offer(Key<Value<T>> key, T value) {
        // Coming soon...
    }

    @Override
    public <T> boolean has(Key<Value<T>> key) {
        return DataManager.has(this, key);
    }
}
