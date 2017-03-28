// File : Cell.java

package cell;

/**
 * Created by Irene Edria on 3/23/17.
 */

/**
 * Class Cell
 */
public class Cell {
    public char symbol;
    public boolean human_pass;
    public boolean animal_pass;
    public char hab_type;
    public boolean gate_up;
    public boolean gate_down;
    public boolean gate_left;
    public boolean gate_right;
    public boolean incage;

    /**
     * Class constructor
     * @param c symbol dari Cell yang digunakan untuk render
     */
    public Cell(char c) {
      symbol = c;
      char type = c;

      switch(type) {
        case 'a' :
          // Cell adalah AirHabitat
          human_pass = false;
          animal_pass = true;
          hab_type = 'a';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case 'w' :
          // Cell adalah WaterHabitat
          human_pass = false;
          animal_pass = true;
          hab_type = 'w';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case 'l' :
          // Cell adalah LandHabitat
          human_pass = false;
          animal_pass = true;
          hab_type = 'l';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case 'e' :
          // Cell adalah Entrance
          human_pass = true;
          animal_pass = false;
          hab_type = 'n';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case 'x' :
          // Cell adalah Exit
          human_pass = true;
          animal_pass = false;
          hab_type = 'n';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case 'r' :
          // Cell adalah Restaurant
          human_pass = true;
          animal_pass = false;
          hab_type = 'n';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case '*' :
          // Cell adalah Park
          human_pass = true;
          animal_pass = false;
          hab_type = 'n';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        case '.' :
          // Cell adalah Road
          human_pass = true;
          animal_pass = false;
          hab_type = 'n';
          gate_up = false;
          gate_down = false;
          gate_left = false;
          gate_right = false;
          incage = false;
          break;
        default :
          // Cell tidak terdefinisi
          System.out.println("Invalid input");
      }
    }

    /**
     * Method untuk mendapatkan karakter symbol dari Cell
     * @return symbol dari Cell
     */
    public char render() {
        if(this.isInCage()) {
            return Character.toUpperCase(symbol);
        } else {
            return symbol;
        }
    }

    /**
     * Predikat yang menunjukkan apakah Cell bsia dilalui oleh Person
     * @return boolean apakah Cell dapat dilalui oleh Person
     */
    public boolean isHumanPass() {
        return human_pass;
    }

    /**
     * Predikat yang menunjukkan apakah Cell bisa dilalui oleh Animal
     * @return boolean apakah Cell dapat dilalui oleh Animal
     */
    public boolean isAnimalPass() {
        return animal_pass;
    }

    /**
     * Method untuk membuka gate atas dari Cell
     * I.S. : Gate atas Cell tertutup
     * F.S. : Gate atas Cell terbuka
     */
    public void openGateUp() {
      gate_up = true;
    }

    /**
     * Method untuk membuka gate bawah dari Cell
     * I.S. : Gate bawah Cell tertutup
     * F.S. : Gate bawah Cell terbuka
     */
    public void openGateDown() {
      gate_down = true;
    }

    /**
     * Method untuk membuka gate kiri dari Cell
     * I.S. : Gate kiri Cell tertutup
     * F.S. : Gate kiri Cell terbuka
     */
    public void openGateLeft() {
      gate_left = true;
    }

    /**
     * Method untuk membuka gate kanan dari Cell
     * I.S. : Gate kanan Cell tertutup
     * F.S. : Gate kanan Cell terbuka
     */
    public void openGateRight() {
      gate_right = true;
    }

    /**
     * Method untuk menutup gate atas dari Cell
     * I.S. : Gate atas Cell terbuka
     * F.S. : Gate atas Cell tertutup
     */
    public void closeGateUp() {
      gate_up = false;
    }

    /**
     * Method untuk menutup gate bawah dari Cell
     * I.S. : Gate bawah Cell terbuka
     * F.S. : Gate bawah Cell tertutup
     */
    public void closeGateDown() {
      gate_down = false;
    }

    /**
     * Method untuk menutup gate kiri dari Cell
     * I.S. : Gate kiri Cell terbuka
     * F.S. : Gate kiri Cell tertutup
     */
    public void closeGateLeft() {
      gate_left = false;
    }

    /**
     * Method untuk menutup gate kanan dari Cell
     * I.S. : Gate kanan Cell terbuka
     * F.S. : Gate kanan Cell tertutup
     */
    public void closeGateRight() {
      gate_right = false;
    }

    /**
     * Method untuk mendapatkan tipe habitat dari Cell
     * @return tipe habitat dari Cell
     */
    public char GetHabitatType() {
      return hab_type;
    }

    /**
     * Predikat untuk menentukan apakah sebuah Cell berada dalam sebuah Cage
     * @return boolean apakah Cell dalam Cage
     */
    public boolean isInCage() {
      return incage;
    }

    /**
     * Method untuk mengubah predikat apakah sebuah Cell berada dalam Cage
     * I.S. : Cell terdefinisi
     * F.S. : Cell dibuat menjadi sudah di-assign dalam sebuah Cage
     */
    public void assignCage() {
        incage = true;
    }

    /**
     * Predikat apakah sebuah Cell merupakan sebuah Habitat
     * @return boolean Cell adalah Habitat
     */
    public boolean isHabitat() {
        return ((symbol == 'a') || (symbol == 'w') || (symbol =='l'));
    }

    /**
     * Predikat apakah sebuah Cell adalah sebuah Facility dari Zoo
     * @return boolean Cell adalah Facility
     */
    public boolean isFacility() {
        return ((symbol == '.') || (symbol == '*') || (symbol == 'e') ||
                (symbol == 'x') || (symbol == 'r'));
    }

    /**
     * Predikat apakah sebuah Cell adalah Road, Entrance, atau Exit
     * @return boolean Cell adalah Road, Entrance, atau Exit
     */
    public boolean isRoad() {
        return symbol == '.' || symbol == 'e' || symbol == 'x';
    }

    /**
     * Predikat apakah sebuah Cell adalah Exit
     * @return boolean Cell adalah Exit
     */
    public boolean isExit() {
        return symbol == 'x';
    }
}
