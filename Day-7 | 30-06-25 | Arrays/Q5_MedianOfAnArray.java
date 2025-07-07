import java.util.Arrays;

public class Q5_MedianOfAnArray {

    public static double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println(arr[(n/2)-1]);
        System.out.println(arr[(n/2)]);
        System.out.println(arr[(n/2)-1]+arr[(n/2)]);
        if(n % 2 == 0){
            return  (arr[(n/2)-1] + arr[n/2])/2.0;
        }else{
            return arr[n/2];
        }
    }
    public static void main(String[] args) {
        // Median of an Array QUES
        // Examples:
        // Input: arr[] = [90, 100, 78, 89, 67]
        // Output: 89
        // Explanation: After sorting the array middle element is the median 
        // Input: arr[] = [56, 67, 30, 79]
        // Output: 61.5
        // Explanation: In case of even number of elements, average of two middle elements is the median. 
        // Input: arr[] = [1, 2]
        // Output: 1.5
        // Explanation: The average of both elements will result in 1.5.

        int[] nums = {56, 67, 30, 79};
        double result = findMedian(nums);
        System.out.println("result "+result);


    }
}

