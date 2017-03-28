package zoo;

import java.util.HashSet;
import java.util.Vector;

import animal.Animal;
import cage.Cage;
import cell.Entrance;
import util.Matrix;
import cell.Cell;
import util.Position;


/**
 * Created by ken on 3/26/17.
 */
public class Zoo {
    private int row;
    private int col;
    public Matrix data;
    public HashSet<Cage> cages = new HashSet<Cage>();
    public Vector<Position>  entrances = new Vector<Position>();
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
    public float getFoodPortionCarnivore() {
        float sum =0;
        for(Cage it : cages) {
            for (Animal jt : it.animals) {
                if(jt.getFoodType().contains(1)) {
                    sum += jt.getWeight()*0.1/jt.getFoodType().size();
                }
            }
        }
        return sum;
    }
    public float getFoodPortionHerbivore() {
        float sum =0;
        for(Cage it : cages) {
            for (Animal jt : it.animals) {
                if(jt.getFoodType().contains(2)) {
                    sum += jt.getWeight()*0.1/jt.getFoodType().size();
                }
            }
        }
        return sum;
    }
}
