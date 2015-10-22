package uk.jamierocks.lexteam.ygd.core.service.meta;

import uk.jamierocks.lexteam.ygd.core.meta.builder.MetaManipulatorBuilder;
import uk.jamierocks.lexteam.ygd.core.meta.manipulator.MetaManipulator;

public interface IMetaService {

    <T extends MetaManipulator> MetaManipulatorBuilder<T> getMetaManipulatorBuilder(Class<T> clazz);
}
