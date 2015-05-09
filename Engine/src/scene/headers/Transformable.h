#include "Tile.h"

#ifndef _H_TRANSFORMABLE_H_
#define _H_TRANSFORMABLE_H_

namespace Engine {
	//3d transformable
	class Transformable {

	public:
		Transformable()
		{

		}

		virtual ~Transformable() {

		}

		///gets///

		Engine::Tile getSize() {return ToTile(Scale, *Tilesize);}

        glm::vec3 getModelSize() {return Size;}

		Engine::Tile getScale();

		glm::vec3 getRotation();

		///sets///

		bool setSize(Engine::Tile size)
		{
            Size = size.getPos();
			Tilesize = size.getTileSize();
		}

		bool setSize(float x, float y, float z);

		bool setRotation(glm::vec3 Rotation);
		bool setRotation(float x, float y, float z);

		bool setScale(Engine::Tile Scale);
		bool setScale(float x, float y, float z);



	protected:
		Engine::TileSize* Tilesize;

		glm::vec3 Scale;
		glm::tvec3<unsigned> Size;
		glm::vec3 Rotation;
	};
}
#endif //_H_TRANSFORMABLE_H_
