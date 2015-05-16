#include <GL/gl.h>
#include <GL/glu.h>
#include <glm/glm.hpp>
#include <SFML/Graphics.hpp>
#include "Texture.h"
#include <functional>

#ifndef _H_SHADER_H_
#define _H_SHADER_H_

namespace Engine
{
	const static unsigned MaxTexUnits = 16;

    class Material;
    class Shader
    {
        public:
            Shader(std::string shaderfilename)
            {

            }
            Shader(GLint ProgID)
            {

            }

            bool addTexRefrence(Engine::Texture &texture)
            {
                if(MaxTexUnits < Textures.size()){
					Textures.push_back(texture);
                    return true;
                }
                else{return false;}
            }
            bool PopTexRefrence()
            {
                if(1 <= Textures.size()){
                    Textures.pop_back();
                    return true;
                }
                else{return false;}
			}

            //false: operation failed
            bool getTexture(unsigned index)
            {
                if(index < Textures.size()){
                    Textures[index];
                    return true;
                }
                else{return false;}
            }

            ///sets///
            //Uniforms only
			bool setUniformparam(std::string Varname, GLfloat variable);
			bool setUniformparam(std::string Varname, glm::vec2 vec2);
			bool setUniformparam(std::string Varname, glm::vec3 vec3);
			bool setUniformparam(std::string Varname, glm::vec4 vec4);

            ///gets///
            // Uniforms only
            GLfloat getUniformparam(std::string Varname);
            glm::vec2 getUniformparam(std::string Varname);
            glm::vec3 getUniformparam(std::string Varname);
            glm::vec4 getUniformparam(std::string Varname);

        protected:
            friend Material;

			GLint GetProgID(){ return ProgID; };

        private:
            std::vector<std::reference_wrapper<Engine::Texture>> Textures;

            bool compile(std::string data);

            bool updateTextures();

            GLint ProgID;
    };

}

#endif // _H_SHADER_H_
