// Last updated: 7/31/2026, 11:11:44 PM
1class Solution {
2    public int[] buildArray(int[] nums) {
3    int ans[]=new int[nums.length];
4    for(int i=0;i<nums.length;i++){
5        ans[i] = nums[nums[i]];     
6        }   
7        return ans;     
8    }
9}
10