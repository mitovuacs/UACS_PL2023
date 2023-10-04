//This example aims to initialize a jagged array and then populate it with integer values. The task is to fill in the gaps to complete the code.
public class JaggedArrayExample {
    public static void main(String[] args) {
        // Initialize a jagged array
        int[][] jaggedArray = new int[3][];

        // Create the first row with 3 columns
        jaggedArray[0] = new int[3];

        // Create the second row with 2 columns
        jaggedArray[1] = new int[2];

        // Create the third row with 4 columns
        jaggedArray[2] = new int[4];

        // Fill in the first row
        for(int i = 0; i < jaggedArray[0].length; i++) {
            jaggedArray[0][i] = /*                       */;
        }

        // Fill in the second row
        for(int i = 0; i < jaggedArray[1].length; i++) {
            jaggedArray[1][i] = /*                        */;
        }

        // Fill in the third row
        for(int i = 0; i < jaggedArray[2].length; i++) {
            jaggedArray[2][i] = /*                         */;
        }

        // Print the jagged array
        for(int i = 0; i < jaggedArray.length; i++) {
            for(int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
