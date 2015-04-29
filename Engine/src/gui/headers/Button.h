#include <SFML\Window.hpp>
#include <SFML\Graphics.hpp>
#include <SFML\OpenGL.hpp>

#include<string>

#ifndef _H_BUTTON_H_
#define _H_BUTTON_H_
namespace Engine {
	class Button : sf::Drawable {
	public:

		virtual ~Button() = 0;

		//also Includes Alpha
		bool setButtonColour(sf::Color Colour)
		{
			BackgroundButton.setColor(Colour);
			return true;
		}

		//set function to a the buttons event slot do not delete the function!(if thats possible)
		bool setSignal(void(*Func)())
		{
			SignalFunc = *Func;
		}

		//resets the Texture only use with a new varible if using same see sf::Texture::update
		bool setTexture(sf::Texture &texture, bool resetInternalRect = false)
		{
			BackgroundButton.setTexture(texture, resetInternalRect);
			return true;
		}

		//sets LH corner of the Background 
		bool setPosition(sf::Vector2f pos);

		//rotates All via orgin see Set orgin
		bool setRotation(sf::Vector2f rot);

		//rotates text via buttons orgin
		bool setTextRotation(sf::Vector2f rot);

		bool setPadding(float pixels);

		bool disableButton(bool enable = true) { Enabled = enable; return true; }

		///Use theese for working with the Label///
		bool setButtonSize(sf::Vector2u size);

		bool setTextColour(sf::Color Colour) { text.setColor(Colour); return true; }

		//keep font  
		bool setFont(sf::Font &font) { text.setFont(font); return true; };

		//keep string
		bool setText(std::string txt) { text.setString(txt); return true; }

	private:

		//Supposed to be added to the SFML Render thread
		//draws the text & the sprite
		virtual void draw(sf::RenderTarget& target, sf::RenderStates states)
		{
			target.draw(BackgroundButton, states);
			target.draw(text, states);
		}

		//Supposed to be added to the SFML Render thread
		//checks collision events between the mouse & the button  
		virtual bool CheckEvents(sf::RenderWindow &window) = 0;

	protected:
		sf::Text text;
		sf::Sprite BackgroundButton;
		int padding;
		void(*SignalFunc)();
		bool bbCollide(int x, int y);
		
		bool Enabled;
	};
};
#endif