package com.gmail.riley787cmplex.engine.media.data;


import com.flowpowered.math.vector.VectorNf;
import org.lwjgl.opengl.GL;




/**
 * Created by ethan on 28/09/15.
 */
public class Shader extends MediaData<String>{

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
