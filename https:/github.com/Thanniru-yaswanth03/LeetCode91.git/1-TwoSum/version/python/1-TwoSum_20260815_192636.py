# Last updated: 8/15/2026, 7:26:36 PM
1class Solution:
2    def twoSum(self, nums: List[int], target: int) -> List[int]:
3        pair_idx = {}
4
5        for i, num in enumerate(nums):
6            if target - num in pair_idx:
7                return [i, pair_idx[target - num]]
8            pair_idx[num] = i