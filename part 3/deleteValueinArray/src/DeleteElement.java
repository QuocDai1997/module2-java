import java.util.Scanner;

public class DeleteElement {
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
        System.out.println("input value you want delete;");
        X = scanner.nextInt();

        int[] arrays1 = new int[arrays.length-1];


        for (int i = 0, k = 0; i < arrays.length; i++){

            if (arrays[i] == X){
                System.out.println("Element at " + i + " in array list is " + arrays[i]);
                continue;
            }
            arrays1[k++] = arrays[i];

        }
        for (int i = 0; i <arrays1.length; i++ ){
            System.out.printf(arrays1[i] + "\t");
        }
    }
}
