// Last updated: 9/12/2026, 1:40:19 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int total = m * n;
6
7        if (r * c != total) {
8            return mat;
9        }
10
11        int[][] res = new int[r][c];
12
13        for (int i = 0; i < total; i++) {
14            res[i / c][i % c] = mat[i / n][i % n];
15        }
16
17        return res;
18    }
19}