// Last updated: 8/31/2026, 3:50:19 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int csum =0;
4        int n = nums.length;
5        int asum=n*(n+1)/2;
6        for(int i =0;i<n;i++){
7            csum+=nums[i];
8        }
9        int mn= asum-csum;
10        return mn;
11    }
12}