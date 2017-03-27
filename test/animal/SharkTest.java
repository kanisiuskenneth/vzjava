package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class SharkTest {
    @Test
    public void testGetWeightMethod() {
        Shark b = new Shark(new StringBuffer("Bruce"), 21, 64);
        assertTrue(b.getWeight() == 1000);
        System.out.println("Class Shark getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Shark b = new Shark(new StringBuffer("Bruce"), 21, 64);
        assertTrue(b.getId() == 11);
        System.out.println("Class Shark getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Shark b = new Shark(new StringBuffer("Bruce"), 21, 64);
        assertTrue(b.render() == '^');
        System.out.println("Class Shark render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Shark b = new Shark(new StringBuffer("Bruce"), 21, 64);
        assertTrue((b.getPosition()).row == 21);
        assertTrue((b.getPosition()).col == 64);
        System.out.println("Class Shark getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Shark b = new Shark(new StringBuffer("Bruce"), 21, 64);
        assertTrue((b.getName().toString()).equals("Bruce"));
        System.out.println("Class Shark getName method correct");
    }
}
