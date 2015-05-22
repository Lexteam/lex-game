#include <GL/glew.h>
#include <SFML/OpenGL.hpp>
#include <SFML/Graphics.hpp>
#include <string>
#include <fstream>
#include <glm/glm.hpp>
#include <vector>
#include <iostream>

#ifndef _H_SUPERSPRITE_H_
#define _H_SUPERSPRITE_H_
namespace Engine
{
    static unsigned SuperSpritesUsed = 0;

    const static unsigned MaxSuperSprites = 16;

    class Texture;

	//data holder
	class SpriteImage
	{
	public:
		SpriteImage(glm::vec2 SpriteBoundry, std::string Spritename) :
			Boundry(SpriteBoundry),
			name(Spritename)
		{
		}

		glm::vec2 getBoundry() { return Boundry; }

		std::string getName() { return name; }
	private:
		glm::vec2 Boundry;

		std::string name;

	};

    class SuperSprite
    {
        public:

            SuperSprite(Engine::SpriteImage sprite)
            {
                if(SuperSpritesUsed < MaxSuperSprites)
                {
                    ++SuperSpritesUsed;
                    addSprite(sprite);
                }
				else
				{
					throw "heck";
				}
            }

			~SuperSprite()
			{
				--SuperSpritesUsed;
			}

            //recreates the supersprite <Warning> creates a new thread to work on, preformance heavy
            bool update();

            //adds a sprite tobe genrated does not call generate/update
            bool addSprite(Engine::SpriteImage sprite);

            //removes a sprite tobe genrated does not call genrate/update
            bool removeSprite(std::string Spritename);

            unsigned* LoadImageDataBlock(std::string spritename);

			//concatnates a SuperSprite to this SuperSprite
			//v.preformance heavy last resort Nothrow guarantee
			bool ConcatinateSuperSprite(Engine::SuperSprite& sprite);

        private:
            static std::vector<Engine::SpriteImage> SpriteBlocks;

            std::fstream ImageStream;

	};

}
#endif // _H_SUPERSPRITE_H_
