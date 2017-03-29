// File : Driver.java

package zoo;

import java.util.Scanner;

import animal.Animal;
import cage.Cage;
import cell.*;
import util.Position;
import java.io.*;

/**
 * Created by Kanisius Kenneth Halim on 3/26/17.
 */

/**
 * Class Driver
 * Class yang berfungsi untuk inisialisasi seluruh objek zoo
 */
public class Driver {
   public static Zoo zoo;

  /**
   * Method untuk melakukan inisialisasi ukuran dari Zoo
   * I.S. : -
   * F.S. : Zoo sudah dibentuk berdasar ukuran yang dibaca di dalam file
   * @throws FileNotFoundException
   */
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

  /**
   * Method yang menghasilkan jenis Cell berdasar karakternya dalam map
   * @param x karakter dalam map sebagai penentu jenis Cell
   * @return cell yang sudah dipilih berdasarkan karakter yang dimasukkan
   */
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

  /**
   * Melakukan inisialisasi Cell
   * I.S. : -
   * F.S. : Cell dalam zoo sudah diinisialisasi dan siap dipakai
   * @throws IOException
   */
   private void initCell() throws IOException {
     BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
     fileIn.readLine();
     for(int i=0; i<zoo.getRow(); i++) {
       for (int j = 0; j < zoo.getCol(); j++) {
         char buff = (char) fileIn.read();
         zoo.data.setData(i, j, decideCell(buff));
         if(buff == 'e') {
           zoo.entrances.add(Position.makePos(i,j));
         }
       }
       fileIn.read();
     }
     fileIn.close();
   }

  /**
   * Predikat apakah koordinat berada dalam zoo
   * @param i baris yang ingin dicek apakah berada dalam zoo
   * @param j kolom yang ingin dicek apakah berada dalam zoo
   * @return boolean koordinat berada dalam zoo atau tidak
   */
   private boolean isInBound(int i, int j) {
     return i>=0 && i <zoo.getRow() && j>=0 && j<zoo.getCol();
   }

  /**
   * Method untuk mendapatkan cage dalam koordinat zoo
   * @param i baris dalam zoo yang ingin diambil cagenya
   * @param j kolom dalam zoo yang ingin diambil cagenya
   * @return cage yang sudah diambil dalam koordinat, null jika tidak ada cage
   */
   private Cage getCage(int i,int j) {
     for(Cage it : zoo.cages) {
       if(((isInBound(i-1,j) &&it.cells.contains(zoo.getCell(i-1,j)))
           || (isInBound(i,j-1) && it.cells.contains(zoo.getCell(i,j-1)))
           || (isInBound(i+1,j) && it.cells.contains(zoo.getCell(i+1,j)))
           || (isInBound(i,j+1) && it.cells.contains(zoo.getCell(i,j+1))))
           && Character.toLowerCase(it.getType()) == Character.toLowerCase(zoo.getCell(i,j).render())) {
         return it;
       }
     }
     return null;
   }

  /**
   * Melakukan inisiasi cage ke dalam zoo
   * I.S. : Zoo terdefinisi dengan belum ada cage
   * F.S. : Zoo terdefinisi dengan cage yang sudah di-assign ke Zoo
   * @throws IOException
   */
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

  /**
   * Method untuk melakukan inisiasi Animal ke dalam Zoo
   * I.S. : Zoo terdefinisi dengan belum ada Animal
   * F.S. : Zoo terdefinisi dengan Animal yang sudah di-assign ke Zoo
   * @throws FileNotFoundException
   */
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
             Animal buff = it.addAnimal(id,name,r,c);
             if(buff!=null) {
               zoo.getCell(r,c).addAnimal(buff);
             }
           }
         }
       }
     } finally {
       fileIn.close();
     }
   }

  /**
   * Class constructor.
   * Melakukan inisiasi Zoo dan seluruh komponennya
   * I.S. : -
   * F.S. : Zoo sudah diinisiasi dan bisa dipakai
   */
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