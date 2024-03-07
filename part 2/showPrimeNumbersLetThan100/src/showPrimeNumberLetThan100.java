import java.util.Scanner;

public class showPrimeNumberLetThan100 {
    public static void main(String[] args) {
        int numbers;

        int N =2;
        int number = 2;


        while (N < 100) {
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
//                System.out.println(N);
                //không can đếm vì biết nó sẽ dưới 100 nên để N < 100 là được rồi
//                    count++;
                //muốn nó nằm ngang khi in ra thì:
                System.out.printf(N + " ");
            }
            number = 2;
            N++;
        }


    }
}
