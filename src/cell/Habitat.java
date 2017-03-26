package cell;

import cell.Cell;
/**
 * Created by Irene Edria on 3/26/17.
 */
public class Habitat extends Cell {
    protected char hab_type;
    protected boolean gate_up;
    protected boolean gate_down;
    protected boolean gate_left;
    protected boolean gate_right;
    protected boolean incage;

    public Habitat(char c, char hab) {
        super(c,false,true);
        hab_type = hab;
        incage = false;
        gate_up=false;
        gate_down=false;
        gate_left=false;
        gate_right=false;
    }

    public void OpenGateUp() {
        gate_up = true;
    }

    public void OpenGateDown() {
        gate_down = true;
    }

    public void OpenGateLeft() {
        gate_left = true;
    }

    public void OpenGateRight() {
        gate_right = true;
    }
    public void CloseGateUp() {
        gate_up = false;
    }

    public void CloseGateDown() {
        gate_down = false;
    }

    public void CloseGateLeft() {
        gate_left = false;
    }

    public void CloseGateRight() {
        gate_right = false;
    }

    public char GetHabitatType() {
        return hab_type;
    }

    public boolean IsInCage() {
        return incage;
    }
}
