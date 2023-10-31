# version1 with recursion
def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
    res = []

    def inorder(root):
        if not root:
            return
        inorder(root.left)
        res.append(root.val)
        inorder(root.right)

    inorder(root)
    return res[k - 1]


# version 2 with iteration

def kthSmallest2(self, root: Optional[TreeNode], k: int) -> int:
    res = []
    stack = []
    cur = root

    while cur or stack:
        while cur:
            stack.append(cur)
            cur = cur.left
        cur = stack.pop()
        res.append(cur.val)
        cur = cur.right

    return res[k - 1]
