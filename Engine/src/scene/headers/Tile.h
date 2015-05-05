#include "TileSize.h"

#ifndef _H_TILE_H_
#define _H_TILE_H_

namespace Engine {

	//Utility class for positions vectors in the game
	class Tile {
		public:
			Tile(sf::Vector3<int> Tilepos, TileSize& tilesize) :
				TilePos(Tilepos),
				size(tilesize)
			{}

			~Tile() {};

			///gets///

			sf::Vector3<int> getTile() { return TilePos; }

			sf::Vector3<int> getPos()
			{
				return sf::Vector3<int>(TilePos.x * size.getTileSize().x,
					TilePos.y * size.getTileSize().y, TilePos.z * size.getTileSize().z);
			}

			///sets///
			bool setTile(sf::Vector3<int> Tilepos) { TilePos = Tilepos; return true; }

		private:
			sf::Vector3<int> TilePos;
			TileSize &size;
	};

}
#endif //H_TILE_H_
