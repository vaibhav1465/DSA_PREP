public class Q3_SmallestPositiveMissing {

     public static int smallestPositiveMissing(int[] nums){

        int max = Integer.MIN_VALUE;
        int sum =0;

        // [-2,1,-3,4,-1,2,1,-5,4]
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        
        // Examples:
        // Input: arr[] = [2, -3, 4, 1, 1, 7]
        // Output: 3
        // Explanation: Smallest positive missing number is 3.
        // Input: arr[] = [5, 3, 2, 5, 1]
        // Output: 4
        // Explanation: Smallest positive missing number is 4.
        // Input: arr[] = [-8, 0, -1, -4, -3]
        // Output: 1
        // Explanation: Smallest positive missing number is 1.

        int[] nums = {};
        int result = functionName(nums);
        System.out.println("result "+result);

    }
}
