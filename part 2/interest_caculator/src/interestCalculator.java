import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of mount: ");
        month = input.nextInt();
        double totalInterest = 0;

        if(month < 3 ){
            System.out.println("Straight book must be greater than 3 ");
        } else
        if(month <= 6){
            interest_rate = 0.6;
            for (int i = 0; i <month; i++){
                totalInterest += money * interest_rate * month;
            }
            System.out.println(" Total of interest: " + totalInterest+ "vnd");
        } else
            if (month <= 12){
                interest_rate = 0.35;
                for (int i = 0; i < month; i++){
                    totalInterest += money * interest_rate * month;
                }
                System.out.println(" Total of interest: " + totalInterest+ "vnd");
            } else
                if (month>12) {
                interest_rate = 0.3;
                for (int i = 0; i<month; i++){
                    totalInterest += money * interest_rate * month;
                }
                System.out.println("Total of interest: " + totalInterest + "vnd");
            }
    }
}
