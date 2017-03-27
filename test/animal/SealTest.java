package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class SealTest {
    @Test
    public void testGetWeightMethod() {
        Seal b = new Seal(new StringBuffer("Stefano"), 18, 12);
        assertTrue(b.getWeight() == 30);
        System.out.println("Class Seal getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Seal b = new Seal(new StringBuffer("Stefano"), 18, 12);
        assertTrue(b.getId() == 12);
        System.out.println("Class Seal getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Seal b = new Seal(new StringBuffer("Stefano"), 18, 12);
        assertTrue(b.render() == '=');
        System.out.println("Class Seal render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Seal b = new Seal(new StringBuffer("Stefano"), 18, 12);
        assertTrue((b.getPosition()).row == 18);
        assertTrue((b.getPosition()).col == 12);
        System.out.println("Class Seal getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Seal b = new Seal(new StringBuffer("Stefano"), 18, 12);
        assertTrue((b.getName().toString()).equals("Stefano"));
        System.out.println("Class Seal getName method correct");
    }
}
