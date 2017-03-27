package zoo;

import java.util.HashSet;
import java.util.Vector;

import cages.Cage;
import util.Matrix;
import cell.Cell;


/**
 * Created by ken on 3/26/17.
 */
public class Zoo {
    private int row;
    private int col;
    public Matrix data;
    public HashSet<Cage> cages = new HashSet<Cage>();

    public Zoo(int _row, int _col) {
        row = _row;
        col = _col;
        data = new Matrix(_row,_col);
    }
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public Cell getCell(int i, int j) {
        return data.getData(i,j);
    }
}
