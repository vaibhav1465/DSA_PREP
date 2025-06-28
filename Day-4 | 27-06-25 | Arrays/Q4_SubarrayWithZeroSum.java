import java.util.HashSet;
import java.util.Set;

public class Q4_SubarrayWithZeroSum {
    
     // Function to check whether there is a subarray present with 0-sum or not.
    public static boolean findsum(int arr[]) {
        // Your code here

        Set<Integer> set= new HashSet<>();
         
         int sum=arr[0];
         set.add(sum);
         if(sum==0) return true;
         
         for(int i=1; i<arr.length; i++){
             
             if(arr[i]==0) return true;
             
             sum+=arr[i];
             
             if(set.contains(sum) || set.contains(0)) return true;
             else set.add(sum);
         }
         
         return false;
        
    }
    public static void main(String[] args) {
        

        // Examples:
        // Input: arr[] = [4, 2, -3, 1, 6]
        // Output: true
        // Explanation: 2, -3, 1 is the subarray with a sum of 0.
        // Input: arr = [4, 2, 0, 1, 6]
        // Output: true
        // Explanation: 0 is one of the element in the array so there exist a subarray with sum 0.
        // Input: arr = [1, 2, -1]
        // Output: false

        // Define:
        // sum[0..i] = sum of elements from index 0 to i.
        // Now suppose:
        // sum[0..i] = X
        // sum[0..j] = X (and i < j)
        // Then:
        // sum[i+1..j] = sum[0..j] - sum[0..i] = X - X = 0
        // 🧠 So, repeating prefix sums means a zero-sum subarray exists between those indices.
       
        int[] nums = {4, 2, -3, 1, 6};
        boolean result = findsum(nums);
        System.out.println(result);
    }
}
