public class boilerPlateCodeForArrayQues {
    
    public static int functionName(int[] nums){

       int n= nums.length;
        for(int i=0;i<n;i++){
            
        }
        return n;
    }


    public static void main(String[] args) {
        
        int[] nums = {};
        int result = functionName(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("result "+result);
    }
}
