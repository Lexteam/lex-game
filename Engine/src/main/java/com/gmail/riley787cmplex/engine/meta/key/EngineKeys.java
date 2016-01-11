/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package com.gmail.riley787cmplex.engine.meta.key;

import com.google.common.collect.BiMap;

import com.gmail.riley787cmplex.engine.meta.values.Effect;
import com.gmail.riley787cmplex.engine.meta.values.Model;
import com.gmail.riley787cmplex.engine.meta.values.ModelInstance;
import com.gmail.riley787cmplex.engine.meta.values.Shader;
import com.gmail.riley787cmplex.engine.meta.values.ShaderProgram;
import com.gmail.riley787cmplex.engine.meta.values.Animation;

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
