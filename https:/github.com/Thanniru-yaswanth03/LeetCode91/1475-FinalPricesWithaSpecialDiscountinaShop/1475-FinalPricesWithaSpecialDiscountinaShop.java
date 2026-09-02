// Last updated: 9/2/2026, 1:17:54 PM
1class Solution {
2    public int[] finalPrices(int[] prices) {
3        int ans[]= new int [prices.length];
4        for(int i =0;i<prices.length;i++){
5            int discount=0;
6            for(int j=i+1;j<prices.length;j++){
7                if(prices[j]<=prices[i]){
8                    discount=prices[j];
9                    break;
10                }
11            }ans[i]=prices[i]-discount;
12
13        }return ans;
14
15        
16    }
17}