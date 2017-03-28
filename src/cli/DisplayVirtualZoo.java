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
 * Class command line interface ini berfungsi untuk menampilkan peta Zoo
 */
public class DisplayVirtualZoo {

    private  Zoo zoo = Driver.zoo;

    /**
     * Predikat yang menentukan apakah ada Animal dalam koordinat yang diberikan
     * @param row baris tempat pengecekan keberadaan Animal
     * @param col kolom tempat pengecekan keberadaan Animal
     * @return boolean keberadaan Animal di koordinat yang diberikan
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
     * Method yang berfungsi untuk mendapatkan simbol dari Animal
     * @param row baris tempat Animal yang akan dirender
     * @param col kolom tempat Animal yang akan dirender
     * @return karakter render jika ada Animal, null jika tidak ada
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
     * Predikat untuk menentukan apakah sebuah koordinat berada dalam lingkup Zoo
     * @param i baris yang akan dicek apakah berada dalam lingkup Zoo
     * @param j kolom yang akan dicek apakah berada dalam lingkup Zoo
     * @return boolean koordinat di dalam lingkup Zoo
     */
    private boolean isInBound(int i, int j) {
        return i>0 && i <=zoo.getRow() && j>0 && j<=zoo.getCol();
    }

    /**
     * Method untuk menampilkan isi Zoo dari koordinat kiri-atas dan kanan-bawah yang diberikan
     * I.S. : Map tersedia dan koordinat kiri-atas dan kanan-bawah terdefinisi
     * F.S. : Isi map dari koordinat yang diberikan sudah dicetak di layar
     * @param lr baris atas dari map
     * @param lc kolom kiri dari map
     * @param rr baris bawah dari map
     * @param rc kolom kanan dari map
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
     * Method untuk menampilkan menu untuk memasukkan koordinat dari map yang ingin ditampilkan
     * I.S. : -
     * F.S. : input koordinat berhasil dimasukkan atau keluar pesan error jika salah
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