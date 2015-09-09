package uk.jamierocks.lexteam.ygd.game.data;

import static uk.jamierocks.lexteam.ygd.core.data.DataManager.registerProcessor;

import uk.jamierocks.lexteam.ygd.game.data.processor.LoggerValueProcessor;

public class Processors {

    public static void registerProcessors() {
        registerProcessor(new LoggerValueProcessor());
    }
}
