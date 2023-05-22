package dk.sdu.mmmi.cbse.collision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CollisionDetectorTest {
    
    public CollisionDetectorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of collides method, of class CollisionDetector.
     */
    @Test
    public void testCollides() {
        PositionPart positionPart = new PositionPart(0, 0, 0);

        Entity entity = new Entity();
        entity.add(positionPart);
        entity.setRadius(10);

        Entity entity2 = new Entity();
        entity2.add(positionPart);
        entity2.setRadius(10);

        CollisionDetector instance = new CollisionDetector();
        Boolean result = instance.collides(entity, entity2);
        assertEquals(true, result);
    }
}
