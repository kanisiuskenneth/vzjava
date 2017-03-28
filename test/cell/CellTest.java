// File : CellTest.java

package cell;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Ferdinandus Richard on 28-Mar-17.
 */
public class CellTest {
    @Test
    public void testAirHabitat() {
        Cell air_habitat = new Cell('a');
        assertTrue(air_habitat.render() == 'a');
        assertTrue(!air_habitat.isHumanPass());
        assertTrue(air_habitat.isAnimalPass());
        assertTrue(!air_habitat.isFacility());
        assertTrue(air_habitat.isHabitat());
        System.out.println("AirHabitat correct");
    }

    @Test
    public void testEntrance() {
        Cell entrance = new Cell('e');
        assertTrue(entrance.render() == 'e');
        assertTrue(entrance.isHumanPass());
        assertTrue(!entrance.isAnimalPass());
        assertTrue(entrance.isFacility());
        assertTrue(!entrance.isHabitat());
        System.out.println("Entrance correct");
    }

    @Test
    public void testExit() {
        Cell exit = new Cell('x');
        assertTrue(exit.render() == 'x');
        assertTrue(exit.isHumanPass());
        assertTrue(!exit.isAnimalPass());
        assertTrue(exit.isFacility());
        assertTrue(!exit.isHabitat());
        System.out.println("Exit correct");
    }

    @Test
    public void testLandHabitat() {
        Cell land_habitat = new Cell('l');
        assertTrue(land_habitat.render() == 'l');
        assertTrue(!land_habitat.isHumanPass());
        assertTrue(land_habitat.isAnimalPass());
        assertTrue(!land_habitat.isFacility());
        assertTrue(land_habitat.isHabitat());
        System.out.println("LandHabitat correct");
    }

    @Test
    public void testPark() {
        Cell park = new Cell('*');
        assertTrue(park.render() == '*');
        assertTrue(park.isHumanPass());
        assertTrue(!park.isAnimalPass());
        assertTrue(park.isFacility());
        assertTrue(!park.isHabitat());
        System.out.println("Park correct");
    }

    @Test
    public void testRestaurant() {
        Cell restaurant = new Cell('r');
        assertTrue(restaurant.render() == 'r');
        assertTrue(restaurant.isHumanPass());
        assertTrue(!restaurant.isAnimalPass());
        assertTrue(restaurant.isFacility());
        assertTrue(!restaurant.isHabitat());
        System.out.println("Restaurant correct");
    }

    @Test
    public void testRoad() {
        Cell road = new Cell('.');
        assertTrue(road.render() == '.');
        assertTrue(road.isHumanPass());
        assertTrue(!road.isAnimalPass());
        assertTrue(road.isFacility());
        assertTrue(!road.isHabitat());
        System.out.println("Road correct");
    }

    @Test
    public void testWaterHabitat() {
        Cell water_habitat = new Cell('w');
        assertTrue(water_habitat.render() == 'w');
        assertTrue(!water_habitat.isHumanPass());
        assertTrue(water_habitat.isAnimalPass());
        assertTrue(!water_habitat.isFacility());
        assertTrue(water_habitat.isHabitat());
        System.out.println("WaterHabitat correct");
    }
}
