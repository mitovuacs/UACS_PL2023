//This example initializes a 2D array and then finds the maximum and minimum of all its elements. Students will need to fill in the gaps to find these values.
public class MaxMinMatrixExample {
    public static void main(String[] args) {
        // Initialize a 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Loop to go through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop to go through each column in a row
            for (int j = 0; j < matrix[i].length; j++) {
                // Fill in the gap to find the maximum value
                if (/*                                      */) {
                    max = /*                             */;
                }

                // Fill in the gap to find the minimum value
                if (/*                                  */) {
                    min = /*                            */;
                }
            }
        }

        // Print the maximum and minimum elements in the matrix
        System.out.println("The maximum element in the matrix is: " + max);
        System.out.println("The minimum element in the matrix is: " + min);
    }
}
