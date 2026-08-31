// Last updated: 8/31/2026, 2:57:07 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            int length=0;
            int n = nums[i];
            while(n>0){
                n/=10;
                length++;
            }
            if(length %2 ==0){
                count++;
            }
        }return count;
        
    }
}