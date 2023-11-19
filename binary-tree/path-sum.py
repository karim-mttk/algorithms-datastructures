class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        def dfs(node, cSum):
            if not node:
                return False

            cSum += node.val
            if not node.left and not node.right:
                return cSum == targetSum
            return (dfs(node.left, cSum) or dfs(node.right, cSum))

        return dfs(root, 0)