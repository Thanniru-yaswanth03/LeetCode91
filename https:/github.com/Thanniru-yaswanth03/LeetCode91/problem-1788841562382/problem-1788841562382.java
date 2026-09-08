// Last updated: 9/8/2026, 9:56:02 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        //here i initialised k with 1 coz i wanna compare it with i-1 which is its prev ele in future so 
4        int k = 1;
5
6        //here i ran a for loop and inside for loop i constantly checked for every iteration if the prev ele is not equal to the current if it is not equal then i replaced the val nums[k] with nums[i] and iterated k++ and finally returned the val of k 
7        for (int i = 1; i < nums.length; i++) {
8
9            if (nums[i] != nums[i - 1]) {
10                nums[k] = nums[i];
11                k++;
12            }
13        }
14
15        return k;
16    }
17}