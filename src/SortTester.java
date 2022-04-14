import org.junit.Test;
import org.junit.Assert;

public class SortTester {
    
    /**
     * Creating an array of ascending integers of the specified length that begins at the specified value
     * @param start the starting value
     * @param length the length of the array
     * @return an array of ascending integers
     */
    private int[] ascendingArray(int start, int length) {
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            result[i] = start + i;
        }

        return result;
    }

    /**
     * Creating an array of descending integers of the specified length that begins at the specified value
     * @param start the starting value
     * @param length the length of the array
     * @return an array of descending integers
     */
    private int[] descendingArray(int start, int length) {
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            result[i] = start - i;
        }

        return result;
    }

    /**
     * Swaps 2 random values in the input array
     * @param arr the array to swap values in
     */
    private void randomSwap(int[] arr) {

    }

    /**
     * Unit tests for randomArray
     */
    @Test
    public void testRandomArray() {
        // length 0
        int[] a1 = Sort.randomArray(0, 1, 10);
        Assert.assertArrayEquals(new int[0], a1);

        // length 1 - invalid range
        a1 = Sort.randomArray(1, 1, -1);
        Assert.assertArrayEquals(new int[0], a1);

        // length 1 - range of 1
        a1 = Sort.randomArray(1, 0, 0);
        Assert.assertArrayEquals(new int[]{0}, a1);
        a1 = Sort.randomArray(1, 5, 5);
        Assert.assertArrayEquals(new int[]{5}, a1);
        a1 = Sort.randomArray(1, -5, -5);
        Assert.assertArrayEquals(new int[]{-5}, a1);

        // length 1 - large range
        a1 = Sort.randomArray(1, -1000, 1000);
        Assert.assertTrue(a1[0] >= -1000 && a1[0] <= 1000);

        // large array - range of 1
        a1 = Sort.randomArray(100, 0, 0);
        for (int n : a1) {
            Assert.assertTrue(n == 0);
        }

        // large array - large range
        a1 = Sort.randomArray(1000, -1000, 1000);
        for (int n : a1) {
            Assert.assertTrue(n >= -1000 && n <= 1000);
        }
    }

    /**
     * Unit tests for insertionSort
     */
    @Test
    public void testInsertionSort() {

    }

    /**
     * Unit tests for quickSort
     */
    @Test
    public void testQuickSort() {

    }

    /**
     * Unit tests for mergeSort
     */
    @Test
    public void testMergeSort() {

    }

    /**
     * Unit tests for bubbleSort
     */
    @Test
    public void testBubbleSort() {

    }
}
