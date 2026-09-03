// Last updated: 9/3/2026, 3:16:35 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int j = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            
8            if (nums[i] != 0) {
9                int temp = nums[i];
10                nums[i] = nums[j];
11                nums[j] = temp;
12                j++;
13            }
14        }
15    }
16}