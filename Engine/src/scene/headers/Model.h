#include "BaseModel.h"
#include "Transformable.h"
#include <assimp/mesh.h>
#include <assimp/material.h>
#include <assimp/scene.h>
#include <assimp/postprocess.h>
#include "Shader.h"

#ifndef _H_MODEL_H_
#define _H_MODEL_H_

namespace Engine {

    class Mesh;

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

            const VBO& operator=(const VBO& Rhs)
            {
                ++Indercies;
                return *this;
            }

            VBO& operator=(const VBO Rhs) = delete;

			VBO(const VBO &VBO) = delete;

        protected:
              friend Mesh;

              friend class ShaderProgram;

              //adds texture for certain instances
              bool AddTexture(std::vector<std::reference_wrapper<Engine::Mesh>> MeshesToapply, Engine::Texture Tex);

              //
              bool AddTexture(Engine::Mesh& MeshToapply, Engine::Texture Tex);

              //warning: if the old texture is still being used it will not be distroyed
              //for a more generic texture replacement see TextureManager
              bool ReplaceTexture(Engine::Mesh& MeshToapply, Engine::Texture Tex, GLuint oldtex);

              //returns false if has other dependencies use replace instead(if it returns false)
              bool RemoveTex(GLuint tex);

              //updates the values of the mesh connected to the VBO
              bool updateIndercieStates(Engine::Mesh& MeshToUpdate);

              bool draw(Engine::Mesh& MeshTodraw);

              GLuint getID(){return ID;}

        private:


            GLuint Indercies;

            std::vector<float> vertcies;

            GLuint ID;

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
				material(Material)
            {
                SetupFaces();
                setMaterial(material);
            }

            //massive cleanup
			~Mesh()
			{
            }

			///sets///
			//keep material
			bool setMaterial(Engine::ShaderProgram Mat);

			//set UVs/normals

			///gets///
			Engine::ShaderProgram getSettedMaterial() { return material; }

        protected:

            friend Engine::VBO;

            GLuint getVAO(){return VAO;}

            GLuint getSteps(){return Steps;}

            GLuint getIndercieID(){return IndercieID;}

            bool setIndercieID(GLuint Indercie){ IndercieID = Indercie; return true;}

		private:

            bool SetupFaces();

			//draws the 3D mesh
			virtual void draw(sf::RenderTarget& target, sf::RenderStates states = sf::RenderStates::Default);

            Engine::ShaderProgram& material;

            GLuint VAO;

            GLuint Steps;

            GLuint IndercieID;

			Engine::VBO& VertexBuffer;
	};
};
#endif //_H_MODEL_H_
