import java.util.Scanner;

public class InputValueArray {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 7, 6, 4};
        int X;
        Scanner scanner = new Scanner(System.in);



        System.out.println("----------------");
        for (int i = 0; i <arrays.length; i++ ){
            System.out.printf(arrays[i] + "\t");
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println("input value your array;");
        X = scanner.nextInt();

        int[] arrays1 = new int[arrays.length+1];


        for (int i = 0, k = 0; i < arrays.length; i++){

            arrays1[k++] = arrays[i];
            if (k == arrays.length){
                arrays1[k] = X;
            }

        }
        for (int i = 0; i <arrays1.length; i++ ){
            System.out.printf(arrays1[i] + "\t");
        }
    }
}
