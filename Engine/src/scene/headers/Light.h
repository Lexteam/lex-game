#include "BaseModel.h"
#include "Transformable.h"

#ifndef _H_LIGHT_H_
#define _H_LIGHT_H_

namespace Engine
{

	enum LightingMethod { Sun, point, spotlight, hemisphere, area };

	static Engine::Shader DefualtLightingShader("DLightShader.glsl");

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
                bool setShader(Engine::Shader &shader);
                bool setShader(GLuint ShaderProgramID);

                //using Defualt shader
                bool setStrength(GLuint strength)
                {
                    shader.setparam("Strength", strength);
					return true;
                }

                //sets the type of algrorithm used when lighting e.g.sun
                bool setLightingMethod(Engine::LightingMethod type);

			private:

                Engine::Shader& shader;

				//renders the light
				virtual void draw(sf::RenderTarget &target, sf::RenderStates = sf::RenderStates::Default);
		};
}

#endif
