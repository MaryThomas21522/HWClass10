public class CarsType {
    public static void main(String[] args) {
        /*
      Create 2D array of cars : american, german, korean, italian.
      Then retrieve all values from that array using 2 different
      loops
         */
        String [] [] matrix={
                {"Ford", "GMC", "Chevy"},
                {"Mercedes", "BMW", "Volkswagen"},
                {"Hyundai", "Kia", "Daewoo"},
                {"Ferrari", "Fiat", "Lamborghini"}
        };

        System.out.println("---- Loop 1 --------");

        //Loop 1
        for (int row = 0; row < matrix.length ; row++) {

            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        //Loop 2
        System.out.println("---- Loop 2 --------");
        for (int row = 0; row < matrix.length; row++) {
            String [] arr1=matrix[row];

            for (int column = 0; column < arr1.length; column++) {
                System.out.print(arr1[column]+" ");
            }
            System.out.println();
        }
    }
}


