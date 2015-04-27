#include "Tile.h"
#include <assimp\Importer.hpp>
#include <assimp\scene.h>
#include <assimp\mesh.h>
#include <assimp\material.h>
#include <vector>

#ifndef _H_MODEL_H_
#define _H_MODEL_H_

class Model{

	Model(aiScene &Scene){
		
	}
	
	bool setMaterial(aiMaterial &material);

	bool setModelPos(float x,float y,float z);

	bool setModelPos(sf::Vector3f pos);

	sf::Vector3f getModelPos();

	private:
		aiMesh Mesh;
};

#endif //_H_MODEL_H_