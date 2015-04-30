#include "..\headers\Button.h"



bool Engine::Button::setPadding(float pixels)
{
	float ratio = pixels / padding;
	BackgroundButton.setScale(sf::Vector2f(ratio, ratio));
	return true;
}

bool Engine::Button::setPosition(sf::Vector2f pos)
{
	BackgroundButton.setPosition(pos);

	pos.x = (pos.x / 2) - (text.getPosition().x / 4);//midpoint - midpoint / 2
	pos.y = (pos.y / 2) + (text.getPosition().y / 4);

	text.setPosition(pos);

	return true;
}

bool Engine::Button::setButtonSize(sf::Vector2u size)
{
	sf::Vector2u oSize = BackgroundButton.getTexture()->getSize();
	BackgroundButton.setScale(static_cast<float>((oSize.x / size.x)),
		static_cast<float>(oSize.y / size.y));
	text.setScale(BackgroundButton.getScale());
	return true;
}

bool Engine::Button::bbCollide(int x, int y)
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
