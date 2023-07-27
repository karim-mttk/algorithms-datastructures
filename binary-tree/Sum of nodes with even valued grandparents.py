#Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent. 
#If there are no nodes with an even-valued grandparent, return 0.
#A grandparent of a node is the parent of its parent if it exists.

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#v1. Recursive DFS, O(n) time, O(h) space in general case, O(n) space in worst case and O(log n) space in best case.
class Solution1:
    def __init__(self):
        self.res = 0
    def  sumEvenGrandparent(self, root: TreeNode) -> int:
        self.res = 0
        self.dfs(root, None, None)
        return self.res
    def dfs(self, node, parent, grandparent):
        if not node:
            return
        if grandparent and grandparent.val % 2 == 0:
            self.res += node.val
        self.dfs(node.left, node, parent)
        self.dfs(node.right, node, parent)

#v2. Here we use a boolean variable to indicate whether the grandparent is even or not. 
class Solution2:
    def __init__(self):
        self.res = 0
    
    def sumEvenGrandparent(self, root: TreeNode) -> int:
        self.dfs(root, False, False)
        return self.res
    
    def dfs(self, node: TreeNode, isParentEven: bool, isGrandparentEven: bool) -> None:
        if not node:
            return
        if isGrandparentEven:
            self.res += node.val
        isEven = (node.val % 2 == 0)
        self.dfs(node.left, isEven, isParentEven)
        self.dfs(node.right, isEven, isParentEven)        