import java.util.ArrayList;
import java.util.HashSet;

public class Q8_ArrayDuplicates {
public static ArrayList<Integer> findDuplicates(int[] nums) {
        // code here
       int n= nums.length;
       ArrayList<Integer> result = new ArrayList<Integer>();
       HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            boolean added = s.add(nums[i]);
            if(!added){
                result.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        

        // Examples:
        // Input: arr[] = [2, 3, 1, 2, 3]
        // Output: [2, 3] 
        // Explanation: 2 and 3 occur more than once in the given array.
        // Input: arr[] = [0, 3, 1, 2] 
        // Output: []
        // Explanation: There is no repeating element in the array, so the output is empty.
        // Input: arr[] = [2]
        // Output: []
        // Explanation: There is single element in the array. Therefore output is empty.
        int[] nums = {2, 3, 1, 2, 3};
        ArrayList<Integer> result = findDuplicates(nums);
        System.out.println(result);
}
}
