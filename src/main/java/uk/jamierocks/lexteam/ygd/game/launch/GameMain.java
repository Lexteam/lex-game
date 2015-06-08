package uk.jamierocks.lexteam.ygd.game.launch;

import net.minecraft.launchwrapper.Launch;

/**
 * @author Jamie Mansfield
 */
public class GameMain {

    public static void main(String[] args) {
        Launch.main(join(args,
                "--tweakClass", "uk.jamierocks.lexteam.ygd.game.launch.GameTweaker"
        ));
    }

    private static String[] join(String[] args, String... prefix) {
        String[] result = new String[prefix.length + args.length];
        System.arraycopy(prefix, 0, result, 0, prefix.length);
        System.arraycopy(args, 0, result, prefix.length, args.length);
        return result;
    }
}
