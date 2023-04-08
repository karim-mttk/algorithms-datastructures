""""
This refers to a situation where there is a linked list, 
and a specific node within the list needs to be deleted. 
The node to be deleted is given, but access to the first 
node of the list is not provided. The linked list has unique values, 
and it is guaranteed that the node to be deleted is not 
the last node in the list.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# v1. delete the node and change the pointers


class Solution:
    def deleteNode(self, node):
        """
        The head is not known, so delete the next node and change the pointers
        """
        nextNode = node.next

        node.val = nextNode.val

        node.next = nextNode.next

        nextNode.next = None
        del (nextNode)

# v2. Less code


class Solution:
    def deleteNode(self, node):

        node.val = node.next.val
        node.next = node.next.next
