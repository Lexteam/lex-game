#include "BaseModel.h"

namespace Engine {
	//Model class used for interacting with assimp/opengl
	class Model : public BaseModel,
					public Transformable{
		public:
			Model(Engine::Scene &scene) 
			{

			}

			~Model()
			{

			}

			//loads scene class
			virtual bool loadFromScene(Engine::Scene &scene);

			sf::Vector3f getModelSize();

			///sets///
			//keep material
			bool setMaterial(aiMaterial &material);

			//keep texture
			bool setTexture(aiTexture &Tex);

			//colour for every vertce
			bool setColour(sf::Color* ColourArray);

			bool setColour(std::vector<sf::Color> ColourVector);

			//block colour
			bool setColour(sf::Color Colour);

			///gets///
			//returns a vector
			std::vector<sf::Color> getColours();

			//can be NULL
			aiMaterial* getSettedMaterial();

			//can be NULL
			aiTexture* getSettedTexture();

			//can be NULL
			aiUVTransform* getUVs();

		private:
			aiMesh mesh;

	};
};