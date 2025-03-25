public class SelectionSort {

    // Function to implement Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        
        // Traverse through all elements in the array
        for (int i = 0; i < n; i++) {
            // Find the minimum element in the unsorted portion of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first unsorted element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    // Main method to test the selectionSort function
    public static void main(String[] args) {
        int[] examScores = {88, 72, 93, 60, 85, 78, 90, 80};
        
        System.out.println("Original Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Call the selection sort function
        selectionSort(examScores);
        
        System.out.println("Sorted Exam Scores:");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
