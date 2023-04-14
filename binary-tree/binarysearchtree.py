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


def buildTree(arr):
    root = BinarySearchTreeNode(arr[0])

    for i in range(1, len(arr)):
        root.add_child(arr[i])

    return root


if __name__ == '__main__':
    nums = [17, 4, 1, 20, 9, 23, 18, 34]
    tree = buildTree(nums)
    print(tree.inOrderTraversal())
