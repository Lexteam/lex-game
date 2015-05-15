//#include "../headers/Texture.h"
#include "../../../PROGRAMMING/PROJECTS/lex-game/Engine/src/scene/headers/Texture.h"

bool Engine::Texture::internalBind()
{
    glGenTextures(1, &texture);

	glBindTexture(GL_TEXTURE_2D, texture);
	glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, Img.getSize().x, Img.getSize().y,
						0, GL_RGBA, GL_UNSIGNED_BYTE, Img.getPixelsPtr());


    return true;
}

bool Engine::Texture::setFilterType(Engine::TextureFilterType MagnifyingType, Engine::TextureFilterType MinifyingType)
{

    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, MagnifyingType);
    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, MinifyingType);

    return true;
}

bool Engine::Texture::setWrapping(Engine::TextureWrappingType WrappingType, Engine::dimention dim)
{
    glTexParameteri(GL_TEXTURE_2D, dim, WrappingType);
	return true;
}
