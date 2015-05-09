#include <GL/gl.h>
#include <GL/glu.h>
#include <glm/glm.hpp>

#ifndef _H_SHADER_H_
#define _H_SHADER_H_

namespace Engine
{
    class Shader
    {
        public:
            Shader(std::string shaderfilename)
            {

            }
            Shader(GLint ProgID)
            {

            }

			
            ///sets///
			template < typename T > bool setparam(std::string Varname, T variable);
			template < typename T > bool setparam(std::string Varname, glm::tvec2<T> vec2);
			template < typename T >	bool setparam(std::string Varname, glm::tvec3<T> vec3);
			template < typename T > bool setparam(std::string Varname, glm::tvec4<T> vec4);

            ///gets///
			template < typename T > T getparam(std::string Varname);
			template < typename T > glm::tvec2<T> getparam(std::string Varname);
			template < typename T > glm::tvec3<T> getparam(std::string Varname);
			template < typename T > glm::tvec4<T> getparam(std::string Varname);

        private:
            bool compile(std::string data);

            GLint ProgID;
    };

}

#endif // _H_SHADER_H_
