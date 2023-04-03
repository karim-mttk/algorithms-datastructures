# v1 First submission
class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        currP = list1
        for count in range(b):
            if count == a-1:
                start = currP
            currP = currP.next
        start.next = list2

        while list2.next:
            list2 = list2.next
        list2.next = currP.next
        return list1

# v2 second submission with faster timecomplexity


class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        currP = list1
        for count in range(b):
            if count == a-1:
                start = currP
            currP = currP.next
        temp = list2
        while temp.next:
            temp = temp.next
        start.next = list2
        temp.next = currP.next
        return list1
