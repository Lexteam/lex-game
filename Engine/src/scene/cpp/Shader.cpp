#include "../headers/Shader.h"
//#include "..\..\..\PROGRAMMING\PROJECTS\lex-game\Engine\src\scene\headers\Shader.h"

//compilation & linking
bool Engine::Shader::compile(std::string data)
{
	const GLchar* Sorce = data.c_str();
    glShaderSource(ShaderID, data.size(), &Sorce, NULL);
    glCompileShader(ShaderID);
    return true;
}

//Uniform wrappers
bool Engine::ShaderProgram::setUniformparam(std::string Varname, GLfloat variable)
{
	checkVarMapAndAdd(Varname);
	glUniform1f(VarRefMap[Varname], variable);
	return true;
}

bool Engine::ShaderProgram::setUniformparam(std::string Varname, glm::vec2 vec)
{
	checkVarMapAndAdd(Varname);
    glUniform2f(VarRefMap[Varname], vec.x, vec.y);
    return true;
}

bool Engine::ShaderProgram::setUniformparam(std::string Varname, glm::vec3 vec)
{
	checkVarMapAndAdd(Varname);
    glUniform3f(VarRefMap[Varname], vec.x, vec.y, vec.z);
    return true;
}

bool Engine::ShaderProgram::setUniformparam(std::string Varname, glm::tvec4<float> vec)
{
	checkVarMapAndAdd(Varname);
	glUniform4f(VarRefMap[Varname], vec.x, vec.y, vec.z, vec.w);
	return true;
}

bool Engine::ShaderProgram::checkVarMapAndAdd(std::string Varname)
{
    if (VarRefMap.find(Varname) ==  VarRefMap.end()) {
        GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
        VarRefMap[Varname] = VarRef;
        return true;
    }
    return false;
}

//getters
GLfloat* Engine::ShaderProgram::getUniformparam(std::string Varname)
{
    if(VarRefMap.find(Varname) == VarRefMap.end()){
        GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
        VarRefMap[Varname] =  VarRef;
    }
    GLfloat* value=nullptr;
    glGetUniformfv(ProgID, VarRefMap[Varname], value);
    return value;
}


