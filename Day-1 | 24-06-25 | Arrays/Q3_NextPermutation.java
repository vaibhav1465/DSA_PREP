import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q3_NextPermutation {

    public static int[] nextPermutation(int[] nums) {
        int breakIndex = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakIndex = i;
                break;
            }
        }
        System.out.println("breakIndex----  "+nums[breakIndex]);
        if (breakIndex != -1) {
            for (int i = n - 1; i > breakIndex; i--) {
                if (nums[i] > nums[breakIndex]) {
                    int t = nums[i];
                    nums[i] = nums[breakIndex];
                    nums[breakIndex] = t;
                    break;
                }
            }
            int left = breakIndex+1, right = n - 1;
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        } else {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [1,2,3]
        // Output: [1,3,2]
        // Example 2:

        // Input: nums = [3,2,1]
        // Output: [1,2,3]
        // Example 3:

        // Input: nums = [1,1,5]
        // Output: [1,5,1]

        int[] nums = new int[] { 1, 3, 2 };
        int[] result = nextPermutation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

// 345 6534
// 345 5643

// 345 3456