module Asteroid {
    exports dk.sdu.mmmi.cbse.asteroid;

    requires Common;

    provides dk.sdu.mmmi.cbse.common.services.IGamePluginService with dk.sdu.mmmi.cbse.asteroid.AsteroidPlugin;

}