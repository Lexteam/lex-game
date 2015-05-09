#include <SFML\Graphics.hpp>
#include <vector>
#include <glm/glm.hpp>
#include "Tile.h"


#ifndef _H_BASEMODEL_H_
#define _H_BASEMODEL_H_

namespace Engine {

	class Scene;

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
                pos.w = 1;//tmp
			}
			bool setPos(Engine::Tile Tilepos)
			{
                pos.x = static_cast<float>(Tilepos.getPos().x);
				pos.y = static_cast<float>(Tilepos.getPos().y);
				pos.z = static_cast<float>(Tilepos.getPos().z);
				pos.w = 1.0f;//temp
			}

			///gets///

			glm::vec4 getModelPos(){ return pos; }

		protected:

            friend class Scene;

			//use Pesudo Constructor in Engine::Scene
			BaseModel()
			{

			}

            glm::vec4 pos;

		private:

	};


}

#endif //_H_BASEMODEL_H_
