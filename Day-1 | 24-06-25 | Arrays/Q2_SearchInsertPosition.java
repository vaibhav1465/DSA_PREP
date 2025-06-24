public class Q2_SearchInsertPosition {


    public static int searchInsertPosition(int[] nums,int target){

        int minDiff = Integer.MAX_VALUE;
        int minDiffIndex = nums.length;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }else{
             int diff = nums[i]-target;
            //  System.out.println(diff+"----"+nums[i]);
             if(diff>0 && diff<minDiff){
                minDiff=diff;
                minDiffIndex=i;
             }
            }
        }

        return minDiffIndex;
    }

    public static void main(String[] args) {

//         Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

        int[] nums = {1,3,5,6};
        int target = 7;
        int result = searchInsertPosition(nums, target);
        System.out.println("Result Index: " + result);
    }
}
