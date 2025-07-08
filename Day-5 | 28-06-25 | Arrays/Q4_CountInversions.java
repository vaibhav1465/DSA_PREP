public class Q4_CountInversions {

    // Function to count inversions in the array.
    public static int inversionCount(int arr[]) {
        // Your Code Here
        return arr.length;
    }

    public static void main(String[] args) {
        // Count Inversions 

        // Input: arr[] = [2, 4, 1, 3, 5]
        // Output: 3
        // Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
        // Input: arr[] = [2, 3, 4, 5, 6]
        // Output: 0
        // Explanation: As the sequence is already sorted so there is no inversion count.
        // Input: arr[] = [10, 10, 10]
        // Output: 0
        // Explanation: As all the elements of array are same, so there is no inversion count.

        int[] nums = { 2, 4, 1, 3, 5 };
        int result = inversionCount(nums);
        System.out.println("result " + result);
    }
}