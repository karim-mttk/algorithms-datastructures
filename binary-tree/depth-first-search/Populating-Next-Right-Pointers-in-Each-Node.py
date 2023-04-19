"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""


class Solution:
    def connect(self, node: 'Optional[Node]') -> 'Optional[Node]':
        curr = node
        next = node.left if node else None

        while curr and next:
            curr.left.next = curr.right
            if curr.next:
                curr.right.next = curr.next.left

            curr = curr.next
            if not curr:
                curr = next
                next = curr.left

        return node
