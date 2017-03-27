package animal;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Richard on 27-Mar-17.
 */
public class ElectricEelTest {
    @Test
    public void testGetWeightMethod() {
        ElectricEel b = new ElectricEel("Eel", 13, 59);
        assertTrue(b.getWeight() == 1);
        System.out.println("Class ElectricEel getWeight method correct");
    }

    @Test
    public void testGetIdMethod() {
        ElectricEel b = new ElectricEel("Eel", 13, 59);
        assertTrue(b.getId() == 10);
        System.out.println("Class ElectricEel getId method correct");
    }

    @Test
    public void testRenderMethod() {
        ElectricEel b = new ElectricEel("Eel", 13, 59);
        assertTrue(b.render() == '~');
        System.out.println("Class ElectricEel render method correct");
    }

    @Test
    public void testGetPositionMethod() {
        ElectricEel b = new ElectricEel("Eel", 13, 59);
        assertTrue((b.getPosition()).row == 13);
        assertTrue((b.getPosition()).col == 59);
        System.out.println("Class ElectricEel getPosition method correct");
    }

    @Test
    public void testGetNameMethod() {
        ElectricEel b = new ElectricEel("Eel", 13, 59);
        assertTrue(b.getName() == "Eel");
        System.out.println("Class ElectricEel getName method correct");
    }
}
