package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class BearTest {
    @Test
    public void testGetWeightMethod() {
        Bear b = new Bear("Pooh", 5, 53);
        assertTrue(b.getWeight() == 120);
        System.out.println("Class Bear getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Bear b = new Bear("Pooh", 5, 53);
        assertTrue(b.getId() == 3);
        System.out.println("Class Bear getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Bear b = new Bear("Pooh", 5, 53);
        assertTrue(b.render() == '@');
        System.out.println("Class Bear render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Bear b = new Bear("Pooh", 5, 53);
        assertTrue((b.getPosition()).row == 5);
        assertTrue((b.getPosition()).col == 53);
        System.out.println("Class Bear getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Bear b = new Bear("Pooh", 5, 53);
        assertTrue(b.getName() == "Pooh");
        System.out.println("Class Bear getName method correct");
    }
}
