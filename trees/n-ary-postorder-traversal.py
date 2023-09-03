#using recursion with time-copleity of O(n):
def postorder(self, root: 'Node') -> List[int]:
    res = []

    def dfs(node):
        if not node:
            return

        for i in node.children:
            dfs(i)
        res.append(node.val)

    dfs(root)
    return res

#usint iteration:

