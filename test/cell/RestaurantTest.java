package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class RestaurantTest {
    @Test
    public void testRenderMethod() {
        Restaurant facility = new Restaurant();
        assertTrue(facility.render() == 'r');
        System.out.println("Class Restaurant render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        Restaurant facility = new Restaurant();
        assertTrue(facility.isHumanPass());
        System.out.println("Class Restaurant isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        Restaurant facility = new Restaurant();
        assertTrue(!facility.isAnimalPass());
        System.out.println("Class Restaurant isAnimalPass predicate correct");
    }
}
