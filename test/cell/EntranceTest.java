package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class EntranceTest {
    @Test
    public void testRenderMethod() {
        Entrance facility = new Entrance();
        assertTrue(facility.render()=='e');
        System.out.println("Class Entrance render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        Entrance facility = new Entrance();
        assertTrue(facility.isHumanPass());
        System.out.println("Class Entrance isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        Entrance facility = new Entrance();
        assertTrue(!facility.isAnimalPass());
        System.out.println("Class Entrance isAnimalPass predicate correct");
    }
}
