#include <GL/glew.h>
#include <glm/glm.hpp>
#include <SFML/Graphics.hpp>
#include "Texture.h"
#include <functional>
#include <map>

#ifndef _H_SHADER_H_
#define _H_SHADER_H_

namespace Engine
{
    enum ShaderType{Vertex = GL_VERTEX_SHADER, Fragment = GL_FRAGMENT_SHADER,
                        Geometry = GL_GEOMETRY_SHADER, TesslantaionControl = GL_TESS_CONTROL_SHADER};

    class ShaderProgram
    {
        public:
            ShaderProgram(Engine::Shader &Shadertolink)
            {
                ProgID = glCreateProgram();
                LinkShader(Shadertolink);
            }

            //adds/removes Textures, use if nessasary
            bool addTexture(Engine::Texture &texture);
            bool removeTextue(Engine::Texture &texture);

            //links the shader to the program, use sparingly
            bool LinkShader(Engine::Shader &shader);

            //removes shader from the program, use sparingly
            bool UnlinkShader(Engine::Shader &shader);

            ///sets///
            //Uniforms must be used in the shader
			bool setUniformparam(std::string Varname, GLfloat variable);
			bool setUniformparam(std::string Varname, glm::vec2 vec);
			bool setUniformparam(std::string Varname, glm::vec3 vec);
			bool setUniformparam(std::string Varname, glm::vec4 vec);

            //Replaces a texture via refrence or index better than add or remove texture
            //but still use with care


            ///gets///
            //Uniforms must be used in the shader
            GLfloat getUniformparam(std::string Varname);
            glm::vec2 getUniformparam(std::string Varname);
            glm::vec3 getUniformparam(std::string Varname);
            glm::vec4 getUniformparam(std::string Varname);

            Engine::Texture getTexture(unsigned index){return TextureMap[index]}

        protected:

			GLint GetProgID(){ return ProgID; };

        private:
            std::map<std::reference_wrapper<Engine::Texture>, Guint> TextureMap;

            std::map<std::string, GLuint> VarRefMap;

            std::map<std::reference_wrapper<Engine::Shader>, Guint> ShaderMap;

            bool updateTextures();

            GLuint ProgID;
    };

    class Shader
    {
        public:
            enum Status {Linked, Compiled};

            Shader(std::string shaderfilename, Engine::ShaderType shadertype):
                type(shadertype)
            {
                ShaderID = glCreateShader(type);
            }

            ~Shader()
            {

            }

            Status GetStatus(){return status;}
        protected:
               friend ShaderProgram;

               GetShaderID(){return ShaderID;}

               GetShaderType(){return type;}

        private:
            ShaderType type;

            bool compile(std::string data);

            GLuint ShaderID;

            Status status;

    };
}

#endif // _H_SHADER_H_
