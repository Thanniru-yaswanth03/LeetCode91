// Last updated: 9/4/2026, 7:58:59 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int j = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            //easy peasy
8            
9            if (nums[i] != 0) {
10                int temp = nums[i];
11                nums[i] = nums[j];
12                nums[j] = temp;
13                j++;
14            }
15        }
16    }
17}