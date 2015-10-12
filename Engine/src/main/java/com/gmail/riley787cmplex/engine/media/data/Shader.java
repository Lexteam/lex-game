package com.gmail.riley787cmplex.engine.media.data;


import com.flowpowered.math.vector.VectorNf;
import org.lwjgl.opengl.GL;




/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
public class Shader extends MediaDataFriend<String>{

    public Shader(String Filename, String Name, ShaderType Type) {
        super(Name); parse(Filename); type = Type;
    }

    public Shader(String Filename, String Name)
    {
        super(Name); parse(Filename);
    }


    public Shader(String Filename, ShaderType Type) {
        super(Filename);parse(Filename); type = Type;
    }

    public Shader(String Filename){
        super(Filename); parse(Filename);
    }

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
