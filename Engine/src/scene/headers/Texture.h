#include <GL/glew.h>
#include <SFML/OpenGL.hpp> //only works on MSVC
#include <SFML/Graphics.hpp>
#include <string>
#include <SOIL/SOIL.h>
#include <glm/glm.hpp>



#ifndef _H_TEXTURE_H_
#define _H_TEXTURE_H_

namespace Engine
{
    class Shader;

        //type of processing used when generating textures
    enum TextureFilterType{Linear = GL_LINEAR, Nearest = GL_NEAREST};

    //wrapping types for processing textures
    enum TextureWrappingType{Repeat = GL_REPEAT, MirroredRepeat = GL_MIRRORED_REPEAT,
                                ClampToEdge = GL_CLAMP_TO_EDGE, ClampToBorder = GL_CLAMP_TO_BORDER
						};


	//note can do an OR operation with x, y and z  (do x, y and z at the same time)
    enum dimention {x = GL_TEXTURE_WRAP_S, y = GL_TEXTURE_WRAP_T};

    //3D repesentation of sf::texture
    class Texture
    {
        public:
            //keep the image can change dimentions but may prove with undifined results
            Texture(sf::Image &img, glm::tvec2<GLsizei> sizeofimage):
				Img(img)
            {
				internalBind();
            }

            //cleanup
            ~Texture();

            ///sets///

            //binds an image to the texture
			bool bind(sf::Image &img) { Img = img; internalBind(); return true; }

            sf::Vector2u  getImageSize() {return Img.getSize();}

            //sets the Filter type for the texture /sdefualt = Nearest
			bool setFilterType(Engine::TextureFilterType TexType, Engine::TextureFilterType MipmapType, Engine::dimention dim);

			//sets both mipmap & texture type
			bool setFilterType(Engine::TextureFilterType MagnifyingType, Engine::TextureFilterType MinifyingType);

			//sets the border wapping of the texture
			bool setWrapping(Engine::TextureWrappingType WrappingType, Engine::dimention dim);

        private:
            friend Shader;

			bool internalBind();

            sf::Image &Img;

            GLuint texture;
    };

}

#endif // _H_TEXTURE_H_
