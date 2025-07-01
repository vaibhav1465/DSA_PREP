
public class Q2_ThreeWayPartitioning {

    // Function to partition the array around the range such
    // that array is divided into three parts.
    public static void threeWayPartition(int nums[], int a, int b) {
        // code here

        int n = nums.length;
        int m = 0;
        int h = n - 1;
        for (int i = 0; i <= h; i++) {
            // System.out.println(nums[i]);
            if (nums[i] < a) {
                int t = nums[i];
                nums[i] = nums[m];
                nums[m] = t;
                m++;
            } else if (nums[i] >= a && nums[i] <= b) {
                continue;
            } else if (nums[i] > b) {
                int t = nums[i];
                nums[i] = nums[h];
                nums[h] = t;
                h--;
                i--;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        

    }

    public static void main(String[] args) {
        // Three way partitioning

        // Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
        // Output: true
        // Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a
        // valid arrangement, output will be true.
        // Input: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
        // Output: true
        // Explanation: One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a
        // valid arrangement, output will be true.

        int[] nums = { 1, 4, 3, 6, 2, 1 };
        threeWayPartition(nums, 1, 3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
