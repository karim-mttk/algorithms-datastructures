"""
Given the head of a singly-linked list that represents a binary number, 
returns the decimal value of the number. The most significant bit is 
stored in the head node.
        
Parameters:
head (ListNode): The head node of the linked list.
        
Returns:
int: The decimal value of the binary number
"""

#Definition for singly-linked list.
#class ListNode:
#    def __init__(self, val=0, next=None):
#        self.val = val
#        self.next = next

#v1. Using bit manipulation. O(n) time, O(1) space.
class Solution1:
    def getDecimalValue(self, head: ListNode) -> int:
        deciVal = 0

        while head is not None:
            deciVal = deciVal * 2 + head.val
            head = head.next
        return deciVal 

#V2. Using powers of 2. O(n) time, O(1) space.  
class Solution2:
    def getDecimalValue(self, head: ListNode) -> int:
        # Calculate the length of the linked list
        length = 0
        current = head
        while current is not None:
            length += 1
            current = current.next
        
        # Calculate the decimal value of the binary number
        current = head
        decimal_value = 0
        while current is not None:
            decimal_value += current.val * pow(2, length - 1)
            length -= 1
            current = current.next
        
        return decimal_value    