#include <atomic>
#include "../headers/TextureManager.h"

Engine::SpriteImage::log_and_distruct()
{
    std::atomic<fstream> LogFile("boundries.dump",std::ios::trunc|std::ios::app);
    fstream Log = LogFile.load()
    Log << Boundry.x << ',' << Boundry.y << ',' << ID;
    LogFile.store(Log);
    return true;
}

