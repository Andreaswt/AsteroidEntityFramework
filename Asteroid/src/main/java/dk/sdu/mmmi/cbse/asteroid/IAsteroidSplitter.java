package dk.sdu.mmmi.cbse.asteroid;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IAsteroidSplitter {
    void createSplitAsteroid(Entity e, World w);
}
