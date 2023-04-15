public class OddEven {
    public static void main(String[] args) {
        /*
      Create a 2D array or integer type where you will store odd
      and even numbers in 3 rows and 4 columns. Develop a program
      which will identify/print the even numbers only.
         */

        int[][] matrix = {
                {10, 20, 3, 40},
                {3, 20, 10, 5},
                {20, 10, 3, 40}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
