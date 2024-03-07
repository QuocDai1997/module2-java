import java.util.Scanner;

public class change_money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        System.out.println("Input money you want change?");
        money = scanner.nextDouble();
        int choice;        
        System.out.println("How change you want?");
        System.out.println("1. VND -> USD");
        System.out.println("2. USD -> VND");
        choice = scanner.nextInt();
        double moneyAfterChange = 0;
        switch (choice){
            case 1:
                moneyAfterChange = money/25000;
                System.out.println("Money after change " + moneyAfterChange + "$");
                break;
            case 2:
                moneyAfterChange = money*25000;
                System.out.println("Money after change " + moneyAfterChange + "vnd");
                break;
        }

    }
}
