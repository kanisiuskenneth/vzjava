package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class ElephantTest {
    @Test
    public void testGetWeightMethod() {
        Elephant b = new Elephant("BingBong", 10, 37);
        assertTrue(b.getWeight() == 5200);
        System.out.println("Class Elephant getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Elephant b = new Elephant("BingBong", 10, 37);
        assertTrue(b.getId() == 4);
        System.out.println("Class Elephant getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Elephant b = new Elephant("BingBong", 10, 37);
        assertTrue(b.render() == 's');
        System.out.println("Class Elephant render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Elephant b = new Elephant("BingBong", 10, 37);
        assertTrue((b.getPosition()).row == 10);
        assertTrue((b.getPosition()).col == 37);
        System.out.println("Class Elephant getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Elephant b = new Elephant("BingBong", 10, 37);
        assertTrue(b.getName() == "BingBong");
        System.out.println("Class Elephant getName method correct");
    }
}
