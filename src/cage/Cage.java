// File : Cage.java

package cage;

import animal.*;
import cell.Cell;
import cell.Habitat;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Kanisius Kenneth Halim on 3/27/17.
 */

/**
 * Class Cage
 */
public class Cage {
  public final HashSet<Animal> animals = new HashSet<Animal>();
  public final HashSet<Cell>  cells = new HashSet<Cell>();
  private final char type;

  /**
   * Class Constructor.
   * @param _type berupa char yang menandakan tipe dari sebuah Cage
   *        'l' berarti Cage adalah Cage untuk LandHabiat
   *        'w' berarti Cage adalah Cage untuk WaterHabitat
   *        'a' berarti Cage adalah Cage untuk AirHabitat
   */
  public Cage(char _type) {
    type = _type;
  }

  /**
   * Getter untuk mendapatkan type dari sebuah Cage
   * @return type dari Cage
   */
  public char getType() {
    return type;
  }

  /**
   * Predikat apakah Animal compatible dalam sebuah Cage
   * @param id integer yang menandakan identifier Animal yang ingin dimasukkan
   * @return boolean apakah Animal compatible
   */
  private boolean isAnimalCompatible(int id) {
    boolean compatible = true;
    for(Animal it : animals) {
      if(it.getIncompatible().contains(id)) {
        compatible = false;
      }
    }
    return compatible;
  }

  /**
   * Predikat apakah Habitat yang bisa ditinggali Animal ada dalam list
   * @param hab list of char yang menyatakan habitat yang bisa ditinggali Animal
   * @return boolean apakah Habitat Animal compatible dalam Cage
   */
  private boolean isHabitatCompatible(List<Character> hab) {
    boolean compatible = false;
    for (Cell it : cells) {
      for(Character jt : hab) {
        if (((Habitat) it).getHabitatType() == jt) {
          compatible = true;
        }
      }
    }
    return compatible;
  }

  /**
   * Method untuk menambahkan Animal ke dalam Cage
   * I.S. : Cage sudah dibentuk
   * F.S. : Animal ditambahkan ke dalam Csge jika compatible
   * @param id identifier Animal yang ingin ditambahkan
   * @param name nama dari Animal yang ingin ditambahkan
   * @param r baris dalam map, tempat Animal diposisikan
   * @param c kolom dalam map, tempat Animal diposisikan
   */
  public Animal addAnimal(int id, StringBuffer name, int r, int c) {
    Animal buffer = null;
    switch (id) {
      case 1:
        buffer = new Deer(name,r,c);

        break;
      case 2:
        buffer = new Chimpanzee(name,r,c);
        break;
      case 3:
        buffer = new Bear(name,r,c);
        break;
      case 4:
        buffer = new Elephant(name,r,c);
        break;
      case 5:
        buffer = new Zebra(name,r,c);
        break;
      case 6:
        buffer = new Tiger(name,r,c);
        break;
      case 7:
        buffer = new Lion(name,r,c);
        break;
      case 8:
        buffer = new Giraffe(name,r,c);
        break;
      case 9:
        buffer = new Komodo(name,r,c);
        break;
      case 10:
        buffer = new ElectricEel(name,r,c);
        break;
      case 11:
        buffer = new Shark(name,r,c);
        break;
      case 12:
        buffer = new Seal(name,r,c);
        break;
      case 13:
        buffer = new Stingray(name,r,c);
        break;
      case 14:
        buffer = new Jellyfish(name,r,c);
        break;
      case 15:
        buffer = new Octopus(name,r,c);
        break;
      case 16:
        buffer = new Owl(name,r,c);
        break;
      case 17:
        buffer = new Pelican(name,r,c);
        break;
      case 18:
        buffer = new Cockatoo(name,r,c);
        break;
      case 19:
        buffer = new Parrot(name,r,c);
        break;
      case 20:
        buffer = new Eagle(name,r,c);
        break;
      case 21:
        buffer = new Turtle(name,r,c);
        break;
    }
    if(isAnimalCompatible(id) && isHabitatCompatible(buffer.getHabitats())) {
      animals.add(buffer);
      return buffer;
    } else {
      return null;
    }

  }
}
