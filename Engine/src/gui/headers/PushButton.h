#include <SFML\Window.hpp>
#include <SFML\Graphics.hpp>
#include <SFML\OpenGL.hpp>

#include<string>

#ifndef _H_PUSHBUTTON_H_
#define _H_PUSHBUTTON_H_


namespace Engine {
	class PushButton : sf::Drawable{
		public:

			PushButton(std::string Text, sf::Font &font,sf::Texture &ButtonTex) :
			text(Text,font),
			BackgroundButton(ButtonTex)
			{
				padding = 2;
			}

			virtual ~PushButton() 
			{
				
			}
			
			//also Includes Alpha
			bool setButtonColour(sf::Color Colour) 
			{
				BackgroundButton.setColor(Colour);
				return true;
			}
			
			//set function to a the buttons event slot do not delete the function!(if thats possible)
			bool setsignal(void(*Func)())
			{
				SignalFunc = *Func;
			}
			
			//sets the Texture of the button 
			bool setTexture(sf::Texture &texture, bool resetInternalRect = false) 
			{ 
				BackgroundButton.setTexture(texture, resetInternalRect); 
				return true;
			}

			//sets LH corner of the Background
			bool setposition(sf::Vector2f pos);

			//sets padding for the text
			bool setpadding(float pixels);

			bool disableButton(bool enable = true){}

			//Use theese for working with the Label
			bool SetButtonSize(sf::Vector2u size);

			//Sets Text Colour & Alpha
			bool SetTextColour(sf::Color Colour) { text.setColor(Colour); return true; }
			
			//keep font  
			bool SetFont(sf::Font &font) { text.setFont(font); return true; };

		private:

			//Supposed to be added to the SFML Render thread
			//draws the text & the sprite
			void draw(sf::RenderTarget& target, sf::RenderStates states)
			{	
				target.draw(BackgroundButton, states);
				target.draw(text, states);	
			}

			//Supposed to be added to the SFML Render thread
			//checks collision events between the mouse & the button  
			bool CheckEvents(sf::RenderWindow &window);

			sf::Text text;
			sf::Sprite BackgroundButton;
			int padding;
			void(*SignalFunc)();
			bool bbCollide(int x,int y);

	};
};
#endif
