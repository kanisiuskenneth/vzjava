package util;

/**
 * Created by Kanisius Kenneth Halim on 3/26/17.
 */
public class Position {
    public int row;
    public int col;

    public Position(int _row, int _col) {
        row = _row;
        col = _col;
    }
    public static Position makePos(int _row, int _col) {
        Position P = new Position(_row,_col);
        return P;
    }
}
