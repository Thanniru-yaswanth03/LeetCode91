// Last updated: 8/31/2026, 3:31:21 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        // i took new arr and its length is twice nums length
4        int ans[]= new int[nums.length * 2];
5        //then using for loop for the first half i equalled it with the nums ele and for second half what i did is to get second half indexes i added the nums length to the i and added the elements after the second half 
6        for(int i=0;i<nums.length;i++){
7            ans[i]=nums[i];//first half
8            ans[i+nums.length]=nums[i];//second half
9        }return ans;
10    }
11}