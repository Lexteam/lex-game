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

            template<typename T>
            ///sets///
            bool setparam(std::string Varname, T variable)
            bool setparam(std::string Varname, vector2<T> vec2)
            bool setparam(std::string Varname, vector3<T> vec3)
            bool setparam(std::string Varname, vector4<T> vec4)

            ///gets///
            T getparam(std::string Varname);
            vector2<T> getparam(std::string Varname);
            vector3<T> getparam(std::string Varname);
            vector4<T> getparam(std::string Varname);

        private:
            compile(std::string data);

            GLint ProgID;
    };

}

#endif // _H_SHADER_H_
