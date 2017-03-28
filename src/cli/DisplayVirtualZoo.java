// File : DisplayVirtualZoo.java

package cli;

import animal.Animal;
import zoo.Driver;
import zoo.Zoo;
import cage.Cage;

import java.util.Scanner;

/**
 * Created by Kanisius Kenneth Halim on 3/28/17.
 */

/**
 * Class DisplayVirtualZoo
 * Class command line interface untuk menampilkan peta zoo ke layar
 */
public class DisplayVirtualZoo {

  private  Zoo zoo = Driver.zoo;

  /**
   * Predikat ada Animal di Cell
   * @param row baris tempat pengecekan keberadaan Animal dilakukan
   * @param col kolom tempat pengecekan keberadaan Animal dilakukan
   * @return boolean keberadaan Animal di Cell
   */
  private boolean isAnimalHere(int row, int col) {
    for(Cage it : zoo.cages) {
      for(Animal jt : it.animals) {
        if(jt.getPosition().row == row && jt.getPosition().col == col) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Method untuk menerima render dari Animal jika ada
   * @param row baris tempat Animal yang ingin dirender
   * @param col kolom tempat Animal yang ingin dirender
   * @return character render dari Animal, null jika tidak ada Animal
   */
  private char renderAnimal(int row, int col) {
    for(Cage it : zoo.cages) {
      for(Animal jt : it.animals) {
        if(jt.getPosition().row == row && jt.getPosition().col == col) {
          return jt.render();
        }
      }
    }
    return '\0';
  }

  /**
   * Predikat untuk mengecek apakah koordinat berada dalam peta
   * @param i baris yang ingin dicek dalam map
   * @param j kolom yang ingin dicek dalam map
   * @return boolean apakah koordinat ada dalam map
   */
  private boolean isInBound(int i, int j) {
    return i>0 && i <=zoo.getRow() && j>0 && j<=zoo.getCol();
  }

  /**
   * Method untuk menampilkan isi map ke layar
   * I.S. : Koordinat kiri-atas dan kanan-bawah map terdefinisi
   * F.S. : Isi map dari koordinat kiri-atas hingga kanan-bawah ditampilkan ke layar
   * @param lr koordinat baris atas
   * @param lc koordinat kolom kiri
   * @param rr koordinat baris bawah
   * @param rc koordinat kolom kanan
   */
  public void display(int lr,int lc,int rr, int rc) {
    for(int i =lr-1; i <= rr-1; i++) {
      for(int j= lc-1; j<= rc-1;j++) {
        if(isAnimalHere(i,j)) {
          System.out.print(renderAnimal(i,j));
        } else {
          System.out.print(zoo.getCell(i, j).render());
        }
      }
      System.out.println();
    }
  }

  /**
   * Method untuk menampilkan menu dan menerima input koordinat
   * I.S. : -
   * F.S. : Menu sudah ditampilkan dan koordinat sudah dimasukkan
   */
  public void menu() {
    int lr,lc,rr,rc;
    Scanner scan = new Scanner(System.in);
    for(;;) {
      System.out.println("Enter Top-Left Coordinate (1-" + zoo.getRow() + ") (1-" + zoo.getCol() + "): ");
      lr = scan.nextInt();
      lc = scan.nextInt();
      System.out.println("Enter Bottom-Right Coordinate (1-" + zoo.getRow() + ") (1-" + zoo.getCol() + "): ");
      rr = scan.nextInt();
      rc = scan.nextInt();
      if(isInBound(lr,lc) && isInBound(rr,rc) && rr>=lr && rc>=lc)
        break;
      System.out.println("Wrong Input");
    }
    display(lr,lc,rr,rc);
    System.out.println();
  }
}