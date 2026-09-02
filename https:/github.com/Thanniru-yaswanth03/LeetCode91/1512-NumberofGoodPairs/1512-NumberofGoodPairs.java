// Last updated: 9/2/2026, 12:39:58 PM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int total = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            for (int j = i + 1; j < nums.length; j++) {
7                if (nums[i] == nums[j]) {
8                    total++;
9                }
10            }
11        }
12
13        return total;
14    }
15}