import java.util.Arrays;

public class Q10_MinimizeTheHeights2 {

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
