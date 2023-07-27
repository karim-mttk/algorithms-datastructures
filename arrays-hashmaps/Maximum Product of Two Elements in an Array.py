"""
The task is to select two distinct indices i and j from an array of integers called "nums" and return the
 maximum possible value of the expression (nums[i]-1)*(nums[j]-1).
"""
#V1. Using Array. Time complexity: O(n²) and space complexity: O(n²)
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        arr = []
        
        for i in range(n):
            for j in range(i+1, n):
                arr.append((nums[i]-1)*(nums[j]-1))

        return max(arr)

#V2. Using comparisons. Time complexity: O(n) and space complexity: O(1)    
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max1 = max2 = float('-inf')  # initialize max1 and max2 to negative infinity
        
        for num in nums:
            if num >= max1:
                max2 = max1
                max1 = num
            elif num > max2:
                max2 = num
        
        return (max1 - 1) * (max2 - 1)    