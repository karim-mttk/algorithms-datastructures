class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        deepest_level = -1
        total = 0

        def dfs(node: TreeNode, level: int):
            nonlocal deepest_level, total
            if not node:
                return
            if level > deepest_level:
                deepest_level = level
                total = node.val
            elif level == deepest_level:
                total += node.val
            dfs(node.left, level+1)
            dfs(node.right, level+1)

        dfs(root, 0)
        return total
