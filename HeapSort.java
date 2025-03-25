public class HeapSort {

    // Function to perform heap sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Function to heapify a subtree rooted with node i
    public static void heapify(int[] salaries, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and heapify the affected subtree
        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }

    // Main method to test heapSort function
    public static void main(String[] args) {
        int[] salaryDemands = {75000, 50000, 120000, 85000, 95000, 60000, 110000};
        
        System.out.println("Original Salary Demands:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
        System.out.println();
        
        // Call the heapSort function
        heapSort(salaryDemands);
        
        System.out.println("Sorted Salary Demands:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}
