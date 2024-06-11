package QuickSort;

public class QuickSort {


    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); //

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to implement quicksort
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // partitionIndex is partitioning index, arr[partitionIndex] is now at right place
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Utility function to print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the quicksort algorithm
    public static void main(String args[]) {
        int arr[] = {5, 2, 4, 6, 1, 3};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
