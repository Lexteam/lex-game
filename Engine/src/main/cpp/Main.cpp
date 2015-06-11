#include <SFML/Window.hpp>
#include <SFML/Graphics.hpp>
#include <SFML/OpenGL.hpp>

#include <iostream>

int main() {
	sf::ContextSettings Settings;
	Settings.depthBits = 32;
	sf::RenderWindow OpenglWindow(sf::VideoMode(680, 420), "hi opengl", sf::Style::Default, Settings);
	OpenglWindow.setVerticalSyncEnabled(true);

	OpenglWindow.setActive();

	glEnable(GL_DEPTH_TEST);
	glDepthMask(GL_TRUE);
	glClearDepth(1.f);

	glViewport(0, 0, OpenglWindow.getSize().x, OpenglWindow.getSize().y);

	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	GLfloat Winratio = static_cast<float>(OpenglWindow.getSize().x / OpenglWindow.getSize().y);
	glFrustum(-Winratio, Winratio, -1.f, 1.f, 1.f, 500.f);

	static const GLfloat ObjectBufferData[] =
	{	// pos		    //colour
		-20, -20, -20,  0, 0, 1,
		-20,  20, -20,  1, 0, 0,
		-20, -20,  20,  0, 1, 2000,
		-20, -20,  20,  0, 1, 2,
		-20,  20, -20,  1, 0, 1,
		-20,  20,  20,  1, 1, 0,

		20, -20, -20,  0, 0, 0,
		20,  20, -20,  1, 0, 1,
		20, -20,  20,  0, 1, 0,
		20, -20,  20,  0, 1, 1,
		20,  20, -20,  1, 0, 1,
		20,  20,  20,  1, 1, 1,

		-20, -20, -20,  0, 0, 0,
		20, -20, -20,  1, 0, 1,
		-20, -20,  20,  0, 1, 0,
		-20, -20,  20,  0, 1, 1,
		20, -20, -20,  1, 0, 0,
		20, -20,  20,  1, 1, 0.5,

		-20,  20, -20,  0, 0, 0,
		20,  20, -20,  1, 0, 0.7f,
		-20,  20,  20,  0, 1, 0.8f,
		-20,  20,  20,  0, 1, 1,
		20,  20, -20,  1, 0, 0,
		20,  20,  20,  1, 1, 1,

		-20, -20, -20,  0, 0, 1,
		20, -20, -20,  1, 0, 0,
		-20,  20, -20,  0, 1, 1,
		-20,  20, -20,  0, 1, 0,
		20, -20, -20,  1, 0, 1,
		20,  20, -20,  1, 1, 1,

		-20, -20,  20,  0, 0, 0,
		20, -20,  20,  1, 0, 1,
		-20,  20,  20,  0, 1, 0,
		-20,  20,  20,  0, 1, 1,
		20, -20,  20,  1, 0, 0.7f,
		20,  20,  20,  1, 1, 1
	};

	glEnableClientState(GL_VERTEX_ARRAY);
	glVertexPointer(3, GL_FLOAT, 6 * sizeof(GLfloat), ObjectBufferData);
	glEnableClientState(GL_COLOR_ARRAY);
	glColorPointer(3, GL_FLOAT, 6 * sizeof(GLfloat), ObjectBufferData + 3);

	sf::Event e;
	static float xpos = 0.f;
	static float zpos = 0.f;
	static float xRot = 0.f;
	static float yRot = 0.f;

	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	while (OpenglWindow.isOpen()) {
		while (OpenglWindow.pollEvent(e)) {
			if (e.type == sf::Event::Closed) {
				OpenglWindow.close();
			}
			if (e.type == sf::Event::Resized) {
				glViewport(0, 0, e.size.width, e.size.height);
			}
			if (sf::Keyboard::isKeyPressed(sf::Keyboard::W)) {
				++zpos;
			}
			else if (sf::Keyboard::isKeyPressed(sf::Keyboard::S)) {
				--zpos;
			}
			else {
				zpos = 0;
			}
			if (sf::Keyboard::isKeyPressed(sf::Keyboard::A)) {
				++xpos;
			}
			else if (sf::Keyboard::isKeyPressed(sf::Keyboard::D)) {
				--xpos;
			}
			else {
				xpos = 0;
			}
			if (sf::Keyboard::isKeyPressed(sf::Keyboard::Up)) {
				++yRot;
			}
			else if (sf::Keyboard::isKeyPressed(sf::Keyboard::Down)) {
				--yRot;
			}
			else {
				yRot = 0;
			}
			if ( sf::Keyboard::isKeyPressed(sf::Keyboard::Left)) {
				++xRot;
			}
			else if (sf::Keyboard::isKeyPressed(sf::Keyboard::Right)) {
				--xRot;
			}
			else {
				xRot = 0;
			}
		}

		std::cout << zpos << std::endl;


		glTranslatef(xpos, 0, zpos);
		glTranslatef(0.f, 0.f, -100.f);
		glRotatef(xRot, 1.f, 0.f, 0.f);
		glRotatef(yRot, 1.f, 0.f, 1.f);

		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glDrawArrays(GL_TRIANGLES, 0, 36);


		OpenglWindow.pushGLStates();

		OpenglWindow.draw(sf::CircleShape(30.f));

		OpenglWindow.popGLStates();

		glClear(GL_DEPTH_BUFFER_BIT);

		OpenglWindow.display();

	}
	return 0;
}
