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
                if(index < Textures.size()){
                    Textures.push_back(texture);
                    return true;
                }
                else{return false;}
            }
            bool removeTexRefrence(Engine::Texture &texture)
            {
                if(index < Textures.size()){
                    Textures.pop_back();
                    return true;
                }
                else{return false;}
            }
            //false: operation failed
            bool Engine::Texture getTexture(unsigned index)
            {
                if(index < Textures.size()){
                    Textures[index];
                    return true;
                }
                else{return false;}
            }

            ///sets///
            //Uniforms only
			bool setparam(std::string Varname, float variable);
			bool setparam(std::string Varname, glm::vec2 vec2);
			bool setparam(std::string Varname, glm::vec3 vec3);
			bool setparam(std::string Varname, glm::vec4 vec4);

            ///gets///
            // Uniforms only
            float getparam(std::string Varname);
            glm::vec2 getparam(std::string Varname);
            glm::vec3 getparam(std::string Varname);
            glm::vec4 getparam(std::string Varname);

        protected:
            friend Material;
            GLint GetProgID(){return ProgID};

        private:
            std::vector<std::refrence_wrapper<Enigne::Texture>> Textures;

            bool compile(std::string data);

            GLint ProgID;
    };

}

#endif // _H_SHADER_H_
