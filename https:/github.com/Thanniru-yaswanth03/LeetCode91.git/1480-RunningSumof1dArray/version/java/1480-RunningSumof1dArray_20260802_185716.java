// Last updated: 8/2/2026, 6:57:16 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int sum=0;
4        int arr[]=new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            arr[i]=sum;
8        }return arr;
9    }
10}