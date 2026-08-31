// Last updated: 8/31/2026, 3:29:08 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int ans[]= new int[nums.length * 2];
4        for(int i=0;i<nums.length;i++){
5            ans[i]=nums[i];
6            ans[i+nums.length]=nums[i];
7        }return ans;
8    }
9}