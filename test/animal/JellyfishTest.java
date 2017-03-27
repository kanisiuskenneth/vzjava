package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class JellyfishTest {
    @Test
    public void testGetWeightMethod() {
        Jellyfish b = new Jellyfish(new StringBuffer("Jellyfish"), 17, 44);
        assertTrue(b.getWeight() == 1);
        System.out.println("Class Jellyfish getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Jellyfish b = new Jellyfish(new StringBuffer("Jellyfish"), 17, 44);
        assertTrue(b.getId() == 14);
        System.out.println("Class Jellyfish getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Jellyfish b = new Jellyfish(new StringBuffer("Jellyfish"), 17, 44);
        assertTrue(b.render() == 'j');
        System.out.println("Class Jellyfish render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Jellyfish b = new Jellyfish(new StringBuffer("Jellyfish"), 17, 44);
        assertTrue((b.getPosition()).row == 17);
        assertTrue((b.getPosition()).col == 44);
        System.out.println("Class Jellyfish getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Jellyfish b = new Jellyfish(new StringBuffer("Jellyfish"), 17, 44);
        assertTrue((b.getName().toString()).equals("Jellyfish"));
        System.out.println("Class Jellyfish getName method correct");
    }
}
