// Last updated: 9/8/2026, 7:25:46 PM
1class Solution {
2
3    public void merge(int[] nums1, int m, int[] nums2, int n) {
4
5        // nums1 has m actual elements and n empty spaces.
6        // Total size of nums1 is m + n.
7        int n1l = m + n;
8
9        // Copy all elements of nums2 into the empty portion of nums1.
10        for (int i = 0; i < n; i++) {
11            nums1[m + i] = nums2[i];
12        }
13
14        // Sort the combined array in non-decreasing order.
15        // Compare each element with the elements after it
16        // and swap if the current element is greater.
17        for (int i = 0; i < n1l; i++) {
18
19            for (int j = i + 1; j < n1l; j++) {
20
21                if (nums1[i] > nums1[j]) {
22
23                    int temp = nums1[i];
24                    nums1[i] = nums1[j];
25                    nums1[j] = temp;
26                }
27            }
28        }
29    }
30}