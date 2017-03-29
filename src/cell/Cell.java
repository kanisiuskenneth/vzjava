// File : Cell.java

package cell;

/**
 * Created by Irene Edria on 3/23/17.
 */

import animal.Animal;

/**
 * Abstract Class Cell
 * Menciptakan Cell beserta atributnya
 */
public class Cell {
    private char symbol;
    private boolean human_pass;
    private boolean animal_pass;
    private Animal animal_here;
    /**
     * Class constructor.
     * @param c symbol dari Cell
     * @param hpass boolean apakah bisa dilewati person atau tidak
     * @param apass boolean apakah bisa dilewati animal atau tidak
     */
    public Cell(char c, boolean hpass, boolean apass) {
        symbol = c;
        human_pass = hpass;
        animal_pass = apass;
    }

    /**
     * Method untuk mendapatkan simbol Cell
     * @return simbol dari Cell
     */
    public char render() {
        if((this instanceof Habitat) && ((Habitat)this).isInCage()) {
                return Character.toUpperCase(symbol);
        } else {
            return symbol;
        }
    }

    /**
     * Method untuk mendapatkan boolean human_pass
     * @return boolean apakah cell bisa dilewati person
     */
    public boolean isHumanPass() {
        return human_pass;
    }

    /**
     * Method untuk mendapatkan boolean animal_pass
     * @return boolean apakah cell bisa dilewati animal
     */
    public boolean isAnimalPass() {
        return animal_pass;
    }
    public Animal getAnimal() {
        return animal_here;
    }
    public void addAnimal(Animal X) {
        animal_here = X;
    }
}
