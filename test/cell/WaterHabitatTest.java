package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class WaterHabitatTest {
    @Test
    public void testRenderMethod() {
        WaterHabitat hab = new WaterHabitat();
        assertTrue(hab.render()=='w');
        System.out.println("Class WaterHabitat render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        WaterHabitat hab = new WaterHabitat();
        assertTrue(!hab.isHumanPass());
        System.out.println("Class WaterHabitat isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        WaterHabitat hab = new WaterHabitat();
        assertTrue(hab.isAnimalPass());
        System.out.println("Class WaterHabitat isAnimalPass predicate correct");
    }
}
