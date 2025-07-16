public class Q9_LongestRepeatingSubsequence {

    public static int LongestRepeatingSubsequence(String s) {
        // code here
        return s.length();
    }
    public static void main(String[] args) {
        //Longest Repeating Subsequence
        
        // Input: s = "axxzxy"
        // Output: 2
        // Explanation: The given array with indexes looks like
        // a x x z x y 
        // 0 1 2 3 4 5
        // The longest subsequence is "xx". It appears twice as explained below.
        // subsequence A
        // x x
        // 0 1  <-- index of subsequence A
        // ------
        // 1 2  <-- index of s
        // subsequence B
        // x x
        // 0 1  <-- index of subsequence B
        // ------
        // 2 4  <-- index of s
        // We are able to use character 'x' (at index 2 in s) in both subsequences as it appears on index 1 in subsequence A and index 0 in subsequence B.
        // Input: s = "axxxy"
        // Output: 2
        // Explanation: The given array with indexes looks like
        // a x x x y 
        // 0 1 2 3 4
        // The longest subsequence is "xx". It appears twice as explained below.
        // subsequence A
        // x x
        // 0 1  <-- index of subsequence A
        // ------
        // 1 2  <-- index of s
        // subsequence B
        // x x
        // 0 1  <-- index of subsequence B
        // ------
        // 2 3  <-- index of s
        // We are able to use character 'x' (at index 2 in s) in both subsequencesas it appears on index 1 in subsequence A and index 0 in subsequence B.

    }
}