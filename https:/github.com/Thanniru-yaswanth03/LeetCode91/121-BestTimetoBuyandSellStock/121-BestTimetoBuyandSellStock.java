// Last updated: 9/9/2026, 3:07:39 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < lowestPrice){
                lowestPrice = price;
            }
            maxProfit = Math.max(maxProfit, price - lowestPrice);
        }
        System.gc();
        return maxProfit;
    }
}