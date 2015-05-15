#include <string>
#include <SFML/System.hpp>
#include <SFML/Graphics.hpp>
#include "Texture.h"
#include "Shader.h"
#include <functional>

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
            Material(Engine::Shader &Matshader = DefaultMatShader):
				Mat(Matshader)
            {

            }

            //cleanup
            ~Material()
            {

            }

            ///sets///

            //sets new shader
            bool setShader(Engine::Shader &shader){shaders[0] = shader; return true;}

            //adds a new shader to use
            bool PushbackShaders(Engine::Shader &shader){shaders.push_back(shader); return true;}

            //can't remove 1st shader only beacuse shaders(normally) depend on each other
            bool pop_backShaders()
            {
                if(shaders.size() != 1){
                    shaders.pop_back();
                    return true;
                }
                else{
                    return false;
                }
            }

            //bind new base texture to material
            bool setTexture(Engine::Texture &texture);

            ///wappings for shader material///
            bool setAmbientStrength(GLfloat Ambient);

            bool setDiffuseIntestity(GLfloat Diffuse);

            //shinyniness
            bool setSpecular(GLfloat Gloss);


            Engine::Shader& getShaderRef(unsigned index)
            {
                if(shaders.size() < index)
                return Shaders[index];
                else throw("not in shaders range check your code for numerical errors");
            }

			///gets///
            //gets a refrence to the shader
            Engine::Texture& getTexture(unsigned index = 0U, unsigned Texindex){return shaders[index].GetTexture(Texindex);}

            private:

                std::vector<std::refrence_wrapper<Engine::Shader>> shaders;

    };

}

#endif // _H_MATERIAL_H_
