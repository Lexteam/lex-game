#include "BaseModel.h"

#ifndef _H_LIGHT_H_
#define _H_LIGHT_H_

namespace Engine
{
	enum LightType { Sun, point, spotlight, hemisphere, area };
	//Used as a convience class for lighting
	class Light:public Engine::BaseModel, 
			public Engine::Transformable
		{
			public:
				Light(LightType type, sf::Vector3f pos) 
				{
					//stuff
				}
				Light(LightType type, float x, float y, float z)
				{
					//stuff
				}

			private:
		
		};
}

#endif