// Last updated: 8/6/2026, 7:57:54 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        return nums[nums.length/2];
5    }
6}