import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int [][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("what are colum you want sum?");
        int colum = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                System.out.printf(array[i][j] + " ");
                if(j==colum){
                    sum+=array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum);
    }


}
