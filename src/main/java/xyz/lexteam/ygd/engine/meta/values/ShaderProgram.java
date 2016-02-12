/*
 * This file is part of lex-game, licensed All Rights Reserved.
 *
 * Copyright (c) 2015-2016, Lexteam <http://www.lexteam.xyz/>
 * All Rights Reserved.
 */
package xyz.lexteam.ygd.engine.meta.values;

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
