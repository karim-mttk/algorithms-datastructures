# Definition for singly-linked list. 
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next

#v1. This code shows how to use a dummy node to simplify the code. time: O(n), space: O(1)
class Solution:    
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cNode = head.next
        res = newNode = ListNode(0)

        while cNode:
            currSum = 0
            while cNode and cNode.val != 0:  # check if cNode is not None before accessing its value
                currSum = currSum + cNode.val
                cNode = cNode.next
            newNode.next = ListNode(currSum)
            newNode = newNode.next
            if cNode:
                cNode = cNode.next  # check if cNode is not None before moving to the next node
        return res.next