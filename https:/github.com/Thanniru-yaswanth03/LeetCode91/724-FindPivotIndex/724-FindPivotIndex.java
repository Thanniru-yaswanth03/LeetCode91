// Last updated: 9/8/2026, 9:04:06 AM
1class Solution {
2
3    public int pivotIndex(int[] nums) {
4
5        // Calculate the total sum of all elements.
6        int total = 0;
7
8        for (int num : nums) {
9            total += num;
10        }
11
12        // Initially, there are no elements on the left of index 0,
13        // so the left sum starts at 0.
14        int left = 0;
15
16        /*
17         * For every index:
18         * TOTAL = LEFT + PIVOT + RIGHT
19         * Therefore:
20         * RIGHT = TOTAL - LEFT - PIVOT
21         *
22         * If LEFT == RIGHT, we found the pivot index.
23         * Otherwise, add the current element to the left sum
24         * before moving to the next index.
25         */
26        for (int i = 0; i < nums.length; i++) {
27
28            int right = total - left - nums[i];
29
30            if (left == right) {
31                return i;
32            }
33
34            left += nums[i];
35        }
36
37        // No pivot index exists.
38        return -1;
39    }
40}