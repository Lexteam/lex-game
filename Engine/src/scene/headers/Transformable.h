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
        //in Positions NOT Tiles!
		glm::vec3 getScale()  {return Scale;}

		glm::vec3 getRotation() { return Rotation; }

		///sets///

		bool setRotation(glm::vec3 rotation){Rotation = rotation; return true;}
		bool setRotation(float x, float y, float z);

		//in-game mesurements
		bool setScale(Engine::Tile scale){Scale = scale.getPos(); return true;}

        //opengl measurements
		bool setScale(float x, float y, float z){Scale = glm::vec3(x, y, z); return true;}



	protected:
		glm::vec3 Scale;
		glm::vec3 Rotation;
	};
}
#endif //_H_TRANSFORMABLE_H_
