#include <GL/glew.h>
#include <SFML/OpenGL.hpp>
#include <SFML/Graphics.hpp>
#include <string>
#include <glm/glm.hpp>
#include <glm/vec2.hpp>
#include <vector>
#include <iostream>
#include <fstream>

#ifndef _H_TextureManager_H_
#define _H_TextureManager_H_
namespace Engine
{
    const static std::fstream BoundryDump("Boundires.bin", std::ios::app);

    class Texture;

	//data holder
	class SpriteImage
	{
        public:

            //SpriteBoundRect: the part of the sprite to be loaded
            SpriteImage(glm::tvec2<unsigned> SpriteBoundRect, sf::Image image) :
                Boundry(SpriteBoundRect)
            {
                ++SpriteImagesUsed;
            }

            //part of the sprite
            SpriteImage(glm::tvec2<unsigned> SpriteBoundRect, std::string ImageFilename) :
                Boundry(SpriteBoundRect)
            {
                sf::Image img;
                img.loadFromFile(ImageFilename);
            }

            //allocates the whole file to the sprite
            SpriteImage(std::string SpriteFilename)
            {
                sf::Image img;
                img.loadFromFile(SpriteFilename);
                SpriteImage(glm::tvec2<unsigned>(img.getSize().x, img.getSize().y), img);
            }

            //dump Boundry to Boundryfile
            ~SpriteImage()
            {
                BoundryDump << Boundry.x << ',' << Boundry.y << ',' << ID;
            }
            glm::vec2 getBoundry() { return Boundry; }

            int getID() {return ID;}
        private:
            static unsigned SpriteImagesUsed;

            int ID;

            glm::tvec2<unsigned> Boundry;
	};

    class TextureManager
    {
        public:

            TextureManager(Engine::SpriteImage sprite)
            {
                if(TextureManagersUsed < MaxTextureManagers)
                {
                    ++TextureManagersUsed;
                    addSprite(sprite);
                }
                else
                {

                }
            }

			~TextureManager()
			{
				--TextureManagersUsed;
			}



            //adds a sprite tobe genrated does not call generate/update
            bool addSprite(Engine::SpriteImage sprite);

            //removes a sprite tobe genrated does not call genrate/update
            bool removeSprite(std::string Spritename);

            unsigned* LoadImageDataBlock(std::string spritename);

			//concatnates a TextureManager to this TextureManager
			//v.preformance heavy last resort Nothrow guarantee
			bool ConcatinateTextureManager(Engine::TextureManager& sprite);

        private:

            static unsigned TextureManagersUsed;

            const static unsigned MaxTextureManagers = 16;

            //recreates the TextureManager <Warning> creates a new thread to work on temporally, preformance heavy
            bool genratePixDumpFile();

            static std::vector<Engine::SpriteImage> SpriteBoundries;

            std::fstream SpriteStream;

	};

}
#endif // _H_TextureManager_H_
