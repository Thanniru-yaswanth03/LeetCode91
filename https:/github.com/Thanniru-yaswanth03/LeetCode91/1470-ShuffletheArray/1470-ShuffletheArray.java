// Last updated: 9/1/2026, 11:36:03 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int ans[]= new int[nums.length];
4        for(int i=0;i<n;i++){
5            ans[2*i]=nums[i];
6            ans[2*i+1]=nums[i+n];
7        }return ans;
8        
9    }
10}