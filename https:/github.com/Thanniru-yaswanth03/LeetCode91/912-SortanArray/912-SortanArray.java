// Last updated: 9/10/2026, 2:06:38 PM
1class Solution {
2
3    public int[] sortArray(int[] nums) {
4
5        mergeSort(nums, 0, nums.length - 1);
6
7        return nums;
8    }
9
10    public void mergeSort(int[] nums, int left, int right) {
11
12        // Stop when there is only one element
13        if (left >= right) {
14            return;
15        }
16
17        int mid = left + (right - left) / 2;
18
19        // Sort the left half
20        mergeSort(nums, left, mid);
21
22        // Sort the right half
23        mergeSort(nums, mid + 1, right);
24
25        // Merge both sorted halves
26        merge(nums, left, mid, right);
27    }
28
29    public void merge(int[] nums, int left, int mid, int right) {
30
31        int[] temp = new int[right - left + 1];
32
33        int i = left;
34        int j = mid + 1;
35        int k = 0;
36
37        // Compare both halves and put the smaller value into temp
38        while (i <= mid && j <= right) {
39
40            if (nums[i] <= nums[j]) {
41                temp[k] = nums[i];
42                i++;
43            } else {
44                temp[k] = nums[j];
45                j++;
46            }
47
48            k++;
49        }
50
51        // Copy remaining elements from the left half
52        while (i <= mid) {
53            temp[k] = nums[i];
54            i++;
55            k++;
56        }
57
58        // Copy remaining elements from the right half
59        while (j <= right) {
60            temp[k] = nums[j];
61            j++;
62            k++;
63        }
64
65        // Copy sorted values back into nums
66        for (int x = 0; x < temp.length; x++) {
67            nums[left + x] = temp[x];
68        }
69    }
70}
71
72