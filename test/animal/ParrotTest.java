package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 28-Mar-17.
 */
public class ParrotTest {
    @Test
    public void testGetWeightMethod() {
        Parrot b = new Parrot(new StringBuffer("Skully"), 2, 41);
        assertTrue(b.getWeight() == 2);
        System.out.println("Class Parrot getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Parrot b = new Parrot(new StringBuffer("Skully"), 2, 41);
        assertTrue(b.getId() == 19);
        System.out.println("Class Parrot getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Parrot b = new Parrot(new StringBuffer("Skully"), 2, 41);
        assertTrue(b.render() == 'b');
        System.out.println("Class Parrot render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Parrot b = new Parrot(new StringBuffer("Skully"), 2, 41);
        assertTrue((b.getPosition()).row == 2);
        assertTrue((b.getPosition()).col == 41);
        System.out.println("Class Parrot getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Parrot b = new Parrot(new StringBuffer("Skully"), 2, 41);
        assertTrue((b.getName().toString()).equals("Skully"));
        System.out.println("Class Parrot getName method correct");
    }
}
