package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class StingrayTest {
    @Test
    public void testGetWeightMethod() {
        Stingray b = new Stingray(new StringBuffer("Ray"), 17, 64);
        assertTrue(b.getWeight() == 150);
        System.out.println("Class Stingray getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Stingray b = new Stingray(new StringBuffer("Ray"), 17, 64);
        assertTrue(b.getId() == 13);
        System.out.println("Class Stingray getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Stingray b = new Stingray(new StringBuffer("Ray"), 17, 64);
        assertTrue(b.render() == '\\');
        System.out.println("Class Stingray render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Stingray b = new Stingray(new StringBuffer("Ray"), 17, 64);
        assertTrue((b.getPosition()).row == 17);
        assertTrue((b.getPosition()).col == 64);
        System.out.println("Class Stingray getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Stingray b = new Stingray(new StringBuffer("Ray"), 17, 64);
        assertTrue((b.getName().toString()).equals("Ray"));
        System.out.println("Class Stingray getName method correct");
    }
}
