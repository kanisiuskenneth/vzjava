package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class KomodoTest {
    @Test
    public void testGetWeightMethod() {
        Komodo b = new Komodo(new StringBuffer("Komo"), 13, 68);
        assertTrue(b.getWeight() == 80);
        System.out.println("Class Komodo getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Komodo b = new Komodo(new StringBuffer("Komo"), 13, 68);
        assertTrue(b.getId() == 9);
        System.out.println("Class Komodo getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Komodo b = new Komodo(new StringBuffer("Komo"), 13, 68);
        assertTrue(b.render() == 'k');
        System.out.println("Class Komodo render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Komodo b = new Komodo(new StringBuffer("Komo"), 13, 68);
        assertTrue((b.getPosition()).row == 13);
        assertTrue((b.getPosition()).col == 68);
        System.out.println("Class Komodo getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Komodo b = new Komodo(new StringBuffer("Komo"), 13, 68);
        assertTrue((b.getName().toString()).equals("Komo"));
        System.out.println("Class Komodo getName method correct");
    }
}
