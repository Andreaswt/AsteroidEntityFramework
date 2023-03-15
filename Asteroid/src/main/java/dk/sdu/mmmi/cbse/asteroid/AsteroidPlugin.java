package dk.sdu.mmmi.cbse.asteroid;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AsteroidPlugin implements IGamePluginService {
    private List<Entity> asteroids;

    public AsteroidPlugin() {
    }

    @Override
    public void start(GameData gameData, World world) {
        asteroids = createAsteroids(gameData);

        for (Entity asteroid : asteroids) {
            world.addEntity(asteroid);
        }
    }

    private List<Entity> createAsteroids(GameData gameData) {
        List<Entity> asteroids = new ArrayList();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            float speed = (float) Math.random() * rand.nextFloat(40f, 60f);
            float radians = 3.1415f / 2 + rand.nextFloat(10f, 100f);
            float x = gameData.getDisplayWidth() - rand.nextInt(0, gameData.getDisplayWidth());
            float y = gameData.getDisplayHeight() - rand.nextInt(0, gameData.getDisplayWidth());

            Entity asteroid = new Asteroid();
            asteroid.add(new MovingPart(0, speed, speed, 0));
            asteroid.add(new PositionPart(x, y, radians));

            asteroids.add(asteroid);
        }

        return asteroids;
    }

    @Override
    public void stop(GameData gameData, World world) {
        for (Entity asteroid : asteroids) {
            world.removeEntity(asteroid);
        }
    }
}
