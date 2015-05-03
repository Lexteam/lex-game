#include <SFML\Graphics.hpp>
#include <vector>
#include "Tile.h"


#ifndef _H_BASEMODEL_H_
#define _H_BASEMODEL_H_

namespace Engine {

	class BaseModel : sf::Drawable
	{
		public:

			virtual	~BaseModel() {

			}

			///sets///
			
			bool setPos(float x, float y, float z);
			bool setPos(Engine::Tile pos);

			///gets///

			sf::Vector3f getModelPos();

		protected:

			//use Pesudo Constructor in Engine::Scene
			BaseModel() 
			{

			}

			sf::Vector3<float> pos;
		
		private:

	};


}

#endif //_H_BASEMODEL_H_