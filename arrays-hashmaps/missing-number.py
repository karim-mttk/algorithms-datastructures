def missingNumber(self, nums: List[int]) -> int:
    hashset = set(nums)
    if 0 not in nums:
        return 0

    for i in range(len(nums) + 1):
        if i not in hashset:
            return i

    return None

#solution 2: using sums
def missingNumber(self, nums: List[int]) -> int:
    return sum(range(len(nums)+1)) - sum(nums)