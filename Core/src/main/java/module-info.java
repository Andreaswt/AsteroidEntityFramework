module Core {
    requires Common;
    requires Player;
    requires Asteroid;
    requires java.desktop;
    requires com.badlogic.gdx;
    uses dk.sdu.mmmi.cbse.common.services.IGamePluginService;
    uses dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
    uses dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
}


