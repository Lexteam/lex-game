package uk.jamierocks.lexteam.ygd.core.meta.builder;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

public interface MetaManipulatorBuilder<M extends MetaManipulator> {

    M create();
}
