// Last updated: 9/10/2026, 4:07:13 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int row=matrix.length;
4        int col=matrix[0].length;
5        int [][] result=new int[col][row];
6        for(int i =0;i<matrix.length;i++){
7            for(int j=0;j<matrix[i].length;j++){
8                result[j][i]= matrix[i][j];
9            }
10        }return result;
11    }
12}