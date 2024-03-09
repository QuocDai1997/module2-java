public class FindMaxToWay {
    public static void main(String[] args) {
        int arrayTwoWay[][] = new int[][]{{1, 2}, {3, 4}, {51, 64}, {89, 87}};
        int max = arrayTwoWay[0][0];

        for (int i = 0; i < arrayTwoWay.length; i++) {
            for (int j = 0; j < arrayTwoWay[i].length; j++) {
                if (arrayTwoWay[i][j] > max) {
                    max = arrayTwoWay[i][j];
                }
                System.out.printf(arrayTwoWay[i][j] + " \t");
                }
            System.out.println();
        }
        System.out.println("Max of ArrayToWay is: " + max);
    }


        }



