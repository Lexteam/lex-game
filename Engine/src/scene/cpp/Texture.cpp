//#include "../../headers/Texture.h"
#include "../../../PROGRAMMING/PROJECTS/lex-game/Engine/src/scene/headers/Texture.h"

bool Engine::Texture::bind(unsigned Dimentions)
{
    glGenTextures(1, &texture);
	switch (Dimentions){
		case 2:
			glBindTexture(GL_TEXTURE_2D, texture);
			glTexImage2D(GL_TEXTURE_2D, 0, Img.type, Img.imagesize.x, Img.imagesize.y,
				0, Img.type, GL_UNSIGNED_BYTE, &Img.data);
			break;
		case 3:
			glBindTexture(GL_TEXTURE_3D, texture);
			glTexImage2D(GL_TEXTURE_3D, 0, Img.type, Img.imagesize.x, Img.imagesize.y,
				0, Img.type, GL_UNSIGNED_BYTE, &Img.data);
			break;
		case 1:
			glBindTexture(GL_TEXTURE_1D, texture);
			glTexImage2D(GL_TEXTURE_1D, 0, Img.type, Img.imagesize.x, Img.imagesize.y,
				0, Img.type, GL_UNSIGNED_BYTE, &Img.data);
			break;
	}
	dimentions = Dimentions;
    return true;
}

bool Engine::Texture::setFilterType(Engine::TextureFilterType MagnifyingType, Engine::TextureFilterType MinifyingType)
{
	switch (dimentions)
	{
		case 2:
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, MagnifyingType);
			glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, MinifyingType);
			break;
		case 3:
			glTexParameteri(GL_TEXTURE_3D, GL_TEXTURE_MAG_FILTER, MagnifyingType);
			glTexParameteri(GL_TEXTURE_3D, GL_TEXTURE_MIN_FILTER, MinifyingType);
			break;
		case 1:
			glTexParameteri(GL_TEXTURE_1D, GL_TEXTURE_MAG_FILTER, MagnifyingType);
			glTexParameteri(GL_TEXTURE_1D, GL_TEXTURE_MIN_FILTER, MinifyingType);
			break;
	}

    return true;
}

bool Engine::Texture::setWrapping(Engine::TextureWrappingType WrappingType, Engine::dimention dim)
{
	switch (dimentions)
	{
		case 2:
			glTexParameteri(GL_TEXTURE_2D, dim, WrappingType);
			break;
		case 3:
			glTexParameteri(GL_TEXTURE_3D, dim, WrappingType);
			break;
		case 1:
			glTexParameteri(GL_TEXTURE_1D, dim, WrappingType);
			break;
	}

	return true;
}
