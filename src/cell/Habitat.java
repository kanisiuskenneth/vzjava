// File : Habitat.java

package cell;

/**
 * Created by Irene Edria on 3/26/17.
 */

/**
 * Abstract Class Habitat yang merupakan inheritance dari Cell
 * Menciptakaan Habitat beserta atributnya
 */
public class Habitat extends Cell {
    private final char hab_type;
    private boolean gate_up;
    private boolean gate_down;
    private boolean gate_left;
    private boolean gate_right;
    private boolean incage;

    /**
     * Class constructor.
     * @param c simbol dari Habitat yang akan dibuat
     * @param hab tipe habitat yang akan dibuat
     */
    public Habitat(char c, char hab) {
        super(c,false,true);
        hab_type = hab;
        incage = false;
        gate_up=false;
        gate_down=false;
        gate_left=false;
        gate_right=false;
    }

    /**
     * Method untuk membuka gate atas
     */
    public void openGateUp() {
        gate_up = true;
    }

    /**
     * Method untuk membuka gate bawah
     */
    public void openGateDown() {
        gate_down = true;
    }

    /**
     * Method untuk membuka gate kiri
     */
    public void openGateLeft() {
        gate_left = true;
    }

    /**
     * Method untuk membuka gate kanan
     */
    public void openGateRight() {
        gate_right = true;
    }

    /**
     * Method untuk menutup gate atas
     */
    public void closeGateUp() {
        gate_up = false;
    }

    /**
     * Method untuk menutup gate bawah
     */
    public void closeGateDown() {
        gate_down = false;
    }

    /**
     * Method untuk menutup gate kiri
     */
    public void closeGateLeft() {
        gate_left = false;
    }

    /**
     * Method untuk menutup gate kanan
     */
    public void closeGateRight() {
        gate_right = false;
    }

    /**
     * Method untuk mendapatkan tipe habitat
     * @return char tipe dari habitat
     */
    public char getHabitatType() {
        return hab_type;
    }

    /**
     * Method untuk mendapatkan boolean apakah ada animal di cage
     * @return boolean apakah ada animal di cage
     */
    public boolean isInCage() {
        return incage;
    }

    /**
     * Method untuk memasukkan animal ke cage
     */
    public void assignCage() {
        incage = true;
    }
}
