import java.lang.reflect.Array;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 7, 6, 4, 8};
        int[] arrays1 = {10, 50, 70, 60, 40, 80};

//        Scanner scanner = new Scanner(System.in);
        for (int i : arrays){
            System.out.printf(i + " ");
        }
        System.out.println();
        for (int a : arrays1){
            System.out.printf(a + " ");
        }
        System.out.println();

        int[] arraysNew = new int[arrays.length+ arrays1.length];


        for (int i = 0; i < arrays.length; i++){
            arraysNew[i] = arrays[i];
        }
        int k = arrays1.length;
        for (int j = 0; j <arrays1.length; j++ ){
            arraysNew[k++] = arrays1[j];
        }
        System.out.println();
        for (int a : arraysNew){
            System.out.printf(a + " ");
        }
    }
}
