public class Q2_MaximumProductArray {
    
     public static int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int lmax =arr[0];
        int rmax = arr[n-1];
        int maxProd=Math.max(lmax,rmax);
        for(int i=1;i<n;i++){
            System.out.println("--index-----("+i+")-------------");
            lmax*=arr[i];
            rmax*=arr[n-1-i];
            System.out.println("--lmax-----("+lmax+")-------------");
            System.out.println("---rmax----("+rmax+")-------------");
            System.out.println("----maxProd-old--("+maxProd+")-------------");
            maxProd = Math.max(maxProd,lmax);
            maxProd = Math.max(maxProd, rmax);
            System.out.println("----maxProd---("+maxProd+")-------------");
            if(lmax==0){
                lmax=1;
            }
            if(rmax==0){
                rmax=1;
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

        return maxProd;
    }

    public static void main(String[] args) {
        
        // Examples
        // Input: arr[] = [-2, 6, -3, -10, 0, 2]
        // Output: 180
        // Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.
        // Input: arr[] = [-1, -3, -10, 0, 6]
        // Output: 30
        // Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.
        // Input: arr[] = [2, 3, 4] 
        // Output: 24 
        // Explanation: For an array with all positive elements, the result is product of all elements. 

        int[] nums = {-2, 6, -3, -10, 0, 2};
        int result = maxProduct(nums);
        System.out.println(result);
    }
}
