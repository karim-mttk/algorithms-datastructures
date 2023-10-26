def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
    if root is None:
        return TreeNode(val)

    if root.val < val:
        root.right = self.insertIntoBST(root.right, val)
    else:
        root.left = self.insertIntoBST(root.left, val)
    return root

#faster solution
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return TreeNode(val)

        if val > root.val:
            root.right = self.insertIntoBST(root.right, val)
        else:
            root.left = self.insertIntoBST(root.left, val)
        return root