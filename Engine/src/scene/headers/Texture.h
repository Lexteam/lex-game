#include <GL/glew.h>
#include <SFML/OpenGL.hpp> //only works on MSVC
#include <string>
#include <SOIL/SOIL.h>
#include <glm/glm.hpp>



#ifndef _H_TEXTURE_H_
#define _H_TEXTURE_H_

namespace Engine
{
        //type of processing used when generating textures
    enum TextureFilterType{Linear = GL_LINEAR, Nearest = GL_NEAREST};

    //wrapping types for processing textures
    enum TextureWrappingType{Repeat = GL_REPEAT, MirroredRepeat = GL_MIRRORED_REPEAT,
                                ClampToEdge = GL_CLAMP_TO_EDGE, ClampToBorder = GL_CLAMP_TO_BORDER
						};

    //conviencence class
    class Image
    {
        public:
			enum imagetype { RBG = GL_RGB, RBGA = GL_RGBA };

            Image(std::string filename, imagetype Imagetype)
            {
                setImage(filename, Imagetype);
            }
			bool setImage(std::string newfilename, imagetype Imagetype)
            {
				if (Imagetype = RBGA)SOIL_load_image(newfilename.c_str(), &imagesize.x, &imagesize.y, 0, SOIL_LOAD_RGBA);
				else { SOIL_load_image(newfilename.c_str(), &imagesize.x, &imagesize.y, 0, SOIL_LOAD_RGB); }
				type = Imagetype;
				return true;
            }

        protected:
			friend class Texture;
			imagetype type;
			glm::tvec2<int> imagesize;
            char* data;
    };

	//note can do an OR operation with x, y and z  (do x, y and z at the same time)
    enum dimention {x = GL_TEXTURE_WRAP_S, y = GL_TEXTURE_WRAP_T, z = GL_TEXTURE_WRAP_R};

    //3D repesentation of sf::texture
    class Texture
    {
        public:
            //keep the image can change dimentions but may prove with undifined results
            Texture(Engine::Image &img, glm::tvec2<GLsizei> sizeofimage, unsigned Dimentions = 2):
				Img(img)
            {
                bind(Dimentions);
            }

            //cleanup
            ~Texture();

            ///sets///

            //binds an image to the texture
            bool bind(unsigned Dimentions = 2 );

            bool setImageSize(glm::vec2 size);

            glm::vec2 getImageSize() {return Img.imagesize;}

            //sets the Filter type for the texture /sdefualt = Nearest
			bool setFilterType(Engine::TextureFilterType TexType, Engine::TextureFilterType MipmapType, Engine::dimention dim);

			//sets both mipmap & texture type
			bool setFilterType(Engine::TextureFilterType MagnifyingType, Engine::TextureFilterType MinifyingType);

			//sets the border wapping of the texture
			bool setWrapping(Engine::TextureWrappingType WrappingType, Engine::dimention dim);

        private:
			unsigned dimentions;

            Engine::Image &Img;

            GLuint texture;
    };

}

#endif // _H_TEXTURE_H_
