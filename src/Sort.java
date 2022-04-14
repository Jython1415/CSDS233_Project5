import java.util.Random;

public class Sort {

    /**
     * Swaps two values in an array
     * @param arr the array
     * @param a the first index
     * @param b the second index
     * @return the array
     */
    private static int[] swap(int[] arr, int a, int b) {
        int save = arr[a];
        arr[a] = arr[b];
        arr[b] = save;

        return arr;
    }

    /**
     * Creates a new array of length n with random integers in the range of [a, b]
     * @param n the length of the array
     * @param a the lower bound (inclusive)
     * @param b the upper bound (inclusive)
     * @return an int[] of random integers
     */
    public static int[] randomArray(int n, int a, int b) {
        if (b < a) {
            return new int[0];
        }

        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = a + (int)((new Random()).nextDouble() * (b - a + 1));
        }

        return result;
    }

    /**
     * Sorts the input array using insertionSort
     * @param arr the array to sort
     */
    public static void insertionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                j--;
            }
        }
    }


    
    /**
     * Sorts the input array using quickSort
     * @param arr the array to sort
     */
    public static void quickSort(int[] arr) {
        if (arr == null) {
            return;
        }

        qSort(arr, 0, arr.length - 1);
    }

    private static void qSort(int[] arr, int start, int end) {
        if (end - start < 1) {
            return;
        }

        int pivot = arr[start + (int)((new Random()).nextDouble() * (end - start + 1))];

        int partition = partition(arr, pivot, start, end);

        qSort(arr, start, partition);
        qSort(arr, partition + 1, end);
    }

    private static int partition(int[] arr, int pivot, int start, int end) {
        int i = start - 1;
        int j = end + 1;

        while (true) {
            do {
                i++;
            } while (i < arr.length && arr[i] < pivot);
            do {
                j--;
            } while (j > -1 && arr[j] > pivot);

            if (i > j) {
                return j;
            }
            else {
                swap(arr, i, j);
            }
        }
    }

    /**
     * Sorts the input array using mergeSort
     * @param arr the array to sort
     */
    public static void mergeSort(int[] arr) {
        if (arr == null) {
            return;
        }

        int[] temp = new int[arr.length];

        mSort(arr, temp, 0, arr.length - 1);
    }

    private static void mSort(int[] arr, int[] temp, int start, int end) {
        if (end <= start) {
            return;
        }
        
        int split = (start + end) / 2;

        mSort(arr, temp, start, split);
        mSort(arr, temp, split + 1, end);

        // merge the two halves
        merge(arr, temp, start, split, split + 1, end);
    }

    private static void merge(int[] arr, int[] temp, int leftStart, int leftEnd, int rightStart, int rightEnd) {
        // merge
        int i = leftStart;
        int j = rightStart;
        int k = leftStart;
        while (i <= leftEnd && j <= rightEnd) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= leftEnd) {
            temp[k++] = arr[i++];
        }
        while (j <= rightEnd) {
            temp[k++] = arr[j++];
        }

        // copy back
        for (int l = 0; l < rightEnd + 1; l++) {
            arr[l] = temp[l];
        }
    }

    /**
     * Sorts the input array using bubbleSort
     * @param arr the array to sort
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Main method to demonstrate the functionality of all the methods
     */
    public static void main(String[] args) throws Exception {
    }
}
