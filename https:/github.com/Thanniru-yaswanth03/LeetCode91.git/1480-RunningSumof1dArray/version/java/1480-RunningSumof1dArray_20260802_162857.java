// Last updated: 8/2/2026, 4:28:57 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int sum=0;
4        int arr[]=new int[nums.length];
5
6        for(int i=0;i<nums.length;i++){
7            sum+=nums[i];
8            arr[i]=sum;
9        }
10        return arr;
11    }
12}