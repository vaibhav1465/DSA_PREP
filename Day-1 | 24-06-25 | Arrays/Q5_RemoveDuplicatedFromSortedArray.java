public class Q5_RemoveDuplicatedFromSortedArray {


    public static int removeDuplicatedFromSortedArray(int[] nums){

        int k=0;
        // Input: nums = [0,0,0,0,0,1,1,1,2,2,3,3,4]
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
              nums[++k]=nums[i];
            }
        }

        for(int i=0;i<=k;i++){
            System.out.print(nums[i]+" ");
        }
        return k+1;
    }

    public static void main(String[] args) {
//  Example 1:
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

// Example 2:
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

    int[] nums = {0,0,1,1,1,1,1,1,2,2,3,3,4};
    int result = removeDuplicatedFromSortedArray(nums);
System.out.println("result --- "+result);

    }
}
