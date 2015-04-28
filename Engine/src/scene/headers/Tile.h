#include<SFML\Graphics.hpp>

#ifndef _H_TILE_H_
#define _H_TILE_H_

namespace Engine {
	
	//Utilty class for positions vectors in the game
	class Tile {
		public:
			Tile(sf::Vector3<int> Tilepos) :
				TilePos(Tilepos)
			{}

			~Tile() {};

			///gets///

			sf::Vector3<int> getTile() { return TilePos; }
			
			sf::Vector3<int> getPos() 
			{
				return sf::Vector3<int>(TilePos.x * TileSize.x,
					TilePos.y * TileSize.y, TilePos.z * TileSize.z);
			}

			///sets///
			bool setTile(sf::Vector3<int> Tilepos) { TilePos = Tilepos; return true; }

		private:
			sf::Vector3<int> TilePos;
	};
}
#endif //H_TILE_H_