package uk.jamierocks.lexteam.ygd.game.launch;

import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

/**
 * @author Jamie Mansfield
 */
public class GameTweaker implements ITweaker {

    private Logger logger = LoggerFactory.getLogger("lex-game-launch");
    private List<String> args;

    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {
        this.args = args;
    }

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader) {
        logger.info("Loading lex-game");
    }

    @Override
    public String getLaunchTarget() {
        return "uk.jamierocks.lexteam.ygd.game.GameLaunch";
    }

    @Override
    public String[] getLaunchArguments() {
        return args.toArray(new String[args.size()]);
    }
}
