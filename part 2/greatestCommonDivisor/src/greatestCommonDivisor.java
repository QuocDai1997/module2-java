import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("No greatest common divisor");
        }
        while (a != b) {
            if (a > b){
                a = a - b;

            }else{
                b = b - a;
            }
        }
        System.out.println("Greatest common divisor: " + a);
    }
}
