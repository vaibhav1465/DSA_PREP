public class Q2_StockBuyAndSellMaxKTransaction {
    public static int maxProfit(int arr[], int k) {
        // code here

        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                profit += arr[i] - arr[i - 1];
            }
        }

        return profit;
        
    }
    public static void main(String[] args) {
        // Stock Buy and Sell – Max K Transactions Allowed
    }
}
