#include<SFML\Graphics.hpp>

#ifndef _H_TILE_H_
#define _H_TILE_H_

namespace Engine {
	
	static class Tilesize {
		public:
			//call me before any 3D rendering!
			Tilesize(const unsigned x, const unsigned y, const unsigned z)
			{
				Size.x = x;
				Size.y = y;
				Size.z = z;
			}
			Tilesize(const sf::Vector3<unsigned> size)
			{
				Size.x = size.x;
				Size.y = size.y;
				Size.z = size.z;
			}

			const sf::Vector3<unsigned> getTileSize()
			{
				return Size;
			}

		private:
			static 	sf::Vector3<unsigned> Size;

	};

	static Tilesize TileSize;

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
				return sf::Vector3<int>(TilePos.x * TileSize.getTileSize().x,
					TilePos.y * TileSize.getTileSize().y, TilePos.z * TileSize.getTileSize().z);
			}

			///sets///
			bool setTile(sf::Vector3<int> Tilepos) { TilePos = Tilepos; return true; }

		private:
			sf::Vector3<int> TilePos;
	};

}
#endif //H_TILE_H_