// Last updated: 9/10/2026, 1:54:21 PM
1class Solution {
2
3    public int[] sortArray(int[] nums) {
4
5        int n = nums.length;
6
7        // Build a max heap
8        for (int i = n / 2 - 1; i >= 0; i--) {
9            heapify(nums, n, i);
10        }
11
12        // Move the largest element to the end
13        for (int i = n - 1; i > 0; i--) {
14
15            int temp = nums[0];
16            nums[0] = nums[i];
17            nums[i] = temp;
18
19            // Restore the heap
20            heapify(nums, i, 0);
21        }
22
23        return nums;
24    }
25
26    public void heapify(int[] nums, int n, int i) {
27
28        int largest = i;
29
30        int left = 2 * i + 1;
31        int right = 2 * i + 2;
32
33        // Check if left child is larger
34        if (left < n && nums[left] > nums[largest]) {
35            largest = left;
36        }
37
38        // Check if right child is larger
39        if (right < n && nums[right] > nums[largest]) {
40            largest = right;
41        }
42
43        // If a child is larger, swap and continue
44        if (largest != i) {
45
46            int temp = nums[i];
47            nums[i] = nums[largest];
48            nums[largest] = temp;
49
50            heapify(nums, n, largest);
51        }
52    }
53}
54