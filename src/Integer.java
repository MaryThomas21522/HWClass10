public class Integer {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3
        rows and 3 columns. Print the sum of all numbers.
         */

        int[][] matrix = {
                {10, 20, 30},
                {30, 20, 10},
                {20, 10, 30}
        };

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }
        System.out.println(sum);
    }
}
