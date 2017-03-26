package zoo;

import java.util.Scanner;
import cell.*;
import java.io.*;

/**
 * Created by ken on 3/26/17.
 */
public class Driver {
   public Zoo zoo;
   private char[][] map;
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
       if(x=='L' || x=='A' || x=='W') {
           Habitat buff = (Habitat) temp;
           buff.assignCage();
       }
       return temp;
   }

   private void initCell() throws IOException {
       BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
       try {
           fileIn.readLine();
           for(int i=0; i<zoo.getRow(); i++) {
               for (int j = 0; j < zoo.getCol(); j++) {
                   char buff = (char) fileIn.read();

                   zoo.data.setData(i,j,decideCell(buff));
                   System.out.print(zoo.data.getData(i,j).render());
               }
               System.out.println();
               fileIn.read();
           }
       } finally {
           fileIn.close();
       }
   }
   private void cageFloodFill() {

   }
   private void initCage() {

   }

   public Driver() {
       try {
           initZoo();
           initCell();
       }
       catch (FileNotFoundException x) {
           System.out.println("File Not Found");
       } catch (IOException x) {
           System.out.println("File Not Found");
       }
   }
}
