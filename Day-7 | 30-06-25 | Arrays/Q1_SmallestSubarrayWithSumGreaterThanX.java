import java.util.HashMap;

public class Q1_SmallestSubarrayWithSumGreaterThanX {

    
    public static int smallestSubWithSumEqualToXUsingHashing(int x, int[] a) {
        // Your code goes here

        HashMap<Integer,Integer> hMap = new HashMap<>();

        int s =a[0];
        int diff;
        Integer startingIndex =null;
        if(x==a[0]){
            return 1;
        }
        hMap.put(s,0);
        for(int i=1;i<a.length;i++){
           s+=a[i];
           diff = x-s;
           if(diff==0){
            return 1;
           }
           startingIndex = hMap.get(diff);
           if(startingIndex!=null){
             return (i-Integer.valueOf(startingIndex))+1;
           }
           hMap.put(s,i);
        }

        return 0;
    }

    public static int smallestSubWithSum(int x, int[] arr) {
        // // Your code goes here        
        // int i =0;
        // int s = a[i];
        // if(s>=x){
        //     return 1;
        // }
        // System.out.println(s+"---"+i);
        // for(int j=1;j<a.length;j++){
        //   if(a[j]>=x){
        //     return 1;
        //   }
        //   s+=a[j];
        //   System.out.println(s+"---"+j);
        //   if(s>=x){
        //     while (s>x) {
        //         s-=a[i];
        //         System.out.println(s+"---inside"+i);
        //         if(s<x){
        //             break;
        //         }
        //         i++;
        //     }
        //     return (j-i)+1;
        //   }
        // }

        // return 0;
        int n = arr.length;
        int sum = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for(int end = 0;end<n;end++){
            sum +=arr[end];
            while(sum>x){
                minLength = Math.min(minLength,end-start+1);
                sum -=arr[start];
                start++;
            }
        }
        return (minLength==Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        //Smallest subarray with sum greater than x

        // Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
        // Output: 3
        // Explanation: Minimum length subarray is [4, 45, 6]
        // Input: x = 100, arr[] = [1, 10, 5, 2, 7]
        // Output: 0
        // Explanation: No subarray exist

        int[] nums = {3643,1731,4966,6162,2244,1498,4254,272,4821,1019,9719,9328,3161,6670,4687,2385,6596,4579,4149,5818,5597,8827,6411,6069,3134,9974,2214,5531,1142,8913,1774,9800,9028,9698,2492,6477,4120,1434,6325,6546,8228,2912,9983,1905,4261,8345,6929,9427,4720,7245};
        int result = smallestSubWithSum(13304,nums);
        System.out.println("result "+result);
    }
    
}
