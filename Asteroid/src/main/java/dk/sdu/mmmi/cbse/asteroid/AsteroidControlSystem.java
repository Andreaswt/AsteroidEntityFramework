package dk.sdu.mmmi.cbse.asteroid;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;

import java.util.Random;

public class AsteroidControlSystem implements IEntityProcessingService {

    @Override
    public void process(GameData gameData, World world) {

        for (Entity player : world.getEntities(Asteroid.class)) {
            PositionPart positionPart = player.getPart(PositionPart.class);

            Random rand = new Random();
            MovingPart movingPart = player.getPart(MovingPart.class);
            movingPart.setLeft(rand.nextBoolean());
            movingPart.setRight(rand.nextBoolean());
            movingPart.setUp(rand.nextBoolean());
            movingPart.process(gameData, player);

            positionPart.process(gameData, player);
            updateShape(player);
        }
    }

    private void updateShape(Entity entity) {
        float[] shapex = entity.getShapeX();
        float[] shapey = entity.getShapeY();
        PositionPart positionPart = entity.getPart(PositionPart.class);
        float x = positionPart.getX();
        float y = positionPart.getY();
        float radians = positionPart.getRadians();

        shapex[0] = (x - 20);
        shapey[0] = (y + 20);

        // Create a square for the shape of the asteroid
        shapex[1] = (x + 20);
        shapey[1] = (y + 20);

        shapex[2] = (x + 20);
        shapey[2] = (y - 20);

        shapex[3] = (x - 20);
        shapey[3] = (y - 20);

        entity.setShapeX(shapex);
        entity.setShapeY(shapey);
    }
}
