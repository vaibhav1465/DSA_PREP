public class Q1_Sort0s1s2sInArray {

    public static void sort0s1s2sInArray(int[] nums) {

        int n = nums.length;
        int m = 0;
        int h = n - 1;
        for (int i = 0; i <= h; i++) {
            // System.out.println(nums[i]);
            if (nums[i] == 0) {
                int t = nums[i];
                nums[i] = nums[m];
                nums[m] = t;
                m++;
            } else if (nums[i] == 1) {
                continue;
            } else if (nums[i] == 2) {
                int t = nums[i];
                nums[i] = nums[h];
                nums[h] = t;
                h--;
                i--;
            }
            // for (int j = 0; j < n; j++) {
            //     System.out.print(nums[j] + " ");
            // }
            // System.out.println();
        }
    }

    public static void main(String[] args) {

        // Examples:
        // Input: arr[] = [0, 1, 2, 0, 1, 2]
        // Output: [0, 0, 1, 1, 2, 2]
        // Explanation: 0s 1s and 2s are segregated into ascending order.
        // Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
        // Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
        // Explanation: 0s 1s and 2s are segregated into ascending order.
        // Follow up: Could you come up with a one-pass algorithm using only constant
        // extra space?

        int[] nums = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; // using Dutch National Flag Algorithm
        sort0s1s2sInArray(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

}