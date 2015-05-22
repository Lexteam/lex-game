#include "..\headers\ShaderProgram.h"

//compilation & linking
bool Engine::Shader::compile(std::string data)
{
    glShaderSource(ShaderID, data.size(), data.c_str(), 1);
    glCompileShader(ShaderID);
    return true;
}

//Uniform wrappers
bool Engine::ShaderProgram::setUniformparam(std::string Varname, GLfloat variable)
{
    if(!VarRefMap.find(Varname)){
        GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
        VarRefMap[Varname] =  VarRef;
    }
	glUniform1f(VarRefMap[Varname], variable);
	return true;
}

bool Engine::ShaderProgram::setUniformparam(std::string Varname, glm::vec2 vec)
{
    if(!VarRefMap.find(Varname)){
        GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
        VarRefMap[Varname] =  VarRef;
    }
    glUniform2f(VarRef, vec.x, vec.y);
    return true;
}

bool Engine::ShaderProgram::setUniformparam(std::string Varname, glm::vec3 vec)
{
    if(!VarRefMap.find(Varname)){
        GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
        VarRefMap[Varname] =  VarRef;
    }
    glUniform3f(VarRef, vec.x, vec.y, vec.z);
    return true;
}

//getters
GLfloat Engine::ShaderProgram::getUniformparam(std::string Varname)
{
    if(!VarRefMap.find(Varname)){
        GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
        VarRefMap[Varname] =  VarRef;
    }
    GLfloat value;
    glGetUniformfv(ProgID, VarRefMap[Varname], &value);
    return value;
}

//Texture manipulation
bool Engine::ShaderProgram::addTexRefrence(Engine::Texture &texture)
{

    else{return false;}
}

bool Engine::ShaderProgram::PopTexRefrence()
{
    if(1 <= Textures.size()){
        Textures.pop_back();
       return true;
    }
    else{return false;}
}

bool Engine::ShaderProgram::getTexture(unsigned index)
{
    if(index < Textures.size()){
           Textures[index];
           return true;
    }
    else{return false;}
}
