#include <assimp\Importer.hpp>
#include <assimp\scene.h>
#include "Camera.h"
#include "Model.h"
#include "Light.h"
#include "Tile.h"
#include <vector>

#ifndef _H_ESCENEGRAPH_H_
#define _H_ESCENEGRAPH_H_

namespace Engine {

	class Scene :sf::Drawable {
		public:
			//repersents aiScene, simple loadup class
			//puts data in render data :)
				Scene(std::string Filename)
				{
					
				}


				Engine::TileSize Sizeoftile;

				//Data in the Scene used for rendering
				//Theese are placeholders to internal buffers
				//so you can't do any native opengl with the class
				//But Can Do SFML! :)
				struct RenderData
				{
					public:

						std::vector<Engine::VAO> Meshes;


						std::vector<Engine::Model> Models;
						std::vector<Engine::Light>  Lights;
						std::vector<aiMaterial> materials;

						Engine::Camera RenderCamera;
						Engine::Model Room;

				};


		private:

			aiScene scene;

			bool readscenefile();

			//just renders Everything (apart from the materials/textures) In RenderData
			virtual void draw(sf::RenderTarget &target, sf::RenderStates states);
	};

};

#endif //_H_ESCENEGRAPH_H_
