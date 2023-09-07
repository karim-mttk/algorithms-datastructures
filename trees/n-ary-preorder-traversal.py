class Solution:
    def preorder(self, root: 'Node') -> List[int]:

        res = []

        def rec(node):
            if not node:
                return
            res.append(node.val)
            for i in node.children:
                rec(i)

        rec(root)
        return res
