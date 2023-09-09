class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        def rec(node):
            if not node:
                return

            rec(node.left)
            rec(node.right)

            res.append(node.val)

        res = []
        rec(root)
        return res