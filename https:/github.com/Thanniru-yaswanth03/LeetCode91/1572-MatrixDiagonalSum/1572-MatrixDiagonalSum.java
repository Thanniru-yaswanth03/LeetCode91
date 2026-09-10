// Last updated: 9/10/2026, 3:56:18 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum=0;
4        int n = mat.length;
5        for (int i = 0; i < mat.length; i++) {
6            sum+=mat[i][i];
7            sum+=mat[i][mat.length - 1 -i];
8        }
9        if(n%2==1){
10            sum-=mat[n/2][n/2];
11        }return sum;
12    }
13}