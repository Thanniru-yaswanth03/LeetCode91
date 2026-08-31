# Last updated: 8/31/2026, 2:57:20 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pair_idx = {}

        for i, num in enumerate(nums):
            if target - num in pair_idx:
                return [i, pair_idx[target - num]]
            pair_idx[num] = i