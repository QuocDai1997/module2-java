import java.util.Scanner;

public class disigeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice?");
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.println("Draw the triangle");
            System.out.println("-------");
            System.out.println("|--*--|");
            System.out.println("|-***-|");
            System.out.println("|*****|");
            System.out.println("-------");

        }else if (choice == 2){
            System.out.println("Draw the square");
            System.out.println("------");
            System.out.println("|****|");
            System.out.println("|****|");
            System.out.println("|****|");
            System.out.println("------");
        } else if (choice == 3){
            System.out.println("Draw the rectangle");
            System.out.println("------");
            System.out.println("|****|");
            System.out.println("|****|");
            System.out.println("|****|");
            System.out.println("|****|");
            System.out.println("------");
        } else {
            System.exit(0);
        }
    }

}
