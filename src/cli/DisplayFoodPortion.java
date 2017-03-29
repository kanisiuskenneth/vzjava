// File : DisplayFoodPortion.java

package cli;

import zoo.Driver;
import zoo.Zoo;

/**
 * Created by Kanisius Kenneth Halim on 3/28/17.
 */

/**
 * Class DisplayFoodPortion
 * Class command line interface untuk menampilkan banyaknya food_portion yang dibutuhkan Animal di Zoo
 */
class DisplayFoodPortion {
  private final Zoo zoo = Driver.zoo;

  /**
   * Class constructor menampilkan food_portion yang dibutuhkan dalam Zoo
   */
  public DisplayFoodPortion() {
    System.out.println("Food Portion Needed for Carnivore: " + zoo.getFoodPortionCarnivore() + "kg");
    System.out.println("Food Portion Needed for Herbivore: " + zoo.getFoodPortionHerbivore() + "kg");
  }
}
