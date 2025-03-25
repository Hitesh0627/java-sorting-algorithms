import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read the array elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The element to be inserted at the correct position
            int j = i - 1;

            // Move elements that are greater than 'key' one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }

            // Place 'key' at its correct position
            arr[j + 1] = key;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
