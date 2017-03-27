package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class TigerTest {
    @Test
    public void testGetWeightMethod() {
        Tiger b = new Tiger(new StringBuffer("Tigress"), 17, 71);
        assertTrue(b.getWeight() == 150);
        System.out.println("Class Tiger getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Tiger b = new Tiger(new StringBuffer("Tigress"), 17, 71);
        assertTrue(b.getId() == 6);
        System.out.println("Class Tiger getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Tiger b = new Tiger(new StringBuffer("Tigress"), 17, 71);
        assertTrue(b.render() == 't');
        System.out.println("Class Tiger render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Tiger b = new Tiger(new StringBuffer("Tigress"), 17, 71);
        assertTrue((b.getPosition()).row == 17);
        assertTrue((b.getPosition()).col == 71);
        System.out.println("Class Tiger getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Tiger b = new Tiger(new StringBuffer("Tigress"), 17, 71);
        assertTrue((b.getName().toString()).equals("Tigress"));
        System.out.println("Class Tiger getName method correct");
    }
}
