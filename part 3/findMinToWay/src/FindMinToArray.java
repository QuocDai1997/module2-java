public class FindMinToArray {
    public static void main(String[] args) {
        int arrayTwoWay[][] = new int[][]{{10, 2}, {3, 4}, {51, 64}, {89, 87}};

        int min = arrayTwoWay[0][0];


        for (int i = 0; i < arrayTwoWay.length; i++) {
            for (int j = 0; j < arrayTwoWay[i].length; j++) {
                System.out.printf(arrayTwoWay[i][j] + "\t");
                if (arrayTwoWay[i][j] < min) {
                    min = arrayTwoWay[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Min of Array is: " + min);
    }

}
