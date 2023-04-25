# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# v1. slow version checking through all the nodes
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        total = 0

        def dfs(root: Optoinal[TreeNode]):
            nonlocal total
            if not root:
                return
            if root.val >= low and root.val <= high:
                total += root.val
            dfs(root.left)
            dfs(root.right)

        dfs(root)
        return total


# v2. faster version using the search of binary tree
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        total = 0

        def dfs(node: Optional[TreeNode]):
            nonlocal total
            if not node:
                return
            if node.val < low:
                dfs(node.right)
            elif node.val > high:
                dfs(node.left)
            else:
                total += node.val
                dfs(node.left)
                dfs(node.right)

        dfs(root)
        return total
