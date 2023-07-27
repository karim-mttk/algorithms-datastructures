"""
The task is to analyze the array called "nums" and, for each element nums[i], 
determine the number of values in the array that are smaller than it. 
Specifically, this involves counting the number of valid j values, where j is 
not equal to i, and nums[j] < nums[i].

The result of this analysis should be returned as an array.
"""
#V1. Using Array. Time complexity: O(n²) and space complexity: O(n)
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        n = len(nums)
        arr = []
        for i in range(n):
            c = 0
            for j in range(n):
                if nums[i] > nums[j]:
                    c += 1
            arr.append(c)
        return arr

#V2. Using Hash Table. Time complexity: O(n) and space complexity: O(1)
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        n = len(nums)
        count = [0] * 101  # since the numbers are in the range [0, 100]
        
        # count the occurrences of each number in the input array
        for num in nums:
            count[num] += 1
        
        # calculate the prefix sum of the count array
        for i in range(1, 101):
            count[i] += count[i-1]
        
        # for each number, get the count of numbers smaller than it
        res = []
        for num in nums:
            if num == 0:
                res.append(0)
            else:
                res.append(count[num-1])
        
        return res 