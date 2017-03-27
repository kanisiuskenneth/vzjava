package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class RoadTest {
    @Test
    public void testRenderMethod() {
        Road facility = new Road();
        assertTrue(facility.render()=='.');
        System.out.println("Class Road render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        Road facility = new Road();
        assertTrue(facility.isHumanPass());
        System.out.println("Class Road isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        Road facility = new Road();
        assertTrue(!facility.isAnimalPass());
        System.out.println("Class Road isAnimalPass predicate correct");
    }
}
