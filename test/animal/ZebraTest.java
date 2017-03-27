package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class ZebraTest {
    @Test
    public void testGetWeightMethod() {
        Zebra b = new Zebra(new StringBuffer("Marty"), 3, 5);
        assertTrue(b.getWeight() == 200);
        System.out.println("Class Zebra getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Zebra b = new Zebra(new StringBuffer("Marty"), 3, 5);
        assertTrue(b.getId() == 5);
        System.out.println("Class Zebra getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Zebra b = new Zebra(new StringBuffer("Marty"), 3, 5);
        assertTrue(b.render() == 'z');
        System.out.println("Class Zebra render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Zebra b = new Zebra(new StringBuffer("Marty"), 3, 5);
        assertTrue((b.getPosition()).row == 3);
        assertTrue((b.getPosition()).col == 5);
        System.out.println("Class Zebra getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Zebra b = new Zebra(new StringBuffer("Marty"), 3, 5);
        assertTrue((b.getName().toString()).equals("Marty"));
        System.out.println("Class Zebra getName method correct");
    }
}
