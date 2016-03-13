/**
 * Created by liutao on 3/10/16.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        // write your code here
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int len = prices.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int minPrice = Integer.MAX_VALUE, profit = 0;
        int i = 0;
        for (int price : prices) {
            profit = Math.max(profit, price - minPrice);
            minPrice = Math.min(minPrice, price);
            left[i++] = profit;
        }
        int maxPrice = prices[len - 1];
        profit = 0;
        for (i = len - 1; i >= 0; i--) {
            int price = prices[i];
            profit = Math.max(profit, maxPrice - price);
            maxPrice = Math.max(maxPrice, price);
            right[i] = profit;
        }
        profit = 0;
        for (i = 0; i < len; i++) {
            profit = Math.max(profit, left[i] + right[i]);
        }
        return profit;
    }
}
