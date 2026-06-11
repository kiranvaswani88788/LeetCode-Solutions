class Solution {
    public int maxProfit(int[] prices) {
       // int maxProfit = 0;
        int bestBuy = prices[0];
        int finalProfit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > bestBuy){
                finalProfit = finalProfit + (prices[i] - bestBuy);
                bestBuy = prices[i];
            }else{
                 bestBuy = Math.min(bestBuy,prices[i]);
            }
            
        }
        return finalProfit;
    }
}
