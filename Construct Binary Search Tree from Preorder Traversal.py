#Given an array of integers preorder, which represents
# the preorder traversal of a BST (i.e., binary search tree),
# construct the tree and return its root.

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

#v1 Time complexity: O(nlogn) Space complexity: O(n)  
class Solution:
    def bstFromPreorder(self, preorder: List[int]) -> Optional[TreeNode]:
        if len (preorder) == 0:
            return None
        root = TreeNode(preorder[0])

        def insertN(root, newV):
            if root.val > newV:
                if root.left is None:
                    root.left = TreeNode(newV)
                    return
                insertN(root.left, newV)
            if root.val < newV:
                if root.right is None:
                    root.right = TreeNode(newV)
                    return
                insertN(root.right, newV)
        for v in preorder[1:]:
            insertN(root,v)
        return root

