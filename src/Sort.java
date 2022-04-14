import java.util.Random;

public class Sort {

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
            result[i] = a + (int)((new Random()).nextDouble() * (b - a));
        }

        return result;
    }

    /**
     * Sorts the input array using insertionSort
     * @param arr the array to sort
     */
    public static void insertionSort(int[] arr) {

    }

    /**
     * Sorts the input array using quickSort
     * @param arr the array to sort
     */
    public static void quickSort(int[] arr) {

    }

    /**
     * Sorts the input array using mergeSort
     * @param arr the array to sort
     */
    public static void mergeSort(int[] arr) {

    }

    /**
     * Sorts the input array using bubbleSort
     * @param arr the array to sort
     */
    public static void bubbleSort(int[] arr) {

    }

    /**
     * Main method to demonstrate the functionality of all the methods
     */
    public static void main(String[] args) throws Exception {
    }
}
