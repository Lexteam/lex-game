/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.engine.meta.key;

import uk.jamierocks.meta.api.MetaQuery;
import uk.jamierocks.meta.api.QueriesBase;

/**
 * Created by ethan on 31/10/15.
 */
public final class EngineQueries extends QueriesBase {

    public static final MetaQuery EFFECTS = of("Effects");
    public static final MetaQuery SHADERS = of("Shaders");
    public static final MetaQuery SHADER_PROGRAMS = of("Shader_Programs");
    public static final MetaQuery ANIMATIONS = of("Animations");
    public static final MetaQuery MODEL_INSTANCES = of("Model_Instances");
    public static final MetaQuery MODELS = of("Models");
}
