import java.util.Arrays;

public class Q7_MergeWithoutExtraSpace {

    // Function to merge the arrays.
    public static void mergeArrays1(int a[], int b[]) { // brute
        // code here

        // Make a new array of n+m length, insert all eles of a,b,
        // sort the array
        // fill first n in a and remaing in b

    }

      static void mergeArrays(int[] a, int[] b) {
      
        // Traverse b[] starting from the last element
        for (int i = b.length - 1; i >= 0; i--) {
          
            // If b[i] is smaller than the largest element of a[]
            if (a[a.length - 1] > b[i]) {
              
                // Place b[i] in the correct position in a[], 
                // and move last element of a[] to b[]
                int last = a[a.length - 1];
                int j = a.length - 2;
                while (j >= 0 && a[j] > b[i]) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = b[i];
                b[i] = last;
            }
        }
    }

    public static void mergeArrays2(int a[], int b[]) { // litle more optimise
        // code here
        int n = a.length;
        int m = b.length;
        int alast = n - 1;
        int bfirst = 0;

        while (alast >= 0 && bfirst <= m - 1) {
            if (a[alast] > b[bfirst]) {
                int temp = a[alast];
                a[alast] = b[bfirst];
                b[bfirst] = temp;
            } else {
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
        int n = a.length;
        int m = b.length;

        int gap = (m + n) / 2 + (m + n) % 2;

        while (gap > 0) {
            int start = 0;
            int end = start + gap;
            while (end < (n + m)) {
                System.out.println(start + "-----" + end + "  gap--->" + gap);
                if (end < n && a[start] > a[end]) {
                    System.out.println(a[start] + "---1111--" + a[end]);
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    System.out.println(a[start] + "---1111- after-" + a[end]);
                } else if (start > n && b[start - n] > b[end - n]) {
                    System.out.println(b[start-n] + "---2222--" + b[end - n]);
                    int temp = b[start - n];
                    b[start - n] = b[end - n];
                    b[end - n] = temp;
                    System.out.println(b[start] + "---2222-after-" + b[end - n]);
                } else if (start < n && end >= n && a[start] > b[end - n]) {
                    System.out.println(a[start] + "---3333--" + b[end - n]);
                    int temp = a[start];
                    a[start] = b[end - n];
                    b[end - n] = temp;
                    System.out.println(a[start] + "---3333-after-" + b[end - n]);
                }
                start++;
                end++;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
            if (gap == 1) {
                break;
            }
            gap = gap / 2 + gap % 2;
        }
    }

    public static void main(String[] args) {
        // Merge Without Extra Space
        // Examples:
        // Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
        // Output:
        // 2 2 3 4
        // 7 10
        // Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7
        // 10
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

        int[] a = { 4 };
        int[] b = { 0, 0, 1, 6, 6, 8, 9 };
        mergeArrays3(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}
