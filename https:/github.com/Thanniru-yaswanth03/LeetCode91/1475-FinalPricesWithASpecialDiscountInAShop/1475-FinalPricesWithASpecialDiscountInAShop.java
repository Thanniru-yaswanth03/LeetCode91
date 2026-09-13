// Last updated: 9/13/2026, 7:13:36 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]= new int [prices.length];
        for(int i =0;i<prices.length;i++){
            int discount=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    discount=prices[j];
                    break;
                }
            }ans[i]=prices[i]-discount;

        }return ans;

        
    }
}