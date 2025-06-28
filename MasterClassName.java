import java.util.Arrays;
import java.util.HashSet;

public class MasterClassName {
    public static int longestConsectiveSubsequence(int[] a) {

        int n = a.length;
        HashSet<Integer> number = new HashSet<>();
        for (int i = 0; i < n; i++) {
            number.add(a[i]);
        }
        int subsequenceLenght = 0;
        for (int i = 0; i < n; i++) {
            if (number.contains(a[i] - 1)) {
                subsequenceLenght++;
            } else if (number.contains(a[i] + 1)) {
                subsequenceLenght++;
            }
        }

        return subsequenceLenght;
    }

    public static int minmizeTheHieghts2(int[] arr, int k) {

                int n = arr.length;
        Arrays.sort(arr);
        
        if(n==1){
            return 0;
        }
        
        int result = arr[n-1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        
        for(int i=0; i<n-1; i++){
            int min = Math.min(smallest, arr[i+1]-k);
            int max = Math.max(largest, arr[i]+k);
            
            if(min<0) continue;
            
            result = Math.min(result, max-min);
        }
        return result;
    }

    public static void main(String[] args) {

        // Longest Consecutive Subsequence
        // Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
        // Output: 6
        // Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6
        // numbers form the longest consecutive subsquence.
        // Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
        // Output: 4
        // Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.
        // Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
        // Output: 7
        // Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14,
        // 15, which has a length of 7.

        // int[] a = { 2, 6, 1, 9, 4, 5, 3 };
        // int result = longestConsectiveSubsequence(a);
        // System.out.println("result " + result);

        // Minimize the Heights II
        // Examples :
        // Input: k = 2, arr[] = {1, 5, 8, 10}
        // Output: 5
        // Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6,
        // 8}.The difference between the largest and the smallest is 8-3 = 5.
        // Input: k = 3, arr[] = {3, 9, 12, 16, 20}
        // Output: 11
        // Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6,
        // 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 =
        // 11.

        int[] a = { 3, 9, 12, 16, 20 };
        int k = 3;
        int result = minmizeTheHieghts2(a, k);
        System.out.println("result " + result);

    }
}
