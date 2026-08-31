// Last updated: 8/31/2026, 3:32:26 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        // i took new arr and its length is twice nums length
        int ans[]= new int[nums.length * 2];
        //then using for loop for the first half i equalled it with the nums ele and for second half what i did is to get second half indexes i added the nums length to the i and added the elements after the second half 
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];//first half
            ans[i+nums.length]=nums[i];//second half
        }return ans;
    }
}