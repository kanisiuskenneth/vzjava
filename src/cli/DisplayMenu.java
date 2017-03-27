package cli;

import java.util.Scanner;
/**
 * Created by kennethhalim on 3/28/17.
 */
public class DisplayMenu {
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
                    break;
                case 2:
                    /*TourVirtualZoo buff = new TourVirtualZoo();*/
                    break;
                case 3:
                   /* DisplayFoodPortion buff = new DisplayFoodPortion();*/
                    break;
            }
        } while(choice != 4);
    }
}
