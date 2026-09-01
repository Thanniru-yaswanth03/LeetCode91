// Last updated: 9/1/2026, 12:13:50 PM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int val = 0;
4        for(int i =0; i<operations.length;i++){
5            if(operations[i].contains("+")){
6                val+=1;
7            }else{
8                val-=1;
9            }
10        }return val;
11    }
12}