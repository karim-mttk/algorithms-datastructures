class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


class LinkedList:

    def traversal(self):
        first = self.head
        while first:
            print(first.val)
            first = first.next

    def insertNewHead(self, val):
        newNode = Node(val)
        newNode.next = self.head
        self.head = newNode

    def search(self, x):
        temp = self.head
        while temp is not None:
            if temp.val == x:
                return True
            temp = temp.next
        else:
            return False

    def deleteNode(self, val):
        temp = self.head
        while temp is not None:
            if temp.val == val:
                break
            prev = temp
            temp = temp.next
        prev.next = temp.next


family = LinkedList()
family.head = Node("John")
wife = Node("Jane")
first_kid = Node("Jill")
second_kid = Node("Jack")

family.head.next = wife
wife.next = first_kid
first_kid.next = second_kid


family.insertNewHead("Bub")
family.traversal()

print(family.search("John"))
