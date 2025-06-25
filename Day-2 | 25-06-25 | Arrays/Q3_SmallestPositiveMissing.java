public class Q3_SmallestPositiveMissing {

     public static int smallestPositiveMissing(int[] nums){

        int max = Integer.MIN_VALUE;
        int sum =0;

        // [-2,1,-3,4,-1,2,1,-5,4]
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        
    }
}
