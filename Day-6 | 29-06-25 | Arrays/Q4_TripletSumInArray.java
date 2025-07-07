import java.util.Arrays;
import java.util.HashSet;

public class Q4_TripletSumInArray {

    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here

        int n = arr.length;

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ". ");
        }
        System.out.println();
        // 48. 56. 65. 67. 85. 91. 98.
        for (int i = 0; i < n - 1; i++) {
            int twoSum = arr[i] + arr[i + 1];
            System.out.println(twoSum + " of " + arr[i] + " and " + arr[i + 1]);
            int remaining = target - twoSum;
            System.out.println("remaining " + remaining);
            int k = 0;
            while (k < n) {
                System.out.println("arr[k] " + arr[k]);
                if (k != i && k != i + 1) {
                    if (arr[k] == remaining) {
                        return true;
                    } else if (arr[k] > remaining) {
                        break;
                    }
                }
                k++;
            }

        }

        return false;

        // right soln
        // HashSet<Integer> set = new HashSet<>();
        
        // for(int i=0; i<arr.length; i++) {
        //     for(int j=i+1; j<arr.length; j++) {
        //         if(set.contains(target - (arr[i] + arr[j]))) {
        //             return true;
        //         }
        //     }
        //     set.add(arr[i]);
        // }
        
        // return false;

    }

    public static void main(String[] args) {

        // Triplet Sum in Array 

        // Examples
        // Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
        // Output: true
        // Explanation: The triplet {1, 4, 8} sums up to 13
        // Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10
        // Output: true
        // Explanation: The triplets {1, 3, 6} and {1, 2, 7} both sum to 10.
        // Input: arr[] = [40, 20, 10, 3, 6, 7], target = 24
        // Output: false
        // Explanation: No triplet in the array sums to 24

        int[] nums = { 134,124,8,6,87,81,56,101,23,78,1,127,9,74,80 };
        Boolean result = hasTripletSum(nums, 192);
        System.out.println("result " + result);
        // 1. 6. 8. 9. 23. 56. 74. 78. 80. 81. 87. 101. 124. 127. 134. 

    }
}
