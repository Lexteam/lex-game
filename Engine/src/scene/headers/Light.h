#include "BaseModel.h"
#include "Transformable.h"
#include "Shader.h"

#ifndef _H_LIGHT_H_
#define _H_LIGHT_H_

namespace Engine
{

	enum LightingMethod { Sun, point, spotlight, hemisphere, area };

	static Engine::Shader DefualtLightingShader("DLightShader.glsl", Engine::ShaderType::Geometry);



	//Used as a convenience class for lighting
	class Light :public Engine::BaseModel,
			public Engine::Transformable
		{
			public:
				Light(LightingMethod type, glm::vec3 pos, Engine::Shader &lightShader = Engine::DefualtLightingShader):
					shader(lightShader)
				{
					//stuff
				}

				//pos is set at 0,0
				Light(LightingMethod type, Engine::Shader &lightShader = Engine::DefualtLightingShader):
					shader(lightShader)
				{
					//stuff
				}

                //used for setting properties of the light
                bool setShaderProgram(Engine::ShaderProgram &shader);
                bool setShaderProgram(GLuint ShaderProgramID);

                //using Defualt shader
                bool setStrength(GLfloat strength)
                {
                    shader.setUniformparam("Strength", strength);
					return true;
                }

                //sets the type of algrorithm used when lighting e.g.sun
                bool setLightingMethod(Engine::LightingMethod type);

                //replaces the defualt form of the light
                bool AddVBO(Engine::VBO &VertexData){VertexObject = VertexData;}

			private:

                Engine::VBO &VertexObject;

                Engine::ShaderProgram &shader;

				//renders the light
				virtual void draw(sf::RenderTarget &target, sf::RenderStates = sf::RenderStates::Default);
		};
}

#endif
