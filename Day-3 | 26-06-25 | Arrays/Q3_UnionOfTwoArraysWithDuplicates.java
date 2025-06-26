import java.util.HashSet;

public class Q3_UnionOfTwoArraysWithDuplicates {
     public static int unionOfTwoArrays(int[] a,int[] b){

       HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<a.length;i++){
            h.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            h.add(b[i]);
        }
        return h.size();
    }


    public static void main(String[] args) {
        

    // Examples
    // Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
    // Output: 5
    // Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
    // Input: a[] = [85, 25, 1, 32, 54, 6], b[] = [85, 2] 
    // Output: 7
    // Explanation: Union set of both the arrays will be 85, 25, 1, 32, 54, 6, and 2. So count is 7.
    // Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
    // Output: 2
    // Explanation: We need to consider only distinct. So count of elements in union set will be 2.

        int[] a = {85, 25, 1, 32, 54, 6};
        int[] b = {85, 2};

        int result = unionOfTwoArrays(a,b);
        System.out.println("result "+result);
    }
}
