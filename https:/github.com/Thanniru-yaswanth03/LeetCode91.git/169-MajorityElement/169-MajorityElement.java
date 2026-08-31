// Last updated: 8/31/2026, 2:57:09 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}