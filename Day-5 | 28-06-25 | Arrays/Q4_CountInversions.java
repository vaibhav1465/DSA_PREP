import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q4_CountInversions {

    // Function to count inversions in the array.
    public static int inversionCount(int a[]) {
        // Your Code Here

        int n= a.length;
        int[] a2 = Arrays.copyOf(a, a.length);
        HashMap<Integer,Integer> hs = new HashMap<>();
        Arrays.sort(a);

        //  for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();

        // 10 28 38 38 41 57 79 91 
        // 57, 38, 91, 10, 38, 28, 79, 41

        // 5,2,5,1,1
        
        int k=0;
        int count =0;
        for(int i=0;i<n;i++){
            int ele = a2[i];
            while (ele>a[k]) {
                int elementCount =0;
                Integer countFound = hs.get(a[k]);
                int currentElement =a[k];
                // System.out.println("ele "+ele);
                // System.out.println("currentElement "+currentElement);
                while (currentElement==a[k]) {
                    elementCount++;
                    k++;
                }
                // System.out.println("elementCount "+elementCount);
                // System.out.println("countFound "+countFound);
                if(countFound==null){
                    count+=elementCount;
                }else{
                    count+=(elementCount-countFound);
                }   
                // System.out.println("count. "+count);

                // System.out.println();
                // System.out.println();
                // System.out.println();
            }
            k=0;
            hs.put(ele,hs.getOrDefault(ele, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        // Count Inversions 

        // Input: arr[] = [2, 4, 1, 3, 5]
        // Output: 3
        // Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
        // Input: arr[] = [2, 3, 4, 5, 6]
        // Output: 0
        // Explanation: As the sequence is already sorted so there is no inversion count.
        // Input: arr[] = [10, 10, 10]
        // Output: 0
        // Explanation: As all the elements of array are same, so there is no inversion count.

        int[] nums = { 57, 38, 91, 10, 38, 28, 79, 41 };
        // 5,2,5,1,1
        int result = inversionCount(nums);
        System.out.println("result " + result);
    }
}