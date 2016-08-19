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
package xyz.lexteam.ygd.game.graphic.meta;

import xyz.lexteam.meta.api.MetaQuery;
import xyz.lexteam.meta.api.QueriesBase;

/**
 * @author Ethan Riley
 */
public class Queries extends QueriesBase{

    public static final MetaQuery MODELINSTANCE = of("ModelInstance");
    public static final MetaQuery PARTICLEEFFECT = of("ParticleEffect");
    public static final MetaQuery MATERIAL = of("Material");
    public static final MetaQuery SHADERPROGRAM = of("ShaderProgram");
    public static final MetaQuery SHADERS = of("Shaders");

}
