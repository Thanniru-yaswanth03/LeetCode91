// Last updated: 9/13/2026, 7:14:15 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        //here i initialised k with 1 coz i wanna compare it with i-1 which is its prev ele in future so 
        int k = 1;

        //here i ran a for loop and inside for loop i constantly checked for every iteration if the prev ele is not equal to the current if it is not equal then i replaced the val nums[k] with nums[i] and iterated k++ and finally returned the val of k 
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}