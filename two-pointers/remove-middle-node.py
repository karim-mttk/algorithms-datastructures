# v1 two pointers, faster
class Solution(object):
    def middleNode(self, head):
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        return slow


# v2 recursive, slower
class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        self.count = 0

        def helper(node):
            if not node:
                return None
            res = helper(node.next)
            self.count += 1
            return node if self.count == (self.length+1)//2 else res
        self.length = 0
        node = head
        while node:
            self.length += 1
            node = node.next
        return helper(head)
