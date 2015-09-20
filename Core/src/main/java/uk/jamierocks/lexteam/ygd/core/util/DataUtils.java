package uk.jamierocks.lexteam.ygd.core.util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DataUtils {

    /**
     * Gets the game data directory.
     *
     * @return the data directory.
     */
    public static Path getDataPath() {
        return Paths.get(System.getProperty("user.home"), ".lex-game");
    }
}
