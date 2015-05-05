#include "BaseModel.h"
#include "Transformable.h"
#include <SFML\OpenGL.hpp>
#include <assimp\mesh.h>
#include <assimp\material.h>
#include <assimp\scene.h>
#include <assimp\postprocess.h>
#include "Scenegraph.h"
#include "Material.h"


#ifndef _H_MODEL_H_
#define _H_MODEL_H_

namespace Engine {

    //used for defining models that are(graphically) the same
    class VAO
    {
        public:
            VAO(std::string ModelName);

        protected:
              friend Model;
              vector<float> vertcies;
        private:
            VAO(const &VAO)
            VAO& operator=(const VAO Rhs);
    };

	//Model class used for interacting with Assimp/Opengl
	class Model : public BaseModel,
					public Transformable
    {
        protected:
            Model(VAO vertexData){}

		public:
            //sets material in modelbool setUVs(sf::vector4<float> UVs);
            Model(VAO vertexData, Engine::Material &mat)
            {
                setMaterial(mat);
            }

            //massive cleanup
			~Model()
			{

            }

			///sets///
			//keep material
			bool setMaterial(Engine::Material &Mat);

			bool setUVs(sf::vector4<float> UVs);

			bool setNormals(sf::vector4<float> Normals);

			///gets///
			//can be NULL
			Engine::Material* getSettedMaterial();

			//can be NULL
			std::vector<sf::vector4<float>>* getUVs();

            //can be NULL
            std::vector<sf::vector3<float>>* getNormals();

		private:

			//draws the 3D model
			virtual void draw(sf::RenderTarget& target, sf::RenderStates states = sf::RenderStates::Default);

            Engine::Material* material;

            std::vector<sf::vector4<float>>* UVs;

            std::vector<sf::vector3<float>>* Normals;

            GLuint VBO;

            GLuint EBO;
	};
};
#endif //_H_MODEL_H_
