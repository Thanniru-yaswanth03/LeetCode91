// Last updated: 9/2/2026, 12:02:38 PM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max = 0;
4        for(int i=0;i<accounts.length;i++){
5            int total =0;
6            for(int j=0;j<accounts[i].length;j++){
7                total+=accounts[i][j];
8            }
9            if(total>=max){
10                max=total;
11            }
12        }return max;
13        
14    }
15}