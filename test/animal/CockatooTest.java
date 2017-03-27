package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class CockatooTest {
    @Test
    public void testGetWeightMethod() {
        Cockatoo b = new Cockatoo(new StringBuffer("Rio"), 5, 40);
        assertTrue(b.getWeight() == 2);
        System.out.println("Class Cockatoo getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Cockatoo b = new Cockatoo(new StringBuffer("Rio"), 5, 40);
        assertTrue(b.getId() == 18);
        System.out.println("Class Cockatoo getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Cockatoo b = new Cockatoo(new StringBuffer("Rio"), 5, 40);
        assertTrue(b.render() == 'c');
        System.out.println("Class Cockatoo render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Cockatoo b = new Cockatoo(new StringBuffer("Rio"), 5, 40);
        assertTrue((b.getPosition()).row == 5);
        assertTrue((b.getPosition()).col == 40);
        System.out.println("Class Cockatoo getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Cockatoo b = new Cockatoo(new StringBuffer("Rio"), 5, 40);
        assertTrue((b.getName().toString()).equals("Rio"));
        System.out.println("Class Cockatoo getName method correct");
    }
}
