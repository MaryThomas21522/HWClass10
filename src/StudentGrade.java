public class StudentGrade {
    public static void main(String[] args) {
        /*
        Create a 2D array(shorter way) in which first array will
        consist of 4 names and second array will contain grades.
        Then your program should print name of the students that
        has A and B grade
         */

        String [] [] matrix={
                {"Kimber", "Jem", "Jerica", "Alex"},
                {"A", "B", "C", "D"},

        };
        System.out.print(matrix[0][1]+" ");
        System.out.print(matrix[1][1]+" ");
        System.out.println();
        System.out.print(matrix[0][0]+" ");
        System.out.print(matrix[1][0]+" ");


    }
}

