class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;                         ///?why not we use Integer.minvalue bux what happen if we get that arr where all stock are negative.
        int todayprofit = 0;
        int buy = prices[0];

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] <= buy) {
                buy = prices[i];
            }
            //now checking today profit
            todayprofit = prices[i] - buy;

            //now store in maxprofit
            if (todayprofit >= maxprofit) {
                maxprofit = todayprofit;
            } 

        }
        return maxprofit;
    }
}