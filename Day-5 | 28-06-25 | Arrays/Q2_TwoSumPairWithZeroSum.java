import java.util.ArrayList;
import java.util.Arrays;

public class Q2_TwoSumPairWithZeroSum {

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
                              
        Arrays.sort(arr);
        int l = arr.length;
        ArrayList finalList = new ArrayList();
        int start = 0;
        int end = l-1;
        
        while(start < end){
            int sum = arr[start] + arr[end];
            
            if(sum > 0){
                end--;
            }else if(sum < 0){
                start++;
            }else{
                ArrayList<Integer> list = new ArrayList();
                list.add(arr[start]);
                list.add(arr[end]);
                finalList.add(list);
                while( start < end && arr[start] == arr[start +1]){
                    start++;
                }
                 while(start < end &&arr[end] == arr[end - 1]){
                    end--;
                }
                start++;
                end--;
            }
        }
        
        return finalList;
    }
    public static void main(String[] args) {
        
        //  Examples:
        // Input: arr = [-1, 0, 1, 2, -1, -4]
        // Output: [[-1, 1]]
        // Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
        // arr[2] + arr[4] = 1 + (-1) = 0.
        // The distinct pair are [-1,1].
        // Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
        // Output: [[-6, 6],[-1, 1]]
        // Explanation: The distinct pairs are [-1, 1] and [-6, 6].
        // Expected Time Complexity: O(n log n)
        // Expected Auxiliary Space: O(n).

        int[] nums = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> result =getPairs(nums);
        System.out.println("result "+result);


    }

     
}