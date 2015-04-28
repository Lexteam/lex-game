#include "Tile.h"
#include "Scenegraph.h"
#include <assimp\mesh.h>
#include <assimp\material.h>
#include <vector>


#ifndef _H_BASEMODEL_H_
#define _H_BASEMODEL_H_

namespace Engine {

	class BaseModel :public sf::Drawable{
		public:

			virtual bool loadFromScene(Engine::Scene &scene) = 0;

			virtual	~BaseModel() {

			}

			///sets///
			
			virtual bool setModelPos(float x, float y, float z) = 0;

			virtual bool setModelPos(Engine::Tile pos) = 0;

			///gets///

			virtual sf::Vector3f getModelPos() = 0;

		protected:

			friend Scene;
			sf::Vector3<float> pos;
		
		private:

			//Override
			virtual void draw(sf::RenderTarget &target, sf::RenderStates states) = 0;

	};

	//3d transformable
	class Transformable {
		
		public:

			virtual ~Transformable() {

			}

			///gets///
			
			virtual Engine::Tile getSize() = 0;

			virtual Engine::Tile getScale() = 0;

			virtual sf::Vector3f getRotation() = 0;

			///sets///

			virtual bool setSize(Engine::Tile size) = 0;
			virtual bool setSize(float x, float y, float z) = 0;

			virtual bool setRotation(sf::Vector3f Rotation) = 0;
			virtual bool setRotation(float x, float y, float z) = 0;

			virtual bool setScale(Engine::Tile Scale) = 0;
			virtual bool setScale(float x, float y, float z) = 0;

		protected:
			sf::Vector3<float> Scale;
			sf::Vector3<unsigned> Size;
			sf::Vector3<float> Rotation;
	};
}

#endif //_H_BASEMODEL_H_