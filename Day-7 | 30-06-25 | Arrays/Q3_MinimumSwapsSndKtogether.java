
public class Q3_MinimumSwapsSndKtogether {
 
    public static int minSwap(int[] arr, int k) {
        return k;
    }

    public static void main(String[] args) {
      //  Minimum swaps and K together

      // Examples :
      // Input: arr[] = [2, 1, 5, 6, 3], k = 3
      // Output: 1
      // Explanation: To bring elements 2, 1, 3 together, swap index 2 with 4 (0-based indexing), i.e. element arr[2] = 5 with arr[4] = 3 such that final array will be- arr[] = [2, 1, 3, 6, 5]
      // Input: arr[] = [2, 7, 9, 5, 8, 7, 4], k = 6 
      // Output: 2 
      // Explanation: To bring elements 2, 5, 4 together, swap index 0 with 2 (0-based indexing) and index 4 with 6 (0-based indexing) such that final array will be- arr[] = [9, 7, 2, 5, 4, 7, 8]
      // Input: arr[] = [2, 4, 5, 3, 6, 1, 8], k = 6 
      // Output: 0
    }
}
