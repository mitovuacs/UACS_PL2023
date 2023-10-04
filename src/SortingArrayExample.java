//This example initializes an array and sorts it using the bubble sort algorithm. Students need to fill in the gaps to perform the sorting.
public class SortingArrayExample {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {5, 2, 9, 1, 5, 6};
        int temp;

        // Loop to perform bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Fill in the gap to check if the adjacent elements are in the wrong order
                if (/*                                           */) {
                    // Swap the elements
                    temp =  /*                    */;
                    arr[j] =  /*                    */;
                    arr[j + 1] = /*                    */;
                }
            }
        }

        // Loop to print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
