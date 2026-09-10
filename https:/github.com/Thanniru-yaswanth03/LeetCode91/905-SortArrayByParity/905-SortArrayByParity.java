// Last updated: 9/10/2026, 11:07:14 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=i+1;j<nums.length;j++){
5                if(nums[j]<nums[i]){
6                    int temp= nums[i];
7                    nums[i]=nums[j];
8                    nums[j]=temp;
9                }
10            }
11        }
12    }
13}