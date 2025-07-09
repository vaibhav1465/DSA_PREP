
public class Q6_MedianOfTwoSortedArraysOfDifferentSizes {

    public static double medianOf2(int a[], int b[]) {
        // Your Code Here

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
        return 0.0;
        
    }
    public static void main(String[] args) {
        
        // Median of 2 Sorted Arrays of Different Sizes
        
    }
}

