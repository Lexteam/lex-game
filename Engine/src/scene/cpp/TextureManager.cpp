#include "../headers/TextureManager.h"

std::fstream Engine::SpriteImage::LogFile("boundries.dump", std::ios::trunc | std::ios::out );
bool Engine::SpriteImage::log_and_distruct()
{
    std::lock_guard<std::mutex> guard(dump_mutex);
    LogFile << std::to_string(Boundry.x) << ',' << std::to_string(Boundry.y) << ',' << std::to_string(ID);
    return true;
}

