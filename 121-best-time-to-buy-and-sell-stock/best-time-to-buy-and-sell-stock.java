class Solution {
    public int maxProfit(int[] prices) {
        int lowestprice  = prices[0];
         int max = 0;
        for(int price : prices){
            lowestprice  =Math.min(price, lowestprice);
            int profit  = price - lowestprice;
            max = Math.max(max, profit);
        }
        return max ;
    }
}