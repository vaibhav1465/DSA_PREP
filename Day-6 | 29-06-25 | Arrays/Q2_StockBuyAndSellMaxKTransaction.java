public class Q2_StockBuyAndSellMaxKTransaction {
    public static int maxProfit(int arr[], int k) {
        // code here

        int profit = 0;

        int profitArray=
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                profit += arr[i] - arr[i - 1];
            }
        }

        return profit;
        
    }
    public static void main(String[] args) {
        // Stock Buy and Sell – Max K Transactions Allowed
        // Examples :
        // Input: prices[] = [10, 22, 5, 80], k = 2
        // Output: 87
        // Explaination:
        // 1st transaction: Buy at 10 and sell at 22. 
        // 2nd transaction : Buy at 5 and sell at 80.
        // Total Profit will be 12 + 75 = 87.
        // Input: prices[] = [20, 580, 420, 900], k = 3
        // Output: 1040
        // Explaination: 
        // 1st transaction: Buy at 20 and sell at 580. 
        // 2nd transaction : Buy at 420 and sell at 900.
        // Total Profit will be 560 + 480 = 1040.
        // Input: prices[] = [100, 90, 80, 50, 25],  k = 1
        // Output: 0
        // Explaination: Selling price is decreasing continuously
        // leading to loss. So seller cannot have any profit.

        int[] nums = {10, 22, 5, 80};
        int result = maxProfit(nums,2);
        System.out.println("result "+result);


    }
}
