class BinarySearchTreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    def add_child(self, data):
        if data == self.data:
            return
        if data < self.data:
            if self.left:
                self.left.add_child(data)
            else:
                self.left = BinarySearchTreeNode(data)
        else:
            if self.right:
                self.right.add_child(data)
            else:
                self.right = BinarySearchTreeNode(data)

    def inOrderTraversal(self):
        arr = []
        # visit left
        if self.left:
            arr += self.left.inOrderTraversal()

        # visit base
        arr.append(self.data)

        # visit right
        if self.right:
            arr += self.right.inOrderTraversal()

        return arr

    def search(self, val):
        if self.data == val:
            return True
        if val < self.data:
            if self.left:
                return self.left.search(val)
            else:
                return False
        if val > self.data:
            if self.right:
                return self.right.search(val)
            else:
                return False


def buildTree(arr):
    root = BinarySearchTreeNode(arr[0])

    for i in range(1, len(arr)):
        root.add_child(arr[i])

    return root


if __name__ == '__main__':
    nums = [17, 4, 1, 20, 9, 23, 18, 34]
    tree = buildTree(nums)
    # print(tree.inOrderTraversal())

    # time complexity of search is O(log n)
    print(tree.search(200))
