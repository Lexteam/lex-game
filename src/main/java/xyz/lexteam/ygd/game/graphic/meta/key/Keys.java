/*
 * Copyright 2015-2016 Lexteam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xyz.lexteam.ygd.game.graphic.meta.key;

import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import xyz.lexteam.meta.api.key.Key;
import xyz.lexteam.meta.api.key.KeysBase;
import xyz.lexteam.meta.api.value.Value;
import xyz.lexteam.ygd.game.graphic.meta.Queries;

/**
 * @author Ethan Riley
 */
public class Keys extends KeysBase{

    public static final Key<Value<ModelInstance>> MODELINSTANCES =
                            makeSingleKey(Value.class, Queries.MODELINSTANCE);

    public static final Key<Value<ParticleEffect>> PARTICLEEFFECTS =
                            makeSingleKey(Value.class, Queries.PARTICLEEFFECT);

    public static final Key<Value<ShaderProgram>> SHADERPROGRAMS =
                            makeSingleKey(Value.class, Queries.SHADERPROGRAM);

    public static final Key<Value<ShaderProgram>> SHADERS =
                            makeSingleKey(Value.class, Queries.SHADERS);

    public static final Key<Value<Material>> MATERIALS =
                            makeSingleKey(Value.class, Queries.MATERIAL);

}
