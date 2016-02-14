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
