/*
 * Copyright (c) 2015-2016, Lexteam <https://lexteam.jamierocks.uk/>
 * All Rights Reserved.
 */
package uk.jamierocks.lexteam.ygd.engine.meta.values;

public class Shader {

    public enum ShaderType{
        VERTEX,
        FRAGMENT,
        GEOMETRY,
        TESS_CONTROL,
        TESS_EVAL
    }


    public void compile(){

    }

    private ShaderType type;

}
