package cli;

import animal.Animal;
import zoo.Driver;
import zoo.Zoo;
import cage.Cage;

import java.util.Scanner;

/**
 * Created by kennethhalim on 3/28/17.
 */
public class DisplayVirtualZoo {

    private  Zoo zoo = Driver.zoo;

    private boolean isAnimalHere(int i,int j) {
        boolean f =false;
        for(Cage it : zoo.cages) {
            for(Animal jt : it.animals) {
                if(jt.getPosition().row == i && jt.getPosition().col == j) {
                    return true;
                }
            }
        }
        return false;
    }

    private char renderAnimal(int i,int j) {
        for(Cage it : zoo.cages) {
            for(Animal jt : it.animals) {
                if(jt.getPosition().row == i && jt.getPosition().col == j) {
                    return jt.render();
                }
            }
        }
        return '\0';
    }

    private boolean isInBound(int i, int j) {
        return i>0 && i <=zoo.getRow() && j>0 && j<=zoo.getCol();
    }

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