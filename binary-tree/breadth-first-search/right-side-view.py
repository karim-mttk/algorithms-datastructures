# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        if not root:
            return res

        def rightRec(node, depth):
            if not node:
                return
            if depth == len(res):
                res.append(node.val)
            rightRec(node.right, depth + 1)
            rightRec(node.left, depth + 1)

        rightRec(root, 0)
        return res


