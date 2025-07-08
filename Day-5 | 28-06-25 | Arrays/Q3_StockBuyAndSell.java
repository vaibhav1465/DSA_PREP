public class Q3_StockBuyAndSell {

    public static int stockBuySell(int a[]) {
        // code here

        int profit = 0;
        int s= a[0];
        int n = a.length;
        int intervalProfit = 0;
        for(int i=1;i<n;i++){
           if(a[i]>s){
            intervalProfit = Math.max(intervalProfit, a[i]-s);
           }else{
            profit+=intervalProfit;
            s=a[i];
            intervalProfit=0;
           }
        }

        return profit;
        
    }
    public static void main(String[] args) {
     
        // Stock buy and sell
        
        // Examples:
        // Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
        // Output: 865
        // Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865
        // Input: arr[] = [4, 2, 2, 2, 4]
        // Output: 2
        // Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2
        // Input: arr[] = [4, 2]
        // Output: 0
        // Explanation: Don't Buy the stock.


        int[] nums = {100, 180, 260, 310, 40, 535, 695};
        int result = stockBuySell(nums);
        System.out.println("result "+result);



    }
}