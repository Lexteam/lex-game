#include <string>
#include <SFML/System.hpp>
#include <SFML/Graphics.hpp>
#include "Texture.h"
#include "Shader.h"

#ifndef _H_MATERIAL_H_
#define _H_MATERIAL_H_

namespace Engine
{
    static Engine::Shader DefaultMatShader("DMatShader.glsl");

    //Convience class
    class Material
    {
        public:
            // sets the material/texture via image stored in data, Uses deafualt lighting shader
            Material(Engine::Texture &texture, Engine::Shader &Matshader = DefaultMatShader):
				Mat(Matshader),
				Tex(texture)
            {

            }

            //cleanup
            ~Material()
            {

            }

            ///sets///

            //sets new shader
            bool setShader(Engine::Shader &shader){Mat=shader; return true;}

            //bind new texture to material
            bool setTexture(Engine::Texture &texture);

            ///wappings for shader material///
            bool setAmbientStrength(GLfloat Ambient);

            bool setDiffuseIntestity(GLfloat diffuse);

            //shinyniness
            bool setSpecular(GLfloat Gloss);



			///gets///
            //gets a refrence to the shader
            Engine::Shader& getShader(){return Mat;}

            Engine::Texture& getTexture(){return Tex;}

            private:
                Engine::Shader &Mat;
                Engine::Texture &Tex;

    };

}

#endif // _H_MATERIAL_H_
