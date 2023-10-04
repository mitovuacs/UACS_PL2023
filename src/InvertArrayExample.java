//This example uses a for loop to invert an array. Students will need to fill in the gaps to swap the elements of the array.
public class InvertArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp;

        for(int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[/*                          */];
            arr[/*                          */] = temp;
        }

        // Loop to print the inverted array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
