import java.util.HashSet;

public class Q1_LongestSubsquence {
    // Function to return length of longest subsequence of consecutive integers.
    public static int longestConsecutive(int[] a) {
        // code here

        int count=0;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
       
        int max =0;
        int k=1;
        for(int i=0;i<a.length;i++){
            count=1;
            k=1;
            while (hs.contains(a[i]+k)) {
                count++;
                k++;
            }
            System.out.println(a[i]+" "+count);
            max=Math.max(max, count);
        }
        return max;
        
    }
    public static void main(String[] args) {
        

    // Examples:
    // Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
    // Output: 6
    // Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
    // Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
    // Output: 4
    // Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.
    // Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
    // Output: 7
    // Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.

        int[] nums = {15, 13, 12, 14, 11, 10, 9};
        int result = longestConsecutive(nums);
        System.out.println("result "+result);
    }
}
