#include "Tile.h"
#include <SFML\Opengl.hpp>

#ifndef _H_TRANSFORMABLE_H_
#define _H_TRANSFORMABLE_H_

namespace Engine {
	//3d transformable
	class Transformable {

	public:

		virtual ~Transformable() {

		}

		///gets///

		Engine::Tile getSize();

        sf::Vector3f getModelSize();

		Engine::Tile getScale();

		sf::Vector3f getRotation();

		///sets///

		bool setSize(Engine::Tile size)
		{
            pos = size.getPos();

		}
		bool setSize(float x, float y, float z);

		bool setRotation(sf::Vector3f Rotation);
		bool setRotation(float x, float y, float z);

		bool setScale(Engine::Tile Scale);
		bool setScale(float x, float y, float z);



	protected:
		sf::Vector3<float> Scale;
		sf::Vector3<unsigned> Size;
		sf::Vector3<float> Rotation;
	};
}
#endif //_H_TRANSFORMABLE_H_
