/*
 * Copyright (c) 2015, Jamie Mansfield <https://www.jamierocks.uk>
 * Copyright (c) 2015, Tom Drever <https://github.com/CharlesStewart>
 * Copyright (c) 2015, Ethan Riley <https://github.com/EthanRiley>
 *
 * All Rights Reserved.
 */
package com.gmail.riley787cmplex.engine.meta.values;

import com.flowpowered.math.vector.VectorNf;

import java.util.Map;

/**
 *  Object-Orientated implementation of shader programs in OpenGL
 */
public class ShaderProgram {

    ShaderProgram(Shader vertShader, Shader fragShader){

    }

    public void addShader(Shader shader){

    }



    public void link(){

    }


    public int getUniform(String uniformName){
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
