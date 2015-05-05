#include <string>
#include <SFML/System.hpp>
#include <SFML/OpenGL.hpp>
#include <SFML/Graphics.hpp>
#include "Texture.h"
#include "Shader.h"

#ifndef _H_MATERIAL_H_
#define _H_MATERIAL_H_

namespace Engine
{


    //Convience class
    class Material
    {
        public:
            // sets the material/texture via image stored in data, No lighting properties
            Material(Engine::Texture &texture)
            {

            }

            //image & shader by data
            Material(Engine::Texture &texture, Engine::Shader &Matshader)
            {

            }

            //cleanup
            ~Material()
            {

            }

            ///sets///

            //sets new shader
            bool setShader(Engine::Shader &shader);

            //sets new texture
            bool setTexture(Engine::Texture &texture);

            ///wappings for shader material///
            bool setAmbientStrength(Glfloat Ambient);

            bool setDiffuseIntestity(GLfloat diffuse);

            //shinyniness
            bool setSpecular(GLfloat Gloss);



			///gets///

            Engine::Shader* getShader(){}

            private:
                Engine::Shader *Mat;
                Engine::Texture &Tex;

    };

}

#endif // _H_MATERIAL_H_
