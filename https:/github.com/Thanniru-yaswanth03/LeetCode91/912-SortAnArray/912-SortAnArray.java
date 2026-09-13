// Last updated: 9/13/2026, 7:13:46 PM
class Solution {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {

        // Stop when there is only one element
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort the left half
        mergeSort(nums, left, mid);

        // Sort the right half
        mergeSort(nums, mid + 1, right);

        // Merge both sorted halves
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare both halves and put the smaller value into temp
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from the left half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right half
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy sorted values back into nums
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}

