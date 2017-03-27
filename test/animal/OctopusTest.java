package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class OctopusTest {
    @Test
    public void testGetWeightMethod() {
        Octopus b = new Octopus(new StringBuffer("Hank"), 17, 18);
        assertTrue(b.getWeight() == 15);
        System.out.println("Class Octopus getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Octopus b = new Octopus(new StringBuffer("Hank"), 17, 18);
        assertTrue(b.getId() == 15);
        System.out.println("Class Octopus getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Octopus b = new Octopus(new StringBuffer("Hank"), 17, 18);
        assertTrue(b.render() == 'o');
        System.out.println("Class Octopus render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Octopus b = new Octopus(new StringBuffer("Hank"), 17, 18);
        assertTrue((b.getPosition()).row == 17);
        assertTrue((b.getPosition()).col == 18);
        System.out.println("Class Octopus getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Octopus b = new Octopus(new StringBuffer("Hank"), 17, 18);
        assertTrue((b.getName().toString()).equals("Hank"));
        System.out.println("Class Octopus getName method correct");
    }
}
