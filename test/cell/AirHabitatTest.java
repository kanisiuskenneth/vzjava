package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */

public class AirHabitatTest {
    @Test
    public void testRenderMethod() {
        AirHabitat hab = new AirHabitat();
        assertTrue(hab.render()=='a');
        System.out.println("Class AirHabitat render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        AirHabitat hab = new AirHabitat();
        assertTrue(!hab.isHumanPass());
        System.out.println("Class AirHabitat isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        AirHabitat hab = new AirHabitat();
        assertTrue(hab.isAnimalPass());
        System.out.println("Class AirHabitat isAnimalPass predicate correct");
    }
}
