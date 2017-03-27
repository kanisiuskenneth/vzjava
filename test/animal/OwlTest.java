package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class OwlTest {
    @Test
    public void testGetWeightMethod() {
        Owl b = new Owl(new StringBuffer("Julien"), 1, 17);
        assertTrue(b.getWeight() == 2);
        System.out.println("Class Owl getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Owl b = new Owl(new StringBuffer("Julien"), 1, 17);
        assertTrue(b.getId() == 16);
        System.out.println("Class Owl getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Owl b = new Owl(new StringBuffer("Julien"), 1, 17);
        assertTrue(b.render() == 'y');
        System.out.println("Class Owl render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Owl b = new Owl(new StringBuffer("Julien"), 1, 17);
        assertTrue((b.getPosition()).row == 1);
        assertTrue((b.getPosition()).col == 17);
        System.out.println("Class Owl getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Owl b = new Owl(new StringBuffer("Julien"), 1, 17);
        assertTrue((b.getName().toString()).equals("Julien"));
        System.out.println("Class Owl getName method correct");
    }
}
