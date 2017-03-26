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

    public char Render() {
        return symbol;
    }

    public boolean IsHumanPass() {
        return human_pass;
    }

    public boolean IsAnimalPass() {
        return animal_pass;
    }
}
