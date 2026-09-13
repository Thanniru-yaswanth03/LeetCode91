// Last updated: 9/13/2026, 7:13:30 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }return arr;
    }
}