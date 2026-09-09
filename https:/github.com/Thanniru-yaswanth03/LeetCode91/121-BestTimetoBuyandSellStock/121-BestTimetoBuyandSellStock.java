// Last updated: 9/9/2026, 4:22:22 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3
4        long first = Long.MIN_VALUE;
5        long second = Long.MIN_VALUE;
6        long third = Long.MIN_VALUE;
7
8        for (int num : nums) {
9
10            if (num == first || num == second || num == third) {
11                continue;
12            }
13
14            if (num > first) {
15                third = second;
16                second = first;
17                first = num;
18
19            } else if (num > second) {
20                third = second;
21                second = num;
22
23            } else if (num > third) {
24                third = num;
25            }
26        }
27
28        if (third == Long.MIN_VALUE) {
29            return (int) first;
30        }
31
32        return (int) third;
33    }
34}