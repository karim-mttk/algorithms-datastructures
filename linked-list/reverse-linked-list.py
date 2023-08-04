#three pointer solution:
class Solution:
    #Function to reverse a linked list.
    def reverseList(self, head):
        prev = None
        curr = self.head
        while curr is not None:
            next = current.next
            current.next = prev
            prev = curr
            curr = next
        self.head = prev
        # Code here