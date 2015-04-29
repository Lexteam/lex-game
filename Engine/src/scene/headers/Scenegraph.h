#include <assimp\Importer.hpp>
#include <assimp\scene.h>
#include "Camera.h"
#include "Model.h"
#include "Light.h"
#include <vector>

#ifndef _H_ESCENEGRAPH_H_
#define _H_ESCENEGRAPH_H_

namespace Engine {
	
	class Scene :sf::Drawable {
		public:
			//repersents aiScene, simple loadup class

				Scene(std::string Filename) {
					//do stuff
				}

				

				//returns a fully loaded Class Pesudo Constructor 
				std::vector<Engine::Model> getModels();
				std::vector<Engine::Camera> getCameras();
				std::vector<Engine::Light> getLights();
				
				//Data in the Scene used for rendering 
				//Theese are placeholders to internal buffers 
				//so you can't do any native opengl with the class
				//But Can Do SFML! :)
				static struct RenderData 
				{
					public:

						std::vector<Engine::Model> Models;
						std::vector<Engine::Camera> Cameras;
						std::vector<Engine::Light>  Lights;
						
						std::vector<aiMaterial> materials;

				};


		private:

			aiScene scene;
			friend BaseModel;
			
			//just renders Everything (apart from the materials/textures) In RenderData
			virtual void draw(sf::RenderTarget &target, sf::RenderStates states);
	};

};

#endif //_H_ESCENEGRAPH_H_
