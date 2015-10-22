package uk.jamierocks.lexteam.ygd.core.meta;

import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

import java.util.Optional;

public interface MetaProcessor<M extends MetaManipulator> {

    Class<M> getMetaType();

    boolean supports(MetaOwner container);

    boolean apply(MetaOwner owner, M manipulator);

    Optional<M> getMetaFromContainer(MetaOwner container);
}
