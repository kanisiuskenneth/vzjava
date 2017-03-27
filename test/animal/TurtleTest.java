package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class TurtleTest {
    @Test
    public void testGetWeightMethod() {
        Turtle b = new Turtle(new StringBuffer("Squirt"), 17, 0);
        assertTrue(b.getWeight() == 35);
        System.out.println("Class Turtle getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Turtle b = new Turtle(new StringBuffer("Squirt"), 17, 0);
        assertTrue(b.getId() == 21);
        System.out.println("Class Turtle getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Turtle b = new Turtle(new StringBuffer("Squirt"), 17, 0);
        assertTrue(b.render() == ':');
        System.out.println("Class Turtle render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Turtle b = new Turtle(new StringBuffer("Squirt"), 17, 0);
        assertTrue((b.getPosition()).row == 17);
        assertTrue((b.getPosition()).col == 0);
        System.out.println("Class Turtle getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Turtle b = new Turtle(new StringBuffer("Squirt"), 17, 0);
        assertTrue((b.getName().toString()).equals("Squirt"));
        System.out.println("Class Turtle getName method correct");
    }
}
