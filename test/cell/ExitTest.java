package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class ExitTest {
    @Test
    public void testRenderMethod() {
        Exit facility = new Exit();
        assertTrue(facility.render()=='x');
        System.out.println("Class Exit render method correct");
    }

    @Test
    public void testIsHumanPassPredicate() {
        Exit facility = new Exit();
        assertTrue(facility.isHumanPass());
        System.out.println("Class Exit isHumanPass predicate correct");
    }

    @Test
    public void testIsAnimalPassPredicate() {
        Exit facility = new Exit();
        assertTrue(!facility.isAnimalPass());
        System.out.println("Class Exit isAnimalPass predicate correct");
    }
}
