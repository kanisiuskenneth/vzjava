package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class EagleTest {
    @Test
    public void testGetWeightMethod() {
        Eagle b = new Eagle("Sam", 20, 24);
        assertTrue(b.getWeight() == 22);
        System.out.println("Class Eagle getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Eagle b = new Eagle("Sam", 20, 24);
        assertTrue(b.getId() == 20);
        System.out.println("Class Eagle getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Eagle b = new Eagle("Sam", 20, 24);
        assertTrue(b.render() == 'q');
        System.out.println("Class Eagle render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Eagle b = new Eagle("Sam", 20, 24);
        assertTrue((b.getPosition()).row == 20);
        assertTrue((b.getPosition()).col == 24);
        System.out.println("Class Eagle getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Eagle b = new Eagle("Sam", 20, 24);
        assertTrue(b.getName() == "Sam");
        System.out.println("Class Eagle getName method correct");
    }
}
