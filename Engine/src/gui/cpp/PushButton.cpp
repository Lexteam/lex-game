#include "PushButton.h"

bool Engine::PushButton::setpadding(int pixels)
{
	int ratio = pixels/padding;
	BackgroundButton.setScale(sf::Vector2f(ratio,ratio));
	return true;
}

bool Engine::PushButton::setposition(sf::Vector2f pos)
{
	BackgroundButton.setPosition(pos);

	pos.x = (pos.x / 2) - (text.getGlobalBounds.getPosition().x/4);//midpoint - midpoint / 2
	pos.y = (pos.y / 2) + (text.getGlobalBounds.getPosition().y/4);

	text.setPosition(pos);
}

bool Engine::PushButton::SetButtonSize(sf::Vector2u size)
{
	sf::Vector2u oSize = BackgroundButton.getTexture()->getSize();
	BackgroundButton.setScale((oSize.x / size.x), (oSize.y / size.y));
	text.setScale(BackgroundButton.getScale());
	return true;
}

bool Engine::PushButton::bbCollide(int x, int y)
{
	sf::Vector2f pos = BackgroundButton.getPosition();
	sf::Vector2u size = BackgroundButton.getTexture()->getSize();

	if (x < pos.x && x > pos.x - size.x
		&& y < pos.y && y > pos.y - size.y)
	{
		return true;
	}

	else {
		return false;
	}
}

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
