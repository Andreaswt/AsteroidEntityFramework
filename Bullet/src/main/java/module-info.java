import dk.sdu.mmmi.cbse.common.services.BulletSPI;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module Bullet {
    requires Common;
    provides IGamePluginService with dk.sdu.mmmi.cbse.bullet.BulletPlugin;
    provides BulletSPI with dk.sdu.mmmi.cbse.bullet.BulletControlSystem;
    provides IEntityProcessingService with dk.sdu.mmmi.cbse.bullet.BulletControlSystem;
}