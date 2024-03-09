import java.util.Scanner;

public class CountValueArray {
    public static void main(String[] args) {
        int arr [] = {1,4,5,6,7,8,9,1,4,5,6,7,8,94,5,6,8};
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");

        }
        System.out.println();
        System.out.println("input value you want check: ");
        int value = sc.nextInt();
        boolean check = true;

        for (int i = 0; i < arr.length; i++){

            if ( value == arr[i]){
                check = true;
                count++;
            } else {
                check = false;

            }
        }
        if ( check){
            System.out.println("the number " + value +" of occurrences: " + count + " time");
        } else {
            System.out.println("value " + value +" not has at array");
        }
    }
}
