// Last updated: 9/8/2026, 9:29:46 AM
1// class Solution {
2//     public int removeElement(int[] nums, int val) {
3//         ArrayList<Integer> arr = new ArrayList<>();
4//         for(int i=0;i<nums.length;i++){
5//             if(val!=nums[i]){
6//                 arr.add(nums[i]);
7//             }
8//         }return arr;
9//     }
10// }
11class Solution {
12    public int removeElement(int[] nums, int val) {
13        //here i initialised k with 0 
14        int k = 0;
15        //here what i am gonna do is i use a for loop and if i find a number which is not equal to the given val then i store the ele at the kth index and increment k++ so that values which are not equal to given equal stores at the start of the array here we also get the count of the values which are not equal to the given value so we gonna return it 
16        for (int i = 0; i < nums.length; i++) {
17
18            if (nums[i] != val) {
19                nums[k] = nums[i];
20                k++;
21            }
22        }
23
24        return k;
25    }
26}