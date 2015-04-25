#include<SFML\Graphics.hpp>

#ifndef _H_TILE_H_
#define _H_TILE_H_

//Utilty class for positions in the game
class Tile{
	public:

		//for C++
		Tile(sf::Vector3f Pos)
		{
			pos = Pos;
		}

		//for Java
		Tile(float x, float y, float z):
			pos(x, y, z)
		{
			
		}

		//default constructor
		Tile()
		{

		}

	private:
		sf::Vector3f pos;
};

#endif //H_TILE_H_