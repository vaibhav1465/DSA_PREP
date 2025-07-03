import java.util.Arrays;

public class Q5_RearrangeArrayAlternately {

    public static void rearrange2(int a[]) {
        // code here

        Arrays.sort(a);
        int n = a.length;
        int k = n - 1;
        int j = n - 1;

        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < n - 1; i++) {

            // swap i with k
            int t = a[i];
            a[i] = a[k];
            a[k] = t;
            i++;
            k--;

            for (int x = 0; x < a.length; x++) {
                System.out.print(a[x] + " ");
            }
            System.out.println();
            System.out.println();
            // In the end swap alternative
            if (i + 2 == j) {
                int t1 = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t1;
                for (int x = 0; x < a.length; x++) {
                    System.out.print(a[x] + " ");
                }
                System.out.println();
                System.out.println();
                break;
            } else if (i + 2 > j) {
                break;
            }
            // swap i+1 with j
            int t1 = a[i];
            a[i] = a[j];
            a[j] = t1;
            for (int x = 0; x < a.length; x++) {
                System.out.print(a[x] + " ");
            }
            System.out.println();
            System.out.println();

            System.out.println("---------------------");

        }

    }

    public static void rearrange1(int arr[]) {
        // code here
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i += 2) {
            int j = n - 1;
            while (j > i) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

    }

    public static void rearrange(int arr[]) {
             // Your code here
       int n=arr.length;
    	int lastidx=n-1;
    	int firstidx=0;
    	long maxi=arr[n-1]+1;
    	for(int i=0;i<n;i++)
    	{
    	    if(i%2==0)
    	    {
                System.out.println((arr[lastidx]%maxi) +"-----"+ maxi);
    	        arr[i]+=(arr[lastidx]%maxi)*maxi;
    	        lastidx--;
    	    }
    	    else
    	    {
             System.out.println((arr[firstidx]%maxi)+"****"+maxi);
    	    arr[i]+=(arr[firstidx]%maxi)*maxi;
    	        firstidx++;
    	    }
            System.out.println(arr[i]);
    	}
    	for(int i=0;i<n;i++)
    	arr[i]/=maxi;


    }

    public static void main(String[] args) {

        // Examples:
        // Input: arr[] = [1, 2, 3, 4, 5, 6]
        // Output: [6, 1, 5, 2, 4, 3]
        // Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so
        // on... The modified array is: [6, 1, 5, 2, 4, 3]
        // Input: arr[]= [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
        // Output: [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]
        // Explanation: Max element = 110, min = 10, second max = 100, second min = 20,
        // and so on... Modified array is : [110, 10, 100, 20, 90, 30, 80, 40, 70, 50,
        // 60]
        // Input: arr[]= [1]
        // Output: [1]

        int[] nums = { 1, 2, 3, 4, 5, 6 };
        rearrange(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        // System.out.println();
    }

}
