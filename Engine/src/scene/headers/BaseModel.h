#include <SFML\Graphics.hpp>
#include <vector>
#include "Tile.h"
#include "Scenegraph.h


#ifndef _H_BASEMODEL_H_
#define _H_BASEMODEL_H_

namespace Engine {

	class BaseModel : sf::Drawable
	{
		public:

			virtual	~BaseModel()
			{

			}

			///sets///

            //notice not meant for heavy use see Transform instead
			bool setPos(float x, float y, float z)
			{
                pos.x = x;
                pos.y = y;
                pos.z = z;
                pos.w = 0;
			}
			bool setPos(Engine::Tile Tilepos)
			{
                pos = Tilepos.getpos();
			}

			///gets///

			sf::Vector4f getModelPos();

		protected:

            friend Scene;

			//use Pesudo Constructor in Engine::Scene
			BaseModel()
			{

			}

			sf::Vector4<float> pos;

		private:

	};


}

#endif //_H_BASEMODEL_H_
