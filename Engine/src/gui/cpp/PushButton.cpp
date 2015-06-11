#include<SFML/System.hpp>
#include<SFML/Graphics.hpp>

#include "../headers/PushButton.h"
#include "../headers/Button.h"





bool Engine::PushButton::CheckEvents(sf::RenderWindow &window)
{
	if (sf::Mouse::isButtonPressed(sf::Mouse::Button::Left)) {
		sf::Vector2i Mpos = sf::Mouse::getPosition(window);

		if (bbCollide(Mpos.x, Mpos.y)) {
			SignalFunc();
			return true;
		}
		else {
			return false;
		}
	}

	else {
		return false;
	}

}
