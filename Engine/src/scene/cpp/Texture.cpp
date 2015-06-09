#include "../headers/Texture.h"


bool Engine::Texture::internalBind(sf::Image &img)
{
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
