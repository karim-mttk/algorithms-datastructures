# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# v1. using mirror method, two methods to check if two trees are mirrors of each other
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        return self.isMirror(root.left, root.right)

    def isMirror(self, left, right) -> bool:
        if not left and not right:
            return True
        if not left or not right:
            return False
        return left.val == right.val and self.isMirror(left.left, right.right) and self.isMirror(left.right, right.left)


# v2. using stack method
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True

        stack = [(root.left, root.right)]
        while stack:
            left, right = stack.pop()
            if not left and not right:
                continue
            if not left or not right or left.val != right.val:
                return False
            stack.append((left.left, right.right))
            stack.append((left.right, right.left))

        return True


# v3. using hashmap method, fastest runtime but with more code
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True

        def helper(left, right, hashmap):
            if not left and not right:
                return True
            if not left or not right:
                return False
            if left.val != right.val:
                return False
            if left in hashmap and hashmap[left] == right:
                return True
            if right in hashmap and hashmap[right] == left:
                return True
            hashmap[left] = right
            hashmap[right] = left
            return helper(left.left, right.right, hashmap) and helper(left.right, right.left, hashmap)

        hashmap = {}
        return helper(root.left, root.right, hashmap)
