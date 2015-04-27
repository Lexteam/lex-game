#include "Tile.h"
#include "Scenegraph.h"
#include <assimp\mesh.h>
#include <assimp\material.h>
#include <vector>


#ifndef _H_MODEL_H_
#define _H_MODEL_H_

namespace Engine {

	class Model {
		public:
			friend Scene;

			bool loadFromScene(Engine::Scene &scene);

			///sets///
			//keep material
			bool setMaterial(aiMaterial &material);

			bool setTexture(aiTexture &Tex);

			bool setModelPos(float x, float y, float z);

			bool setModelPos(sf::Vector3f pos);

			//colour for every vertce
			bool setColour(sf::Color* ColourArray);

			bool setColour(std::vector<sf::Color> ColourVector);

			//block colour
			bool setColour(sf::Color Colour);

			///gets///

			sf::Vector3f getModelPos();

			sf::Vector3f getSize();

			sf::Vector3f getScale();

			sf::Vector3f getRotation();

			//returns a vector
			std::vector<sf::Color> getColours();

			//can be NULL
			aiMaterial* getSettedMaterial();

			//can be NULL
			aiTexture* getSettedTexture();

			//can be NULL
			aiUVTransform* getUVs();


		private:
			aiMesh Mesh;
	};
}

#endif //_H_MODEL_H_