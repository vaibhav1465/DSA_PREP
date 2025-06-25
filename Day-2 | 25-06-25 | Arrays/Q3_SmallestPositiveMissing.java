public class Q3_SmallestPositiveMissing {

    public static int missingNumber(int[] arr) {

        // int i = 0;

        // while (i < arr.length) {
        // int correct = arr[i] - 1;
        // System.out.println("correct " + correct);
        // System.out.println("arr[i] > 0 "+ (arr[i] > 0) );
        // System.out.println("arr[i] <= arr.length "+ (arr[i] <= arr.length) );
        // System.out.println("arr[i] != arr[correct] " + (arr[i] != arr[correct]) );
        // if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
        // int temp = arr[i];
        // arr[i] = arr[correct];
        // arr[correct] = temp;
        // } else {
        // i++;
        // }
        // }

        int n = arr.length;
        // { 2, -3, 4, 1, 1, 7 };
        for (int i = 0; i < n; i++) {

            // if arr[i] is within the range [1, n] and arr[i]
            // is not placed at (arr[i]-1)th index in arr
            // System.out.println(i + "------------starts-------------");
            while (arr[i] >= 1 && arr[i] <= n
                    && arr[i] != arr[arr[i] - 1]) {
                // then swap arr[i] and arr[arr[i]-1] to
                // place arr[i] to its corresponding index
                // System.out.println(arr[i] + " " + arr[arr[i] - 1]);
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
            // System.out.println();
            // for (int x = 0; x < arr.length; x++) {
            //     System.out.print(arr[x] + " ");
            // }
            // System.out.println();
            // System.out.println(i + "-----------ends--------------");
            // System.out.println();
            // System.out.println();
        }

        // System.out.println();
        // for (int x = 0; x < arr.length; x++) {
        //     System.out.print(arr[x] + " ");
        // }
        // System.out.println();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return arr.length + 1;
    }

    public static int smallestPositiveMissing(int[] arr) {

         int n = arr.length;

         // using cyclic sort
        for (int i = 0; i < n; i++) {

            while (arr[i] >= 1 && arr[i] <= n
                    && arr[i] != arr[arr[i] - 1]) {
              
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
            
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
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

        int[] nums = { 5, 3, 2, 5, 1 };
        int result = smallestPositiveMissing(nums);
        System.out.println("result " + result);

    }
}
