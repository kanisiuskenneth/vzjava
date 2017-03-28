package cli;

import zoo.Driver;
import zoo.Zoo;

/**
 * Created by kennethhalim on 3/28/17.
 */
public class DisplayFoodPortion {

    Zoo zoo = Driver.zoo;
    public DisplayFoodPortion() {
        System.out.println("Food Portion Needed for Carnivore: " + zoo.getFoodPortionCarnivore() + "kg");
        System.out.println("Food Portion Needed for Herbivore: " + zoo.getFoodPortionHerbivore() + "kg");
    }
}
