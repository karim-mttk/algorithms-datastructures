""""
If you are provided with the root of a binary tree, the task is to find the 
number of nodes whose value is equal to the 
average value of all the nodes present in its respective subtree.
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#v1. using recursion to get the sum and node count of each subtree and compare with the root value 
class Solution:
    def averageOfSubtree(self, root: Optional[TreeNode]) -> int:
        
        def eachNode(root):
            if root:
                self.sum = 0
                self.nodeCount = 0
                average(root)
                if self.nodeCount != 0 and (self.sum // self.nodeCount) == root.val:
                    self.counter += 1
                eachNode(root.left)
                eachNode(root.right)    

        #preorder traversal to get the sum and node count of each subtree
        def average(root):
            if root:
                self.sum += root.val
                self.nodeCount += 1
                average(root.left)
                average(root.right)        
        
        self.counter = 0
        eachNode(root)
        return self.counter

    