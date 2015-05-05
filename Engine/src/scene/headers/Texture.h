#include<SFML/OpenGL.hpp>
#include<string>
#include <SOIL.h>


#ifndef _H_TEXTURE_H_
#define _H_TEXTURE_H_

namespace Engine
{
        //type of processing used when genrating textures
    enum TextureFilterType{Linear = GL_LINEAR, Nearest = GL_NEAREST};

    //wrapping types for processing textures
    enum TextureWrappingType{Repeat = GL_REPEAT, MirroredRepeat = GL_MIRRORED_REPEAT,
                                ClampToEdge = GL_CLAMP_TO_EDGE, ClampToBorder = GL_CLAMP_TO_BORDER};

    //convience class
    class Image
    {
        public:
            Image(std::string filename, bool RGB)
            {
                setImage(filename, RBG);
            }
            setImage(std::string newfilename, bool RBG)
            {

            }
        private:
            friend Texture;
            char* data;
    };

    //3D repesentation of sf::texture
    class Texture
    {
        public:
            Texture(std::string imagefilename);
            Texture(Engine::Image &img);

            //cleanup
            ~Texture();

            ///sets///

            //binds an image to the texture
            bind(Engine::Image &img);

            //sets the Filter type for the texture /defualt = Nearest
            setFilterType(Engine::TextureFilterType TexType, Engine::TextureFilterType MipmapType=TexType);

            setWrapping(Engine::WrappingType);

        private:

            generateMipMaps();

            GLint texture;
    };

}

#endif // _H_TEXTURE_H_
