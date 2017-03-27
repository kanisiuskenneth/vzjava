package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */

public class ChimpanzeeTest {
    @Test
    public void testGetWeightMethod() {
        Chimpanzee c = new Chimpanzee(new StringBuffer("George"), 14, 18);
        assertTrue(c.getWeight() == 60);
        System.out.println("Class Chimpanzee getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        Chimpanzee c = new Chimpanzee(new StringBuffer("George"), 14, 18);
        assertTrue(c.getId() == 2);
        System.out.println("Class Chimpanzee getId method correct");
    }

    @Test
    public void testRenderMethod() {
        Chimpanzee c = new Chimpanzee(new StringBuffer("George"), 14, 18);
        assertTrue(c.render() == '&');
        System.out.println("Class Chimpanzee render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        Chimpanzee c = new Chimpanzee(new StringBuffer("George"), 14, 18);
        assertTrue((c.getPosition()).row == 14);
        assertTrue((c.getPosition()).col == 18);
        System.out.println("Class Chimpanzee getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        Chimpanzee c = new Chimpanzee(new StringBuffer("George"), 14, 18);
        assertTrue((c.getName().toString()).equals("George"));
        System.out.println("Class Chimpanzee getName method correct");
    }
}

