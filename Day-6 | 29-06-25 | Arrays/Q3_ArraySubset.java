import java.util.HashMap;

public class Q3_ArraySubset {
    public static boolean isSubset(int a[], int b[]) {
        // Your code here

        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
        }

        for(int i =0;i<b.length;i++){
            Integer count = hm.get(b[i]);
            if(count==null || count==0){
              return false;
            }else{
              count--;
            }
            hm.put(b[i], count);
        }
        return true;
    }
    public static void main(String[] args) {

        // Array Subset
        // Examples:
        // Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
        // Output: true
        // Explanation: b[] is a subset of a[]
        // Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
        // Output: true
        // Explanation: b[] is a subset of a[]
        // Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
        // Output: false
        // Explanation: b[] is not a subset of a[]
        int[] a = new int[]{11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = new int[]{11, 3, 7, 1,7, 7};
        boolean result = isSubset(a, b);
        System.out.println("result "+result);
    }

}
