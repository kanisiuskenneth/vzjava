package zoo;

import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import cage.Cage;
import cell.*;
import util.Position;
import java.io.*;
import java.util.concurrent.LinkedTransferQueue;

/**
 * Created by ken on 3/26/17.
 */
public class Driver {
   public static Zoo zoo;
   private void initZoo() throws FileNotFoundException {
       Scanner fileIn = new Scanner(new File("src/asset/map.txt"));
       try {
           fileIn.next();
           zoo = new Zoo(fileIn.nextInt(), fileIn.nextInt());
           fileIn.close();
       } finally {
           fileIn.close();
       }
   }

   private Cell decideCell(char x) {
       Cell temp = null;
        switch(x) {
            case 'W':
            case 'w':
                temp = new WaterHabitat();
                break;
            case 'A':
            case 'a':
                temp = new AirHabitat();
                break;
            case 'L':
            case 'l':
                temp = new LandHabitat();
                break;
            case 'r':
                temp = new Restaurant();
                break;
            case '*':
                temp = new Park();
                break;
            case '.':
                temp = new Road();
                break;
            case 'x':
                temp = new Exit();
                break;
            case 'e':
                temp = new Entrance();
                break;
        }
       return temp;
   }

   private void initCell() throws IOException {
       BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
       fileIn.readLine();
       for(int i=0; i<zoo.getRow(); i++) {
           for (int j = 0; j < zoo.getCol(); j++) {
               char buff = (char) fileIn.read();
               zoo.data.setData(i, j, decideCell(buff));
           }
           fileIn.read();
       }
       fileIn.close();
   }

   private boolean isInBound(int i, int j) {
       return i>=0 && i <zoo.getRow() && j>=0 && j<zoo.getCol();
   }

   private Cage getCage(int i,int j) {
       for(Cage it : zoo.cages) {
           if(((isInBound(i-1,j) &&it.cells.contains(zoo.getCell(i-1,j)))
                   || (isInBound(i,j-1) && it.cells.contains(zoo.getCell(i,j-1)))
                   || (isInBound(i,j-1) && it.cells.contains(zoo.getCell(i+1,j)))
                   || (isInBound(i,j-1) && it.cells.contains(zoo.getCell(i,j+1))))
                   && it.getType() == zoo.getCell(i,j).render()) {
               return it;
           }
       }
       return null;
   }
   private void initCage() throws IOException{
       BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
       try {
           fileIn.readLine();
           for (int i = 0; i < zoo.getRow(); i++) {
               for (int j = 0; j < zoo.getCol(); j++) {
                   char curr = (char) fileIn.read();
                   Cell temp = zoo.getCell(i, j);
                   if (temp instanceof Habitat) {
                       if (Character.isUpperCase(curr) && !((Habitat) temp).isInCage()) {
                           Cage ret = getCage(i,j);
                           ((Habitat)zoo.getCell(i,j)).assignCage();
                           if(ret == null ) {
                               ret = new Cage(zoo.getCell(i,j).render());
                               ret.cells.add(zoo.getCell(i,j));
                               zoo.cages.add(ret);
                           } else {
                               ret.cells.add(zoo.getCell(i,j));
                           }
                       }
                   }
               }
               fileIn.read();
           }
       } finally {
           fileIn.close();
       }
   }
   private void initAnimal() throws FileNotFoundException{
       Scanner fileIn = new Scanner(new File("src/asset/map.txt"));
       try {
           fileIn.nextLine();
           for (int i = 0; i < zoo.getRow(); i++) {
               fileIn.nextLine();
           }
           fileIn.next();
           int n = fileIn.nextInt();
           fileIn.next();
           for (int i = 0; i < n; i++) {
               int id = fileIn.nextInt();
               StringBuffer name = new StringBuffer(fileIn.next());
               int r = fileIn.nextInt();
               int c = fileIn.nextInt();
               Cell x = zoo.getCell(r, c);
               for (Cage it : zoo.cages) {
                   if (it.cells.contains(x)) {
                       it.addAnimal(id, name, r, c);
                   }
               }
           }
       } finally {
           fileIn.close();
       }
   }
   public Driver() {
       try {
           initZoo();
           initCell();
           initCage();
           initAnimal();
       }
       catch (FileNotFoundException x) {
           System.out.println("File Not Found");
       } catch (IOException x) {
           System.out.println("File Not Found");
       }
   }
}