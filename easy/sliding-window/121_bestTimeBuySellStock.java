class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;

        while(r<prices.length) {
            if(prices[l] < prices[r]) {
                maxProfit = Math.max(prices[r] - prices[l], maxProfit);
            } else {
                l=r;
            }
            r++;
        }
        return maxProfit;        
    }
}
