public class Q3_FrogJump {
    public static int frogJump(int[] heights, int n,int[] dp) {

        if(dp[n]!=-1){
            return dp[n];
        }

        if(n<=0){
            return 0;
        }

        int left = frogJump(heights,n-1,dp) + Math.abs(heights[n]-heights[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) {
            right = frogJump(heights, n - 2, dp) + Math.abs(heights[n] - heights[n - 2]);
        }

        return dp[n]=Math.min(left,right);
    }

    public static void main(String[] args) {

        int[] a = new int[]{7, 5, 1, 2, 6};
        int n = a.length;


        int[] dp = new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int result =  frogJump(a,n-1,dp);
        System.out.println(result);



    }
}
