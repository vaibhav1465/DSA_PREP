public class Q2_MoveAllNegativeNumberToEnd {
     public static void moveAllNegativeNumberToEnd(int[] nums){

       int n= nums.length;
       int s = 0;
       int e = n-1;
       int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
             temp[s++]=nums[i];
            }else{
             temp[e--]=nums[i];
            }
        }
        e=n-1;
        for(int i=0;i<n;i++){
            if(temp[i]<0){
             nums[e--]=temp[i];
            }else{
            nums[i]=temp[i];
            }
        }
    }


    public static void main(String[] args) {
        
    // Note: Don't return any array, just in-place on the array.
    // Examples:
    // Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
    // Output : [1, 3, 2, 11, 6, -1, -7, -5]
    // Explanation: By doing operations we separated the integers without changing the order.
    // Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
    // Output : [7, 9, 10, 11, -5, -3, -4, -1]

        int[] nums = {-5, 7, -3, -4, 9, 10, -1, 11};
        moveAllNegativeNumberToEnd(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
