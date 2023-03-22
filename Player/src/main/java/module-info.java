import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module Player {
    requires Common;
    uses dk.sdu.mmmi.cbse.common.services.BulletSPI;
    provides IGamePluginService with dk.sdu.mmmi.cbse.player.PlayerPlugin;
    provides IEntityProcessingService with dk.sdu.mmmi.cbse.player.PlayerControlSystem;
}