public class Countries {
    public static void main(String[] args) {
        /*
     Create 2D array of countries: north america countries,
     south america countries, europe countries, asian countries,
     african countries. Then print all values from that array
     using 2 different loops and calculate how many total countries
     been stored.
         */

        String [][] matrix={
                {"US", "Canada", "Mexico", "Jamaica", "Cuba","Greenland"},
                {"Brazil", "Colombia", "Chile", "Peru", "Ecuador"},
                {"Germany", "Italy", "UK", "France"},
                {"Japan", "China", "India"},
                {"Nigeria", "Uganda"},
        };

        System.out.println("---- Loop 1 --------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---- Loop 2 --------");
        //Loop 2 - Optimized 2D Array
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---- Total Countries Listed --------");
        //total counties entered in matrix
        int totalcountries=0;
        for (int i = 0; i < matrix.length; i++) {
            totalcountries +=(matrix[i].length);
        }
        System.out.println(totalcountries);
    }
}


