public class SquareMatrix {
    public static void main(String[] args) {
        int array [][] = {{1,2,7}, {3,4,8}, {5,6,9}};

        int sum = 0;

        for ( int i = 0;i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.printf(array[i][j] + " ");
                if ( i == j){
                    sum+= array [i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum main of array: " + sum);
        int sum_main = 0;

        for ( int i = 0;i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){

                if ( i + j == array.length -1){
                    System.out.println(array[i][j]);
                    sum_main+= array [i][j];
                }
            }
        }
        System.out.println("sum_main of array: " + sum_main );
    }
}
