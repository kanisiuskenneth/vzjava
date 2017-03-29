// File :  DisplayMenu.java

package cli;

import java.util.Scanner;
/**
 * Created by Kanisius Kenneth Halim on 3/28/17.
 */

/**
 * Class DisplayMenu
 * Class command line interface untuk menampilkan menu ke layar
 */
public class DisplayMenu {
  /**
   * Class constructor untuk menampilkan menu dan menerima pilihan
   */
  public DisplayMenu() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to FriendlyZoo");
    int choice;
    do {
      System.out.println("1. Display VirtualZoo");
      System.out.println("2. Tour VirtualZoo");
      System.out.println("3. Display Food Portion");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = scan.nextInt();
      switch(choice) {
        case 1:
          DisplayVirtualZoo buff = new DisplayVirtualZoo();
          buff.menu();
          break;
        case 2:
          TourVirtualZoo buff2 = new TourVirtualZoo();
          buff2.startTour();
          break;
        case 3:
          new DisplayFoodPortion();
          break;
      }
    } while(choice != 4);
  }
}
