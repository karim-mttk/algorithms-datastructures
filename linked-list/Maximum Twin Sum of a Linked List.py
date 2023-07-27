""""
Given a linked list of even length n, 
where each node has a unique 0-indexed position i (0 <= i < n),
 the twin of node i is defined as the node at position (n-1-i) 
 if i is in the range 0 to (n/2)-1 (inclusive). 
 The twin sum of a node i is the sum of the values of nodes i and its twin.
Write a function that takes the head of a linked list as input 
and returns the maximum twin sum among all pairs of nodes with twins.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
#v1. using array to store the values of the linked list, time complexity O(n), space complexity O(n)
class Solution:
    def pairSum(self, head: ListNode) -> int:
        arr = []
        curr = head
        while curr:
            arr.append(curr.val)
            curr = curr.next
        maxSum = 0
        n = len(arr)
        for i in range(n//2):
            maxSum = max(maxSum, arr[i] + arr[n-1-i])
        return maxSum        
     