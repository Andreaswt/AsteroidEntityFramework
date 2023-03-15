package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 *
 */
public interface IGamePluginService {

    /**
     * @param gameData
     * @param world
     * @pre The game is already running
     * @post the plugin has been installed
     */
    void start(GameData gameData, World world);

    /**
     * @param gameData
     * @param world
     * @pre The game is already running
     * @post the plugin has been installed
     */
    void stop(GameData gameData, World world);
}
