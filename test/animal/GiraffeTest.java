package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class GiraffeTest {
    @Test
    public void testGetWeightMethod() {
        Giraffe b = new Giraffe(new StringBuffer("Melman"), 5, 5);
        assertTrue(b.getWeight() == 1500);
        System.out.println("Class Giraffe getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Giraffe b = new Giraffe(new StringBuffer("Melman"), 5, 5);
        assertTrue(b.getId() == 8);
        System.out.println("Class Giraffe getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Giraffe b = new Giraffe(new StringBuffer("Melman"), 5, 5);
        assertTrue(b.render() == 'g');
        System.out.println("Class Giraffe render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Giraffe b = new Giraffe(new StringBuffer("Melman"), 5, 5);
        assertTrue((b.getPosition()).row == 5);
        assertTrue((b.getPosition()).col == 5);
        System.out.println("Class Giraffe getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Giraffe b = new Giraffe(new StringBuffer("Melman"), 5, 5);
        assertTrue((b.getName().toString()).equals("Melman"));
        System.out.println("Class Giraffe getName method correct");
    }
}
