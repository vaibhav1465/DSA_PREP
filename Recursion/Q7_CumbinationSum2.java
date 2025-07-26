package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q7_CumbinationSum2 {
    public static void cumbinationSum2(int[] arr, int idx, int sum, List<Integer> ds, List<List<Integer>> res){
        System.out.println(ds);
        System.out.println(idx);
        System.out.println(sum);
        System.out.println();
        System.out.println();
        if(idx == arr.length){
            System.out.println("----here-- --"+idx+ds);
            System.out.println();
            System.out.println();
            return;
        }
        if(sum == 0){
            System.out.println(ds);
            res.add(new ArrayList<>(ds));
            return;
        }
        if(sum-arr[idx]>=0) {
            ds.add(arr[idx]);
            cumbinationSum2(arr, idx+1, sum - arr[idx], ds, res);
            ds.remove(ds.size()-1);
        }
        cumbinationSum2(arr, idx+1, sum, ds, res);

    }
    public static void main(String[] args) {
//        Example 1:
//        Input: candidates = [10,1,2,7,6,1,5], target = 8
//        Output:
//            [
//            [1,1,6],
//            [1,2,5],
//            [1,7],
//            [2,6]]
//        Explanation: These are the unique combinations whose sum is equal to target.
//                Example 2:
//        Input: candidates = [2,5,2,1,2], target = 5
//        Output: [[1,2,2],[5]]
//        Explanation: These are the unique combinations whose sum is equal to target.

        int[] arr = new int[]{10,1,2,7,6,1,5};
        int sum =8;
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        cumbinationSum2(arr,0,sum,ds,res);
        System.out.println(res);
    }
}
