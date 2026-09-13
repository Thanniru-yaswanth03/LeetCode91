// Last updated: 9/13/2026, 7:14:10 PM
class Solution {

    public void sortColors(int[] nums) {

        // Compare each element with the elements after it
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // If a smaller element is found, swap it with nums[i]
                if (nums[j] < nums[i]) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}