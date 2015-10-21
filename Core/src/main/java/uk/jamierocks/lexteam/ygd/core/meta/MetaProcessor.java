package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

import java.util.Optional;

public interface MetaProcessor<M extends MetaManipulator> {

    Class<M> getMetaType();

    boolean supports(MetaOwner container);

    Optional<M> getMetaFromContainer(MetaOwner container);
}
