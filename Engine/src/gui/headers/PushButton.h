#include "Button.h"

#ifndef _H_PUSHBUTTON_H_
#define _H_PUSHBUTTON_H_


namespace Engine {
	class PushButton : Engine::Button{
		public:

			PushButton(std::string Text, sf::Font &font, sf::Texture &ButtonTex)
			{
			    disable(false);
				setTexture(ButtonTex);
				setFont(font);
				setText(Text);
				padding = 2;
			}

			//For a texture based button (No text)
			PushButton(sf::Texture &ButtonTex)
			{
				setTexture(ButtonTex);
				padding = 2;
			}

			virtual ~PushButton()
			{

			}

		private:
			virtual bool CheckEvents(sf::RenderWindow &window);
	};
};
#endif
