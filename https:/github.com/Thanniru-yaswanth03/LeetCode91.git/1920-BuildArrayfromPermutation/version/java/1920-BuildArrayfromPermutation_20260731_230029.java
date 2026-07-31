// Last updated: 7/31/2026, 11:00:29 PM
1class Solution {
2    public int[] buildArray(int[] nums) {
3       int ans[]=new int[nums.length];
4       for(int i =0;i<nums.length;i++){
5            ans[i] = nums[nums[i]];    
6       } return ans;
7    }
8}
9