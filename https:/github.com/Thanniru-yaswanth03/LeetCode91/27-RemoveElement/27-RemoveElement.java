// Last updated: 9/13/2026, 7:14:13 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        //here i initialised k with 0 
        int k = 0;
        //here what i am gonna do is i use a for loop and if i find a number which is not equal to the given val then i store the ele at the kth index and increment k++ so that values which are not equal to given equal stores at the start of the array here we also get the count of the values which are not equal to the given value so we gonna return it 
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}