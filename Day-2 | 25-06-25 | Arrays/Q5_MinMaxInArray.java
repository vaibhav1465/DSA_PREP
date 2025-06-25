public class Q5_MinMaxInArray {
     public static int[] minMaxInArray(int[] nums){

       int n= nums.length;
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        
        // Input: arr[] = [3, 2, 1, 56, 10000, 167]
        // Output: 1 10000
        // Explanation: minimum and maximum elements of array are 1 and 10000.
        // Input: arr[] = [1, 345, 234, 21, 56789]
        // Output: 1 56789
        // Explanation: minimum and maximum element of array are 1 and 56789.
        // Input: arr[] = [56789]
        // Output: 56789 56789
        // Explanation: Since the array contains only one element so both min & max are same.

        int[] nums = {3, 2, 1, 56, 10000, 167};
        int[] result = minMaxInArray(nums);
        System.out.println("result "+result[0]+" "+result[1]);
    }
}
