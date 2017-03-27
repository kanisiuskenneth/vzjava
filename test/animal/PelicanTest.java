package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class PelicanTest {
    @Test
    public void testGetWeightMethod() {
        Pelican b = new Pelican(new StringBuffer("Nigel"), 2, 8);
        assertTrue(b.getWeight() == 3);
        System.out.println("Class Pelican getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Pelican b = new Pelican(new StringBuffer("Nigel"), 2, 8);
        assertTrue(b.getId() == 17);
        System.out.println("Class Pelican getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Pelican b = new Pelican(new StringBuffer("Nigel"), 2, 8);
        assertTrue(b.render() == ';');
        System.out.println("Class Pelican render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Pelican b = new Pelican(new StringBuffer("Nigel"), 2, 8);
        assertTrue((b.getPosition()).row == 2);
        assertTrue((b.getPosition()).col == 8);
        System.out.println("Class Pelican getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Pelican b = new Pelican(new StringBuffer("Nigel"), 2, 8);
        assertTrue((b.getName().toString()).equals("Nigel"));
        System.out.println("Class Pelican getName method correct");
    }
}
