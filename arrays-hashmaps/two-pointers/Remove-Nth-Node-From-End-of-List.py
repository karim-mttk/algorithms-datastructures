# v1 two pointers
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast = head
        slow = head

        for i in range(n+1):
            if fast is None:
                return head.next  # Node to remove is the head
            # or move fast to the end of the list
            fast = fast.next

        while fast is not None:
            fast = fast.next
            slow = slow.next

        # slow is the node before the node to remove, so fix the next pointer
        slow.next = slow.next.next

        return head

# v2 using traverse


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Calculate the length of the list
        length = 0
        node = head
        while node:
            length += 1
            node = node.next

        # Calculate the index of the node to remove
        index = length - n

        # Handle the case where the head needs to be removed
        if index == 0:
            return head.next

        # Traverse the list to find the node that precedes the node to remove
        node = head
        for i in range(index - 1):
            node = node.next

        # Remove the node
        node.next = node.next.next

        return head
