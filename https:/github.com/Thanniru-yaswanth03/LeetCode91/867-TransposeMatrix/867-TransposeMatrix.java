// Last updated: 9/13/2026, 7:13:49 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int [][] result=new int[col][row];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[j][i]= matrix[i][j];
            }
        }return result;
    }
}