#include "BaseModel.h"
#include "Transformable.h"


#ifndef _H_MODEL_H_
#define _H_MODEL_H_

namespace Engine {

	//Model class used for interacting with assimp/opengl
	class Model : public BaseModel,
					public Transformable{
		public:

			~Model()
			{

			}

			

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
			
			virtual void draw(sf::RenderTarget& target, sf::RenderStates states = sf::RenderStates::Default);
			aiMesh mesh;

	};
};
#endif //_H_MODEL_H_
