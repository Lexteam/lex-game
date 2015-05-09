#include "BaseModel.h"
#include "Transformable.h"
#include <assimp\mesh.h>
#include <assimp\material.h>
#include <assimp\scene.h>
#include <assimp\postprocess.h>
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
              friend class Model;
              friend class Scene;

              std::vector<float> vertcies;

			  GLuint ID;

			  GLuint Steps;
        private:
			VAO(const VAO &VAO);
            VAO& operator=(const VAO Rhs);
    };

	//Model class used for interacting with Assimp/Opengl
	class Model : public BaseModel,
					public Transformable
    {
		public:
            //sets material in modelbool setUVs(sf::vector4<float> UVs);
            Model(VAO &vertexData, Engine::Material &mat):
				VertexArray(vertexData),
				material(mat)
            {
                setMaterial(material);
            }

            //massive cleanup
			~Model()
			{
            }

            //adds additional shaders to be compiled with the material
            bool push_backShader(Engine::Shader& shader);

            //false if shader/s does not exist
            bool remove_Shader(unsigned index)
            {
                if(Shaders.size() < index){
					Shaders.erase((Shaders.begin() + index));
                    return true;
                }
				else { return false; };
            }

            unsigned getShaderVectorSize() {return Shaders.size();}

			///sets///
			//keep material
			bool setMaterial(Engine::Material &Mat);

			//set UVs/normals

			///gets///
			//can be NULL
			Engine::Material getSettedMaterial() { return material; }


		private:

            bool setVBO();

            bool setEBO();

			//draws the 3D model
			virtual void draw(sf::RenderTarget& target, sf::RenderStates states = sf::RenderStates::Default);

            Engine::Material& material;

            std::vector<Engine::Shader> Shaders;

			Engine::VAO &VertexArray;

            GLuint VBO;

            GLuint EBO;
	};
};
#endif //_H_MODEL_H_
