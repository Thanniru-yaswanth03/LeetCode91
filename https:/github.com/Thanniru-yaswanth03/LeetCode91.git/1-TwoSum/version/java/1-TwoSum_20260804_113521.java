// Last updated: 8/4/2026, 11:35:21 AM
class Solution {
    public int[] twoSum(int[] nums, int x) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int ele = x-nums[i];
            if(map.containsKey(ele)){
                return new int[]{map.get(ele),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}