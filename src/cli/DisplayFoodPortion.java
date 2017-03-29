// File : DisplayFoodPortion.java

package cli;

import zoo.Driver;
import zoo.Zoo;

/**
 * Created by Kanisius Kenneth Halim on 3/28/17.
 */

/**
 * Class DisplayFoodPortion
 * Class command line interface ini berfungsi untuk menampilkan kebutuham makanan di Zoo
 */
public class DisplayFoodPortion {

    Zoo zoo = Driver.zoo;

    /**
     * Class constructor.
     */
    public DisplayFoodPortion() {
        System.out.println("Food Portion Needed for Carnivore: " + zoo.getFoodPortionCarnivore() + "kg");
        System.out.println("Food Portion Needed for Herbivore: " + zoo.getFoodPortionHerbivore() + "kg");
    }
}
