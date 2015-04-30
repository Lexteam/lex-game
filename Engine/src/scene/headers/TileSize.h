#include <SFML\Graphics.hpp>
#ifndef _H_TILESIZE_H_
#define _H_TILESIZE_H_

namespace Engine {
	class TileSize {
	public:

		const sf::Vector3<unsigned> getTileSize()
		{
			return Size;
		}

	private:
		TileSize() {

		}
		TileSize(const unsigned x, const unsigned y, const unsigned z)
		{
			Size.x = x;
			Size.y = y;
			Size.z = z;
		}
		TileSize(const sf::Vector3<unsigned> size)
		{
			Size.x = size.x;
			Size.y = size.y;
			Size.z = size.z;
		}
		sf::Vector3<unsigned> Size;

	};


}

#endif //_H_TILESIZE_H_