#v1. inorder traversal
class Solution:
    def increasingBST(self, root: TreeNode) -> TreeNode:
        # Create a dummy new root node with value 0
        new_root = TreeNode(0)
        # Create a temp node to traverse the new tree
        temp = new_root

        # Inorder traversal to get nodes in increasing order
        def inorder(node: TreeNode):
            if not node:
                return
            inorder(node.left)
            # Create a new node with the same value as the current node
            # and add it as the right child of the temp node
            nonlocal temp
            new_node = TreeNode(node.val)
            temp.right = new_node
            temp = temp.right
            inorder(node.right)

        inorder(root)

        # Return the right child of the new root node
        return new_root.right
    
#v2 Morris Traversal
class Solution:
    def increasingBST(self, root: TreeNode) -> TreeNode:
        newRoot = TreeNode(0)
        temp = newRoot
        while root:
            if root.left:
                rightMost = root.left
                while rightMost.right:
                    rightMost = rightMost.right
                rightMost.right = root
                tempNode = root
                root = root.left
                tempNode.left = None
            else:
                temp.right = root
                temp = temp.right
                root = root.right
        return newRoot.right
