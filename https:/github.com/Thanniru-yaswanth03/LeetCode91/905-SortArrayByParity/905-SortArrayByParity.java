// Last updated: 9/10/2026, 11:08:16 AM
1class Solution {
2
3    public void sortColors(int[] nums) {
4
5        // Compare each element with the elements after it
6        for (int i = 0; i < nums.length; i++) {
7
8            for (int j = i + 1; j < nums.length; j++) {
9
10                // If a smaller element is found, swap it with nums[i]
11                if (nums[j] < nums[i]) {
12
13                    int temp = nums[i];
14                    nums[i] = nums[j];
15                    nums[j] = temp;
16                }
17            }
18        }
19    }
20}