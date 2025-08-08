public class Q4_FrogJumpByKStep {

    public static int frogJumpByKSteps(int[] heights, int n,int k,int[] dp) {

        if(dp[n]!=-1){
            return dp[n];
        }

        if(n<=0){
            return 0;
        }

        int max = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n>=i) {
                max = Math.min(max, (frogJumpByKSteps(heights, n - i, k, dp) + Math.abs(heights[n] - heights[n - i])));
            }
        }
        return dp[n]=max;
    }

    public static void main(String[] args) {

        int[] a = new int[]{10, 5, 20, 0, 15};
        int k =2;
        int n = a.length;

        int[] dp = new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int result =  frogJumpByKSteps(a,n-1,k,dp);
        System.out.println(result);


        // house of robbers
        // maxisum sum of non adacent
        // 2d array questions dp 2

    }
}