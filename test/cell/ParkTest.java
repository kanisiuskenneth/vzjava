package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class ParkTest {
    @Test
    public void testRenderMethod() {
        Park facility = new Park();
        assertTrue(facility.render()=='*');
        System.out.println("Class Park render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        Park facility = new Park();
        assertTrue(facility.isHumanPass());
        System.out.println("Class Park isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        Park facility = new Park();
        assertTrue(!facility.isAnimalPass());
        System.out.println("Class Park isAnimalPass predicate correct");
    }
}
