#include "..\headers\Shader.h"

bool Engine::Shader::setUniformparam(std::string Varname, GLfloat variable)
{
	GLuint VarRef = glGetUniformLocation(ProgID, Varname.c_str());
	glUniform1f(VarRef, variable);
	return true;
}