public class Q1_Fibonacci {

    public static int fibonacci(int n,int[] dp){

        if(dp[n]!=-1){
            return dp[n];
        }
        if(n<=1){
            return n;
        }
        return  dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
    }

    public static void main(String[] args) {

        int n =10;
        int[] dp = new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        int result =fibonacci(n,dp);
        System.out.println(result);
//        for(int i=0;i<=n;i++){
//            System.out.print(dp[i]+" ");
//        }
//        System.out.println();
    }
}
