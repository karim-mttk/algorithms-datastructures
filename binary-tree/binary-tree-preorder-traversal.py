# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []

        def rec(node):
            if not node:
                return
            res.append(node.val)

            rec(node.left)
            rec(node.right)

        rec(root)
        return res