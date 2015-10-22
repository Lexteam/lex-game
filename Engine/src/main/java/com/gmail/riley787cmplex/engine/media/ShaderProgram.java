package com.gmail.riley787cmplex.engine.media;

import com.flowpowered.math.vector.VectorNf;
import com.gmail.riley787cmplex.engine.media.data.Shader;
import org.lwjgl.opengl.*;


import java.util.Map;


/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
public class ShaderProgram {

    ShaderProgram(Shader Vertshader, Shader FragShader){

    }

    public void addShader(Shader shader){

    }



    public void link(){

    }





    public Integer getUniform(String uniformName){
        if(uniformLocations.keySet().contains(uniformName)){
            return uniformLocations.get(uniformName);
        }
        else{
            return -1;
        }
    }

    public void setUniform(VectorNf uniformData){

    }



    private Map<String, Integer> uniformLocations;
}
