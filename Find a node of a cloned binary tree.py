#The structure of the tree:
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

#v1. with iterative DFS
class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
        stack = [(original, cloned)]

        while stack:
            node1, node2 = stack.pop()

            if node1 == target:
                return node2

            if node1.left:
                stack.append((node1.left, node2.left))
            if node1.right:
                stack.append((node1.right, node2.right))

        return None 
    
