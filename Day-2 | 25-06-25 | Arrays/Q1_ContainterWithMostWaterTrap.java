public class Q1_ContainterWithMostWaterTrap {
    public static int containterWithMostWaterTrap(int[] nums) {

        int n = nums.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];


        int lmaxValue = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           lmaxValue = Math.max(lmaxValue,nums[i]);
           lmax[i]=lmaxValue;
        }

        int rmaxValue = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            rmaxValue =  Math.max(rmaxValue,nums[i]);
            rmax[i]=rmaxValue;
        }

        for(int i=0;i<n;i++){
            System.out.print(lmax[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(rmax[i]+" ");
        }

        int result = 0;
        for(int i=1;i<n-1;i++){
            System.out.println(i + "-----" + (Math.min(lmax[i],rmax[i]) - nums[i]));
            result += Math.min(lmax[i],rmax[i]) - nums[i];
        }
        return result;
       
    }

    public static void main(String[] args) {


        // Example 1
        // Input: height = [1,8,6,2,5,4,8,3,7]
        // Output: 49
        // Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
        // In this case, the max area of water (blue section) the container can contain is 49.

        // Example 2:
        // Input: height = [1,1]
        // Output: 1


        int[] nums = { 1,8,6,2,5,4,8,3,7 };
        int result = containterWithMostWaterTrap(nums);
        System.out.println("result --- " + result);
    }

}