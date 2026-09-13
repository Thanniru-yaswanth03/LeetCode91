// Last updated: 9/13/2026, 7:13:28 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    total++;
                }
            }
        }

        return total;
    }
}