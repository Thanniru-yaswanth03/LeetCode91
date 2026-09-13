// Last updated: 9/13/2026, 7:13:17 PM
class Solution {
    public int[] buildArray(int[] nums) {
    int ans[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        ans[i] = nums[nums[i]];     
        }   
        return ans;     
    }
}
