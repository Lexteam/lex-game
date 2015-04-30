#include "BaseModel.h"
#ifndef _H_CAMERA_H_
#define _H_CAMERA_H_
namespace Engine {

	class Camera : public Engine::BaseModel,
		public Engine::Transformable
	{
		public:
			Camera() {};
			~Camera() {};
		private:
			virtual void draw(sf::RenderTarget& target, sf::RenderStates states = sf::RenderStates::Default);
	};

}
#endif
