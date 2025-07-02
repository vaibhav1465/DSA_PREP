import java.util.ArrayList;
import java.util.Collections;

public class Q5_ChocolateDistributionProblem {
    public static long findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here

        Collections.sort(arr);
        System.out.println(arr);

       long mini = Integer.MAX_VALUE;; 
       int i = 0; 
       int j = m-1; 
       int n = arr.size();
       while(j < n){
           long diff = arr.get(j)- arr.get(i); 
           mini = Math.min(mini , diff); 
           i++;
           j++; 
       }
       return mini;        
    }
    public static void main(String[] args) {
        
    // Chocolate Distribution Problem
        
    // Examples:
    // Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5
    // Output: 6
    // Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following m packets :[3, 4, 9, 7, 9].
    // Input: arr = [7, 3, 2, 4, 9, 12, 56], m = 3
    // Output: 2
    // Explanation: The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing following m packets :[3, 2, 4].
    // Input: arr = [3, 4, 1, 9, 56], m = 5
    // Output: 55
    // Explanation: With 5 packets for 5 students, each student will receive one packet, so the difference is 56 - 1 = 55
    
    int[] nums = new int[]{3, 4, 1, 9, 56, 7, 9, 12};
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i :nums){
        arr.add(i);
    };

    long result = findMinDiff(arr, 5);
    System.out.println(result);
}
}
