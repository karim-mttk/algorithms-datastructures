"""
The task involves working with a binary tree comprising of precisely three nodes:
the root, its left child, and its right child. The goal is to determine whether
the value of the root is equivalent to the total value of its two children. 
If the root value is equal to the sum of its children, 
then the answer is true; otherwise, it is false.
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#v1 using boolean variable. Time complexity: O(1), Space complexity: O(1)
class Solution:
    def checkTree(self, root: Optional[TreeNode]) -> bool:
            if root:
                if root.val == root.left.val + root.right.val:
                    return True
                else:
                    return False     

#v2 one line solution. Time complexity: O(1), Space complexity: O(1). Runtime: 29ms, Memory: 13.8MB               
class Solution2: 
     def checkTree (self, root: Optional[TreeNode]) -> bool:
            return root.val == root.left.val + root.right.val
                