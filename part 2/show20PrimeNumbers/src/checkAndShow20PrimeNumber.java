import java.util.Scanner;

public class checkAndShow20PrimeNumber {
    public static void main(String[] args) {
        int numbers;

        Scanner scanner = new Scanner(System.in);
        // code này áp dụng cho tất cả các số muốn hiển thị chứ không riêng gì 20.
        System.out.println("How many number you want know it is prime number?");
        numbers = scanner.nextInt();

        int count = 0;


        int N =2;
        int number = 2;
        while (count <= numbers -1){


            // kiem tra so nguyen to
            boolean check = true;
            while ( number <= Math.sqrt(N)){
                if (N % number == 0){
                    check = false;
                    break;
                }
                number++;
            }
            if (check){
                System.out.println(N);
                    count++;
            }
            number = 2;
            N++;
        }

    }
}
