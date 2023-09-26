# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        res = []

        def itrLinkedList(head):
            curr = head
            while curr is not None:
                res.append(curr.val)
                curr = curr.next

        for i in lists:
            itrLinkedList(i)

        if not res:
            return None

        res.sort()

        finalList = ListNode(res[0])

        current = finalList

        for i in range(1, len(res)):
            current.next = ListNode(res[i])
            current = current.next

        return finalList