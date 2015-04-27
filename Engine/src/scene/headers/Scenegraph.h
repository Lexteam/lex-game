#include <assimp\Importer.hpp>
#include <assimp\scene.h>

#ifndef _H_ESCENEGRAPH_H_
#define _H_ESCENEGRAPH_H_

namespace Engine {
	
	class Scene {
		public:
			//repersents aiScene, simple loadup class

				Scene(std::string Filename) {
					//do stuff
				}

		private:
			aiScene scene;
	};

};

#endif //_H_ESCENEGRAPH_H_
