package cell;

/**
 * Created by Irene Edria on 3/23/17.
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

    public Cell(char c) {
      symbol = c;
      char type = c;

      switch(type) {
        case 'a' :
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
          System.out.println("Invalid input");
      }
    }

    public char render() {
        return symbol;
    }

    public boolean isHumanPass() {
        return human_pass;
    }

    public boolean isAnimalPass() {
        return animal_pass;
    }

    public void openGateUp() {
      gate_up = true;
    }

    public void openGateDown() {
      gate_down = true;
    }

    public void openGateLeft() {
      gate_left = true;
    }

    public void openGateRight() {
      gate_right = true;
    }

    public void closeGateUp() {
      gate_up = false;
    }

    public void closeGateDown() {
      gate_down = false;
    }

    public void closeGateLeft() {
      gate_left = false;
    }

    public void closeGateRight() {
      gate_right = false;
    }

    public char GetHabitatType() {
      return hab_type;
    }

    public boolean IsInCage() {
      return incage;
    }

    public void assignCage() {
        incage = true;
    }

    public boolean isHabitat() {
        return ((symbol == 'a') || (symbol == 'w') || (symbol =='l'));
    }

    public boolean isFacility() {
        return ((symbol == '.') || (symbol == '*') || (symbol == 'e') ||
                (symbol == 'x') || (symbol == 'r'));
    }
}
