public class Q2_ClimbingStairs {
    public static int climbing(int n,int[] dp){

        if(dp[n]!=-1){
            return dp[n];
        }
        if(n<=1){
            return 1;
        }
        return dp[n] = climbing(n - 1, dp) + climbing(n - 2, dp);
    }

    public static void main(String[] args) {

        int n =10;
        int[] dp = new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int result =climbing(n,dp);
        System.out.println(result);
//        for(int i=0;i<=n;i++){
//            System.out.print(dp[i]+" ");
//        }
//        System.out.println();
    }
}