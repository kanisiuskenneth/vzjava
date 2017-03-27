package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class LandHabitatTest {
    @Test
    public void testRenderMethod() {
        LandHabitat hab = new LandHabitat();
        assertTrue(hab.render()=='l');
        System.out.println("Class LandHabitat render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        LandHabitat hab = new LandHabitat();
        assertTrue(!hab.isHumanPass());
        System.out.println("Class LandHabitat isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        LandHabitat hab = new LandHabitat();
        assertTrue(hab.isAnimalPass());
        System.out.println("Class LandHabitat isAnimalPass predicate correct");
    }
}
