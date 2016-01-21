/*
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.engine.meta.key;

import com.google.common.collect.BiMap;
import xyz.lexteam.ygd.engine.meta.values.Animation;
import xyz.lexteam.ygd.engine.meta.values.Effect;
import xyz.lexteam.ygd.engine.meta.values.Model;
import xyz.lexteam.ygd.engine.meta.values.ModelInstance;
import xyz.lexteam.ygd.engine.meta.values.Shader;
import xyz.lexteam.ygd.engine.meta.values.ShaderProgram;
import uk.jamierocks.meta.api.key.Key;
import uk.jamierocks.meta.api.key.KeysBase;
import uk.jamierocks.meta.api.value.Value;

/**
 * Created by ethan on 22/10/15.
 */
public final class EngineKeys extends KeysBase {

    public static final Key<Value<BiMap<String, Effect>>> EFFECTS =
            makeSingleKey(Value.class, EngineQueries.EFFECTS);

    public static final Key<Value<BiMap<String, Shader>>> SHADERS =
            makeSingleKey(Value.class, EngineQueries.SHADERS);

    public static final Key<Value<BiMap<String, ShaderProgram>>> SHADER_PROGRAMS =
            makeSingleKey(Value.class, EngineQueries.SHADER_PROGRAMS);

    public static final Key<Value<BiMap<String, Animation>>> ANIMATIONS =
            makeSingleKey(Value.class, EngineQueries.ANIMATIONS);

    public static final Key<Value<BiMap<Integer, ModelInstance>>> MODEL_INSTANCES =
            makeSingleKey(Value.class, EngineQueries.MODEL_INSTANCES);

    public static final Key<Value<BiMap<String, Model>>> MODELS =
            makeSingleKey(Value.class, EngineQueries.MODELS);

}
