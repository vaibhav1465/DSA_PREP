import java.util.Arrays;

public class Q7_MergeWithoutExtraSpace {
 
    // Function to merge the arrays.
    public static void mergeArrays1(int a[], int b[]) { // brute
        // code here

        // Make a new array of n+m length, insert all eles of a,b, 
        // sort the array
        // fill first n in a and remaing in b
        
    }
     public static void mergeArrays2(int a[], int b[]) { // litle more optimise
        // code here
        int n = a.length;
        int m = b.length;
        int alast = n-1;
        int bfirst = 0;

        while (alast>=0 && bfirst<=m-1) {
            if(a[alast]>b[bfirst]){
                int temp = a[alast];
                a[alast]=b[bfirst];
                b[bfirst]=temp;
            }else{
                break;
            }
            alast--;
            bfirst++;
        }

        Arrays.sort(a);
        Arrays.sort(b);
        
    }
     public static void mergeArrays3(int a[], int b[]) { // Gap Method
        // code here
        
    }
    public static void main(String[] args) {
        // Merge Without Extra Space


        
        // Examples:
        // Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
        // Output:
        // 2 2 3 4
        // 7 10
        // Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
        // Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
        // Output:
        // 1 2 3 5 8 9
        // 10 13 15 20
        // Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.
        // Input: a[] = [0, 1], b[] = [2, 3]
        // Output:
        // 0 1
        // 2 3
        // Explanation: After merging two sorted arrays we get 0 1 2 3.


        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};
        mergeArrays2(a,b);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        
    }
}
