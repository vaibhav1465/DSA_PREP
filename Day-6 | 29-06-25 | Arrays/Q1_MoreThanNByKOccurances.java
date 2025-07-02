import java.util.HashMap;
import java.util.Map;

public class Q1_MoreThanNByKOccurances {

    // Function to find all elements in array that appear more than n/k times.
    public static int countOccurence(int[] a, int k) {
        // your code here,return the answer

        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
        }

        int result = 0;
        for (Integer value : hm.values()) {
            if(value>n/k){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // Examples :
        // Input: arr = [3, 1, 2, 2, 1, 2, 3, 3], k = 4
        // Output: 2
        // Explanation: In the given array, 3 and 2 are the only elements that appears
        // more than n/k times.
        // Input: arr = [2, 3, 3, 2], k = 3
        // Output: 2
        // Explanation: In the given array, 3 and 2 are the only elements that appears
        // more than n/k times. So the count of elements are 2.
        // Input: arr = [1, 4, 7, 7], k = 2
        // Output: 0
        // Explanation: In the given array, no element appears more than n/k times

        int[] nums = { 3, 1, 2, 2, 1, 2, 3, 3 };
        int result = countOccurence(nums, 4);
        System.out.println("result " + result);
    }
}
