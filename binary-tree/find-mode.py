def findMode(self, root: Optional[TreeNode]) -> List[int]:
    def inorder(root, count):
        if not root:
            return

        count[root.val] += 1
        inorder(root.left, count)
        inorder(root.right, count)

    counter = defaultdict(int)
    inorder(root, counter)
    max_count = max(counter.values())

    res = []
    for key in counter:
        if counter[key] == max_count:
            res.append(key)

    return res

