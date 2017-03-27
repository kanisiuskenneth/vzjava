package cell;

/**
 * Created by Irene Edria on 3/23/17.
 */
public class Cell {
    private char symbol;
    private boolean human_pass;
    private boolean animal_pass;

    public Cell(char c, boolean hpass, boolean apass) {
        symbol = c;
        human_pass = hpass;
        animal_pass = apass;
    }

    public char render() {
        if((this instanceof Habitat) && ((Habitat)this).isInCage()) {
                return Character.toUpperCase(symbol);
        } else {
            return symbol;
        }
    }

    public boolean isHumanPass() {
        return human_pass;
    }

    public boolean isAnimalPass() {
        return animal_pass;
    }
}
