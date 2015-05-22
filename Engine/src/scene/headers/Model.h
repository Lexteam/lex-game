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
    class VBO
    {
        public:
            VBO(std::string ModelName);

            //make the client be detered from inline-loading,but pos.
            VBO(std::vector<float> Vertcies)
            {
                vertcies = Vertcies;
            }

            const VBO& operator&(const VBO& Rhs)
            {
                ++Indercies;
                return *this;
            }

        protected:
              friend class Mesh;

              //updates the values of the mesh connected to the VBO
              bool updateIndercieStates(Engine::Mesh& MeshToUpdate);

              bool draw(Engine::Mesh& MeshTodraw);

              GLuint getID(){return ID;}

        private:
            GLuint Indercies;

            std::vector<float> vertcies;

            GLuint ID;

            VBO& operator=(const VBO Rhs){}

			VBO(const VBO &VBO){}

            GLuint EBO;

    };

	//Model class used for interacting with Assimp/Opengl
	class Mesh : public BaseModel,
					public Transformable
    {
		public:
            //sets vertecies and shaders needed for opengl core instanation
            Mesh(VBO &vertexData, Engine::ShaderProgram Material):
				VertexBuffer(vertexData),
				material(mat)
            {
                SetupFaces();
                setMaterial(material);
            }

            //massive cleanup
			~Mesh()
			{
            }

            //adds additional shaders to be compiled with the material
            bool push_backShader(Engine::Shader& shader)
            {
                shaders.push_back(shader);
            }

            //false if shader/s does not exist
            bool remove_shader(Engine::Shader &shader)
            {
                for(unsigned i = 0; i < Shaders.size(); i++){
                    if(Shaders[i] != shader);
                    else {
                        Shaders.erase(i);
                        return true;
                    }
                }
                return false;
            }

            unsigned getShaderVectorSize() {return Shaders.size();}

			///sets///
			//keep material
			bool setMaterial(Engine::ShaderProgram Mat);

			//set UVs/normals

			///gets///
			//can be NULL
			Engine::Material getSettedMaterial() { return material; }

        protected:

            friend Engine::VBO;

            GLuint getVAO(){return VAO;}

            GLuint getSteps(){return Steps;}

            GLuint getIndercieID(){return IndercieID;}

            bool setIndercieID(GLuint Indercie){IncdercieID = Indercie; return true;}

		private:

            bool SetupFaces();

			//draws the 3D mesh
			virtual void draw(sf::RenderTarget& target, sf::RenderStates states = sf::RenderStates::Default);

            Engine::ShaderProgram& material;

            GLuint VAO;

            GLuint Steps;

            GLuint IndercieID;
	};
};
#endif //_H_MODEL_H_
