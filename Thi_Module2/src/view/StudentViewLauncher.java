package view;

import untils.AppUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentViewLauncher {
    public static void run() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            StudentView studentView = new StudentView();
            menuStudent();
            try {
                System.out.println(" \n Your choice?");
                System.out.print("⭆ ");
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        studentView.showStudentList(InputOption.SHOW);
                        break;
                    case 2:
                        studentView.add();
                        break;
                    case 3:
                        studentView.update();
                        break;
                    case 4:
                        studentView.remove();
                        break;
                    case 5:
                        studentView.sortByAverageScoreOrderByASC();
                        break;
                    case 6:
                        break;
                    case 7:
                        AppUtils.exit();
                    default:
                        System.err.println("Wrong! Input again");
                        run();
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Wrong! Input again");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void menuStudent() {
        System.out.println();
        System.out.println("* * * * * * * * * * *  * * * * * * * * ** * * * * * *");
        System.out.println("*                                                   *");
        System.out.println("*    1. Show list Student                           *");
        System.out.println("*    2. Add new                                     *");
        System.out.println("*    3. Update                                      *");
        System.out.println("*    4. Delete                                      *");
        System.out.println("*    5. Sort student name Z-A                       *");
        System.out.println("*    6. Read File                                   *");
        System.out.println("*    6. Write File                                  *");
        System.out.println("*    7. Exit                                        *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
