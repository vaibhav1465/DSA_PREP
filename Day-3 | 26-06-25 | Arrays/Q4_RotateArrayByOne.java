public class Q4_RotateArrayByOne {
     public static void rotateArrayByOne(int[] nums){

       int n= nums.length;
       int temp = nums[n-1];
        for(int i=n-2;i>=0;i--){
            nums[i+1] = nums[i];
        }
        nums[0]=temp;
    }


    public static void main(String[] args) {
        
        // Examples:
        // Input: arr[] = [1, 2, 3, 4, 5]
        // Output: [5, 1, 2, 3, 4]
        // Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
        // Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
        // Output: [3, 9, 8, 7, 6, 4, 2, 1]
        // Explanation: After rotating clock-wise 3 comes in first position

        int[] nums = {9, 8, 7, 6, 4, 2, 1, 3};
        rotateArrayByOne(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
    }
}
