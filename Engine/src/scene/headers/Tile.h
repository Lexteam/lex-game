#include "TileSize.h"

#ifndef _H_TILE_H_
#define _H_TILE_H_

namespace Engine {


	//Utility class for positions vectors in the game
	class Tile {
		public:
			Tile(glm::tvec3<int> tilepos, TileSize& tilesize) :
				TilePos(tilepos),
				size(tilesize)
			{

			}

			~Tile() {};

			///gets///

			glm::tvec3<int> getTile() { return TilePos; }

			glm::tvec3<int> getPos()
			{
				return size.getTileSize() * TilePos;
			}

			///sets///
			bool setTile(glm::tvec3<int> Tilepos) { TilePos = Tilepos; return true; }

			TileSize& getTileSize() { return size; }

		private:
			glm::vec3 TilePos;
			TileSize &size;
	};

	static Engine::Tile ToTile(glm::vec3 pos, TileSize size)
	{
		return Tile(pos / size.getTileSize(), size);
	}

}
#endif //H_TILE_H_
