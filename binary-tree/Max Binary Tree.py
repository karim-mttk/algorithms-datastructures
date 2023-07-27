"""
The task is to create a maximum binary tree recursively from an integer array called "nums", 
which has no duplicate values. This is achieved through the following algorithm:

    Start by creating a root node with a value equal to the maximum value present in the "nums" array.

    Then, recursively build the left subtree on the subarray that is present to the left of the maximum value.

    Similarly, recursively build the right subtree on the subarray that is present to the right of the maximum value.

    Finally, return the maximum binary tree that has been built from the given "nums" array.
"""
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#v1. One method. Time complexity: O(n²) and space complexity: O(n²)
class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums:
            return None
        maxVal = max(nums)
        maxIndex = nums.index(maxVal)
        root = TreeNode(maxVal)
        root.left = self.constructMaximumBinaryTree(nums[:maxIndex])
        root.right = self.constructMaximumBinaryTree(nums[maxIndex+1:])
        return root

#v2. Two methods. Time complexity: O(n²) and space complexity: O(n²)    
class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        return self.recursionMethod(nums, 0, len(nums)) 

    def recursionMethod(self, nums, r, l):
        if r == l:
            return None
        maxVal = max(nums[r:l])
        maxIndex = nums.index(maxVal)
        root = TreeNode(maxVal)
        root.left = self.recursionMethod(nums, r, maxIndex)
        root.right = self.recursionMethod(nums, maxIndex+1, l)
        return root   