public class Q3_StockBuyAndSell {

    public static int stockBuySell(int a[]) {
        // code here

        int profit = 0;
        int s = a[0];
        int n = a.length;
        int intervalProfit = 0;
        // 63, 17, 59, 6, 8, 7, 52, 50, 20
        for (int i = 1; i < n; i++) {
            if (a[i] > s && a[i] > a[i - 1]) {
                // System.out.println(intervalProfit+" s "+s+" a[i] "+a[i]+" profit "+profit);
                intervalProfit = Math.max(intervalProfit, a[i] - s);
                // System.out.println(intervalProfit);
            } else if (a[i] < a[i - 1] || a[i] < s) {
                profit += intervalProfit;
                s = a[i];
                intervalProfit = 0;
                // System.out.println("in this "+s);
            }
        }
        if (intervalProfit > 0) {
            profit += intervalProfit;
        }
        return profit;
    }

    public static int stockBuySell2(int arr[]) {
        // Initialize profit to 0. This will hold the total profit.
        int profit = 0;

        // Loop through the arr array starting from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {
            // Check if the price today (arr[i]) is greater than the price yesterday
            // (arr[i-1]). This means there's an opportunity for profit, as buying
            // yesterday and selling today would yield profit.
            if (arr[i - 1] < arr[i]) {
                // Add the difference (profit) to the total profit.
                profit += arr[i] - arr[i - 1];
            }
        }

        // Return the accumulated profit after processing all days.
        return profit;
    }

    public static void main(String[] args) {

        // Stock buy and sell

        // Examples:
        // Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
        // Output: 865
        // Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
        // Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit
        // = 210 + 655 = 865
        // Input: arr[] = [4, 2, 2, 2, 4]
        // Output: 2
        // Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2
        // Input: arr[] = [4, 2]
        // Output: 0
        // Explanation: Don't Buy the stock.

        // 59-17=42
        // 8-6 =2
        // 52-7 = 45
        int[] nums = { 63, 17, 59, 6, 20, 7, 52, 50, 20 };
        int result = stockBuySell(nums);
        System.out.println("result " + result);

    }
}