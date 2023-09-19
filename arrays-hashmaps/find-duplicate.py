"""
this is a brute force solution which will results in a time complexity of O(n^2). Can we do better with O(n)?
p.s: space complexity must be O(1)
"""


class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] != nums[j]:
                    continue
                else:
                    return nums[i]