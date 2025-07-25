package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q6_CumbinationSum {
    public static void cumbinationSum(int[] arr, int idx,int sum, List<Integer> ds,List<List<Integer>> res){
        System.out.println(ds);
        System.out.println(idx);
        System.out.println(sum);
        System.out.println();
        System.out.println();
        if(idx == arr.length){
            System.out.println("----here----"+idx+ds);
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
            cumbinationSum(arr, idx, sum - arr[idx], ds, res);
            ds.remove(ds.size()-1);
        }
        cumbinationSum(arr, idx+1, sum, ds, res);

    }
    public static void main(String[] args) {
//        Input : candidates = [2, 3, 5, 4] , target = 7
//        Output : [ [2, 2, 3] , [3, 4] , [5, 2] ]
//        Explanation :
//        2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//        5 and 2 are candidates, and 5 + 2 = 7.
//        3 and 4 are candidates, and 3 + 4 = 7.
//        There are total three combinations.

        int[] arr = new int[]{2,3,5,4};
        int sum =7;
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        cumbinationSum(arr,0,sum,ds,res);
        System.out.println(res);
    }
}
