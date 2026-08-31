// Last updated: 8/31/2026, 2:56:05 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count =0;
4        for(int i =0;i<nums.length;i++){
5            int length=0;
6            int n = nums[i];
7            while(n>0){
8                n/=10;
9                length++;
10            }
11            if(length %2 ==0){
12                count++;
13            }
14        }return count;
15        
16    }
17}