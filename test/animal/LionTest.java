package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class LionTest {
    @Test
    public void testGetWeightMethod() {
        Lion b = new Lion(new StringBuffer("Simba"), 8, 17);
        assertTrue(b.getWeight() == 350);
        System.out.println("Class Lion getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Lion b = new Lion(new StringBuffer("Simba"), 8, 17);
        assertTrue(b.getId() == 9);
        System.out.println("Class Lion getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Lion b = new Lion(new StringBuffer("Simba"), 8, 17);
        assertTrue(b.render() == '!');
        System.out.println("Class Lion render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Lion b = new Lion(new StringBuffer("Simba"), 8, 17);
        assertTrue((b.getPosition()).row == 8);
        assertTrue((b.getPosition()).col == 17);
        System.out.println("Class Lion getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Lion b = new Lion(new StringBuffer("Simba"), 8, 17);
        assertTrue((b.getName().toString()).equals("Simba"));
        System.out.println("Class Lion getName method correct");
    }
}
