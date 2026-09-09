// Last updated: 9/9/2026, 3:03:10 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        //here what i did is i took min as infinity to compare adn get least val 
4        int min = Integer.MAX_VALUE;
5        //and then to get max profit val i initisalised it with 0 
6        int maxProfit = 0;
7        //this loop is to get min val and then i also get profit val and compare the curr profit with max and replace it and then finally return it 
8        for (int i = 0; i < prices.length; i++) {
9
10            if (prices[i] < min) {
11                min = prices[i];
12            }
13
14            int profit = prices[i] - min;
15
16            if (profit > maxProfit) {
17                maxProfit = profit;
18            }
19        }
20
21        return maxProfit;
22    }
23}