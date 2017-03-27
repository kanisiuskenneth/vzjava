package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class DeerTest {
    @Test
    public void testGetWeightMethod() {
        Deer b = new Deer(new StringBuffer("Bambi"), 14, 10);
        assertTrue(b.getWeight() == 50);
        System.out.println("Class Deer getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Deer b = new Deer(new StringBuffer("Bambi"), 14, 10);
        assertTrue(b.getId() == 1);
        System.out.println("Class Deer getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Deer b = new Deer(new StringBuffer("Bambi"), 14, 10);
        assertTrue(b.render() == 'v');
        System.out.println("Class Deer render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Deer b = new Deer(new StringBuffer("Bambi"), 14, 10);
        assertTrue((b.getPosition()).row == 14);
        assertTrue((b.getPosition()).col == 10);
        System.out.println("Class Deer getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Deer b = new Deer(new StringBuffer("Bambi"), 14, 10);
        assertTrue((b.getName().toString()).equals("Bambi"));
        System.out.println("Class Deer getName method correct");
    }
}
