/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.game.impl.service.event;

import uk.jamierocks.eventbus.IEventBus;
import uk.jamierocks.lexteam.ygd.core.service.event.Events;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GameEvents {

    public static void initialise(IEventBus eventBus) throws NoSuchFieldException, IllegalAccessException {
        Field field = Events.class.getDeclaredField("EVENT_BUS");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, eventBus);
    }
}
