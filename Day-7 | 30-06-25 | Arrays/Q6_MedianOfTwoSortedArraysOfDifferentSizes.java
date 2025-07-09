
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
                if (end < n && a[start] > a[end]) {
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                } else if (start > n && b[start - n] > b[end - n]) {
                    int temp = b[start - n];
                    b[start - n] = b[end - n];
                    b[end - n] = temp;
                } else if (start < n && end >= n && a[start] > b[end - n]) {
                    int temp = a[start];
                    a[start] = b[end - n];
                    b[end - n] = temp;
                }
                start++;
                end++;
            }
            if (gap == 1) {
                break;
            }
            gap = gap / 2 + gap % 2;
        }
        int l = n + m;
        int elementIndex = l / 2;
        int first = elementIndex < n ? a[elementIndex] : b[elementIndex - n];
        int second = (elementIndex - 1) < n ? a[elementIndex - 1] : b[(elementIndex - 1) - n];
        if (l % 2 == 0) {
            return (first + second) / 2.0;
        } else {
            return first;
        }
    }

    public static double medianOf2Otpmized(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int i = 0, j = 0;

        // m1 to store the middle element
        // m2 to store the second middle element
        int m1 = -1, m2 = -1;

        // Loop till (m + n)/2
        for (int count = 0; count <= (m + n) / 2; count++) {
            m2 = m1;

            // If both the arrays have remaining elements
            if (i != n && j != m)
                m1 = (a[i] > b[j]) ? b[j++] : a[i++];

            // If only a[] has remaining elements
            else if (i < n)
                m1 = a[i++];

            // If only b[] has remaining elements
            else
                m1 = b[j++];
        }

        // Return median based on odd/even size
        if ((m + n) % 2 == 1)
            return m1;
        else
            return (m1 + m2) / 2.0;
    }

    public static void main(String[] args) {

        // Median of 2 Sorted Arrays of Different Sizes

        // Examples:
        // Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
        // Output: 3
        // Explanation: The merged array is [-12, -10, -6, -5, -3, 3, 4, 6, 10, 12, 15].
        // So the median of the merged array is 3.
        // Input: a[] = [2, 3, 5, 8], b[] = [10, 12, 14, 16, 18, 20]
        // Output: 11
        // Explanation: The merged array is [2, 3, 5, 8, 10, 12, 14, 16, 18, 20]. So the
        // median of the merged array is (10 + 12) / 2 = 11.
        // Input: a[] = [], b[] = [2, 4, 5, 6]
        // Output: 4.5
        // Explanation: The merged array is [2, 4, 5, 6]. So the median of the merged
        // array is (4 + 5) / 2 = 4.5.

        int[] a = {};
        int[] b = { 2, 4, 5, 6 };
        double result = medianOf2(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("result " + result);
    }
}
