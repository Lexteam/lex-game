#include <glm/glm.hpp>
#ifndef _H_TILESIZE_H_
#define _H_TILESIZE_H_

namespace Engine {
	class Scene;

	class TileSize {
		public:

			const glm::vec3 getTileSize()
			{
				return Size;
			}

		private:
			friend class Scene;

			TileSize() 
			{
			}

			TileSize(unsigned x, unsigned y, unsigned z)
			{
				Size.x = (float)x;
				Size.y = (float)y;
				Size.z = (float)z;
			}

			TileSize(glm::vec3 size)
			{
				Size=size;
			}

			static glm::vec3 Size;

	};


}

#endif //_H_TILESIZE_H_
