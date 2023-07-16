# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        if root.right is None and root.left is None:
            return targetSum == root.val

        return self.hasPathSum(root.right, targetSum-root.val) or self.hasPathSum(root.left, targetSum-root.val)