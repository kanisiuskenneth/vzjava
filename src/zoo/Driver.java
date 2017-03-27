package zoo;

import java.lang.Object;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import cages.Cage;
import cell.*;
import util.Position;
import java.io.*;
import java.util.concurrent.LinkedTransferQueue;

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
       return temp;
   }

   private void initCell() throws IOException {
       BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
       fileIn.readLine();
       for(int i=0; i<zoo.getRow(); i++) {
           for (int j = 0; j < zoo.getCol(); j++) {
               char buff = (char) fileIn.read();

               zoo.data.setData(i, j, decideCell(buff));
               System.out.print(zoo.data.getData(i, j).render());
           }
           System.out.println();
           fileIn.read();
       }
       fileIn.close();
   }



   private HashSet<Position> floodFill(int i, int j,char Sym) {
       HashSet<Position> ret = new HashSet<Position>();
       Queue<Position> floodq = new LinkedTransferQueue<Position>();
       floodq.add(Position.makePos(i,j));
       return ret;

   }
   private void initCage() throws IOException{
       BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
       fileIn.readLine();
       for(int i = 0; i < zoo.getRow(); i++) {
           for(int j = 0; j < zoo.getCol(); j++) {
               char curr = (char)fileIn.read();
               Cell temp = zoo.getCell(i,j);
               if(temp instanceof Habitat) {
                   if(Character.isUpperCase(curr) && !((Habitat) temp).isInCage()) {
                       HashSet<Position> flood = floodFill(i,j,temp.render());
                       HashSet<Cell> cages = new HashSet<Cell>();
                       for(Position it : flood) {
                           Cell buff = zoo.getCell(it.row,it.col);
                           ((Habitat)buff).assignCage();
                           cages.add(temp);
                       }
                       Cage C = new Cage(cages,null);
                       zoo.cages.add(C);
                   }
               }
           }
           fileIn.read();
       }
       fileIn.close();
   }
   private void initAnimal() throws FileNotFoundException{
       Scanner fileIn = new Scanner(new File("src/asset/map.txt"));
       fileIn.nextLine();
       for(int i=0; i<zoo.getRow();i++) {
           fileIn.nextLine();
       }
       fileIn.next();
       int n = fileIn.nextInt();
       for(int i=0; i<n; i++) {
           int id = fileIn.nextInt();
           StringBuffer name= new StringBuffer(fileIn.next());
           int r = fileIn.nextInt();
           int c = fileIn.nextInt();
           Cell x = zoo.getCell(r,c);
           for(Cage it : zoo.cages) {
               if(it.cells.contains(x)) {
                   it.addAnimal(id,name,r,c);
               }
           }
       }
   }
   public Driver() {
       try {
           initZoo();
           initCell();
           initCage();
       }
       catch (FileNotFoundException x) {
           System.out.println("File Not Found");
       } catch (IOException x) {
           System.out.println("File Not Found");
       }
   }
}