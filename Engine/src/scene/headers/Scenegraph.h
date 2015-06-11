#include <assimp/Importer.hpp>
#include <assimp/scene.h>
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
				//so you can't do any native opengl with the classes
				//But Can Do SFML! :)
				struct RenderData
				{
					public:

						std::vector<Engine::VBO> VertexData;


						std::vector<Engine::Model> Models;
						std::vector<Engine::Light>  Lights;
						std::vector<Engine::Material> materials;

						Engine::Camera RenderCamera;
						Engine::Model Room;

				};


		private:
			bool readscenefile();

			//just renders Everything In RenderData apart form unused vertexData
			virtual void draw(sf::RenderTarget &target, sf::RenderStates states);
	};

};

#endif //_H_ESCENEGRAPH_H_
