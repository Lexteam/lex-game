#include <GL/glew.h>
#include <SFML/OpenGL.hpp>
#include <SFML/Graphics.hpp>
#include <string>
#include <fstream>
#include <glm/glm.hpp>
#include <vector>
#include <iostream>

#ifndef _H_TextureManager_H_
#define _H_TextureManager_H_
namespace Engine
{
    const static std::fstream BoundryDump("Boundires.bin", ios::app);

    class Texture;

	//data holder
	class SpriteImage
	{
        public:
            //SpriteBoundRect: the part of the sprite to be loaded
            SpriteImage(glm::vec2t<float> SpriteBoundRect, std::string SpriteFilename) :
                Filename(Spritename)
                Boundry(SpriteBoundRect)
            {
            }

            //allocates the whole file to the sprite
            SpriteImage(std::string SpriteFilename) :
                Filename(Spritename)
            {
            }

            //dump Boundry to Boundryfile
            ~SpriteImage()
            {
                BoundryDump << Boundry.x << ',' << Boundry.y << ID;

            }
            glm::vec2 getBoundry() { return Boundry; }

            int getID() {return ID;}
        private:
            static unsigned SpriteImagesUsed = 0;

            int ID;

            glm::vec2 Boundry;

            std::string Filename;

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

            static unsigned TextureManagersUsed = 0;

            const static unsigned MaxTextureManagers = 16;

            //recreates the TextureManager <Warning> creates a new thread to work on temporally, preformance heavy
            bool genratePixDumpFile();

            static std::vector<Engine::SpriteImage> SpriteBoundries;

            std::fstream SpriteStream;

	};

}
#endif // _H_TextureManager_H_
