#v1. with array and count
class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        arr = []
        for i in nums:
            if i < 0:
                arr.append(0)
            elif i > 0:
                arr.append(1)
        return max(arr.count(0), arr.count(1))

#v2. with integer and count
class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        count_0 = 0
        count_1 = 0
        for i in nums:
            if i < 0:
               count_0 += 1
            elif i > 0:
               count_1 += 1
        return max(count_0, count_1)