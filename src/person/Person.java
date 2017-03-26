package person;

import util.Position;

/**
 * Created by Irene Edria on 3/26/17.
 */
public class Person {
  private StringBuffer name;
  private char symbol;
  private Position position;

  public Person(StringBuffer alias, Position pos) {
    name = alias;
    position = pos;
    symbol = '9';
  }

  public Position getPosition() {
    return position;
  }

  public void moveUp() {
    position.row--;
  }

  public void moveDown() {
    position.row++;
  }

  public void moveLeft() {
    position.col--;
  }

  public void moveRight() {
    position.col++;
  }

  public char render() {
    return symbol;
  }
}
