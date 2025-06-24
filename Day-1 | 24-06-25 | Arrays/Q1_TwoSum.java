// Q1_TwoSum.java

import java.util.Arrays;
import java.util.HashMap;

public class Q1_TwoSum {
    public static int[] twoSumbrute(int[] nums, int target) {
        
        // Brute force solution: Check every pair of numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[]{-1, -1}; // Placeholder for the brute force solution
    }

     public static int[] twoSumBetter(int[] nums, int target) { 

        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numMap.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }

        for(int i=0;i<nums.length;i++){
            int leftSumForTarget = target-nums[i];
            Integer leftSumExist = numMap.get(leftSumForTarget);
            if(leftSumExist != null && leftSumExist != i) {
                return new int[]{i, leftSumExist};
            }
        }
        return new int[]{-1,-1};

    }


    public static int[] twoSumBetter2(int[] nums, int target) { 

        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numMap.get(nums[i]) != null && numMap.get(nums[i]) != i) {
                return new int[]{numMap.get(nums[i]),i};
            }
            numMap.put(target-nums[i], i);
        }
        return new int[]{-1,-1};

    }


    public static void twoSumOptimal(int[] nums, int target) { // This only tell us whether sum exist or not

        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numMap.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }

        Arrays.sort(nums);

        int left =0;
        int right = nums.length-1;

        while (left<right) {
            long sum = nums[left]+nums[right];
            if(sum==target){
                System.out.println("YES");
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7,3,8,6,4,0,4,6,11, 15};
        int target = 14;
        // twoSumOptimal(nums, target);
        int[] result = twoSumBetter2(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
