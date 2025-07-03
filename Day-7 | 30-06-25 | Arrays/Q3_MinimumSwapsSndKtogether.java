
public class Q3_MinimumSwapsSndKtogether {

  public static int minSwap1(int[] arr, int k) {

    int swap = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > k) {
        int j = i + 1;
        while (j < arr.length && arr[j] > k) {
          j++;
        }
        if (j == arr.length) {
          break;
        } else if (arr[j] <= k) {
          int t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
          swap++;
        }
      }
    }
    return swap;
  }

  // Function for finding maximum and value pair
  public static int minSwap(int arr[], int n, int k) {
    // Initially snowBallsize is 0
    int snowBallSize = 0;

    for (int i = 0; i < n; i++) {

      // Calculating the size of window required
      if (arr[i] <= k) {
        snowBallSize++;
      }
    }
    System.out.println("snowBallSize. " + snowBallSize);

    int swap = 0, ans_swaps = Integer.MAX_VALUE;

    for (int i = 0; i < snowBallSize; i++) {
      if (arr[i] > k)
        swap++;
    }
    System.out.println("swap. " + swap);

    ans_swaps = Math.min(ans_swaps, swap);
    System.out.println("ans_swaps. " + ans_swaps);

    for (int i = snowBallSize; i < n; i++) {

      // Checking in every window no. of swaps
      // required and storing its minimum
      if (arr[i - snowBallSize] <= k && arr[i] > k)
        swap++;
      else if (arr[i - snowBallSize] > k
          && arr[i] <= k)
        swap--;
      System.out.println("swap-----" + swap);
      ans_swaps = Math.min(ans_swaps, swap);
      System.out.println("ans_swaps. " + ans_swaps);
    }
    return ans_swaps;
  }

  public static void main(String[] args) {
    // Minimum swaps and K together

    // Examples :
    // Input: arr[] = [2, 1, 5, 6, 3], k = 3
    // Output: 1
    // Explanation: To bring elements 2, 1, 3 together, swap index 2 with 4 (0-based
    // indexing), i.e. element arr[2] = 5 with arr[4] = 3 such that final array will
    // be- arr[] = [2, 1, 3, 6, 5]
    // Input: arr[] = [2, 7, 9, 5, 8, 7, 4], k = 6
    // Output: 2
    // Explanation: To bring elements 2, 5, 4 together, swap index 0 with 2 (0-based
    // indexing) and index 4 with 6 (0-based indexing) such that final array will
    // be- arr[] = [9, 7, 2, 5, 4, 7, 8]
    // Input: arr[] = [2, 4, 5, 3, 6, 1, 8], k = 6
    // Output: 0

    int[] nums = { 2, 6, 3, 1, 2, 3, 3, 2 };
    int result = minSwap(nums,nums.length, 3);
    System.out.println("result " + result);
  }
}
