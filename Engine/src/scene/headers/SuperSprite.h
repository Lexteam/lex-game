#include <GL/glew.h>
#include <SFML/OpenGL.hpp>
#include <SFML/Graphics.hpp>
#include <string>
#include <fstream>
#include <glm/glm.hpp>
#include <vector>

#ifndef _H_SUPERSPRITE_H_
#define _H_SUPERSPRITE_H_
namespace Engine
{
    static SuperSpritesUsed = 0;

    const static unsigned MaxSuperSprites = 16;

    class Texture;

    class SuperSprite
    {
        public:

            SuperSprite(Engine::SpriteImage sprite)
            {
                if(SuperSprite < MaxSuperSprites)
                {
                    ++SuperSpriteUsed;
                    addSprite(sprite);
                }
                else
                {
                    throw("too many SuperSprites");
                    ~SuperSprite(); //commit Suicide
                }
            }

            ~SuperSprite()
            {
                if(std::uncaught_exception())
                {
                    catch(std::exception e)
                    {
                        std::cerr<< "ERROR:" << e <<std::endl;
                    }
                }//carry on distruction as normal

                --SuperSpritesUsed;
            }

            //recreates the supersprite <Warning> creates a new thread to work on, preformance heavy
            bool update();

            //adds a sprite tobe genrated does not call generate/update
            addSprite(Engine::SpriteImage sprite);

            //removes a sprite tobe genrated does not call genrate/update
            removeSprite(std::string Spritename);

            unsigned* LoadImageDataBlock(std::string spritename);

        private:
            static std::vector<Engine::SpriteImage> SpriteBlocks;

            std::fstream ImageStream;

    }

    //data holder
    class SpriteImage
    {
        public:
            SpriteImage(glm::vec2 SpriteBoundry, std::string Spritename):
                Boundry(SpriteBoundry),
                name(Spritename)
            {
            }

            glm::vec2 getBoundry() {return Boundry;}

            std::string getName() {return name;}
        private:
            glm::vec2 Boundry;

            std::string name;

    };

}
#endif // _H_SUPERSPRITE_H_
