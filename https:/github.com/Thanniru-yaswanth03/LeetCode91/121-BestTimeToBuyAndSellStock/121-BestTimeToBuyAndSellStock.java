// Last updated: 9/13/2026, 7:14:06 PM
class Solution {
    public int maxProfit(int[] prices) {
        //here what i did is i took min as infinity to compare adn get least val 
        int min = Integer.MAX_VALUE;
        //and then to get max profit val i initisalised it with 0 
        int maxProfit = 0;
        //this loop is to get min val and then i also get profit val and compare the curr profit with max and replace it and then finally return it 
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            int profit = prices[i] - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

//optimised 
// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxProfit = 0;
//         int lowestPrice = Integer.MAX_VALUE;

//         for(int price : prices){
//             if(price < lowestPrice){
//                 lowestPrice = price;
//             }
//             maxProfit = Math.max(maxProfit, price - lowestPrice);
//         }
//         System.gc();
//         return maxProfit;
//     }
// }