package uk.jamierocks.lexteam.ygd.core.meta.api;

import java.util.Optional;

public interface MetaProcessor<M extends Meta> {

    Class<M> getMetaType();

    boolean supports(MetaOwner container);

    Optional<M> getMetaFromContainer(MetaOwner container);
}
