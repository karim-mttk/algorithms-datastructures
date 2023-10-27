def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
    def minValueNode(node):
        current = node
        while current and current.left:
            current = current.left
        return current

    def remove(root, key):
        if not root:
            return None

        if key > root.val:
            root.right = remove(root.right, key)
        elif key < root.val:
            root.left = remove(root.left, key)
        else:
            if not root.left:
                return root.right
            elif not root.right:
                return root.left
            else:
                min_val_node = minValueNode(root.right)
                root.val = min_val_node.val
                root.right = remove(root.right, min_val_node.val)
        return root

    return remove(root, key)
