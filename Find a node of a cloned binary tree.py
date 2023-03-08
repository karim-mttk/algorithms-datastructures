#The structure of the tree:
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

#v1. with iterative DFS, O(n) time, O(n) space. 

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
    
 #v2. with recursive DFS, O(n) time, O(n) space.   
def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
    def dfs(node1, node2):
        if not node1:
            return None
        if node1 is target:
            return node2
        left_result = dfs(node1.left, node2.left)
        if left_result:
            return left_result
        return dfs(node1.right, node2.right)
    
    return dfs(original, cloned)