// Last updated: 9/8/2026, 9:29:54 AM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        //here i initialised k with 0 
4        int k = 0;
5        //here what i am gonna do is i use a for loop and if i find a number which is not equal to the given val then i store the ele at the kth index and increment k++ so that values which are not equal to given equal stores at the start of the array here we also get the count of the values which are not equal to the given value so we gonna return it 
6        for (int i = 0; i < nums.length; i++) {
7
8            if (nums[i] != val) {
9                nums[k] = nums[i];
10                k++;
11            }
12        }
13
14        return k;
15    }
16}