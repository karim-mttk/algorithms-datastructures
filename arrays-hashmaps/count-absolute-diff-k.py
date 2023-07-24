#solution 1, Time: O(n^2)
def countKDifference(self, nums: List[int], k: int) -> int:
    count = 0
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if abs(nums[i] - nums[j]) == k:
                count += 1
    return count
#solution, Time: O(n)
def countKDifference(self, nums: List[int], k: int) -> int:
    count = 0

    hash = {}

    for i in nums:
        if i in hash:
            hash[i] += 1
        else:
            hash[i] = 1

    for i in hash:
        if i + k in hash:
            count += hash[i] * hash[i + k]

    return count