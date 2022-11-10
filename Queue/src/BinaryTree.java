import java.util.*;

public class BinaryTree implements Iterable<Integer> {

    protected class Node {

        Integer key;
        Integer value;
        Node left, right;

        // default constructor
        public Node() {

            this.key = this.value = 0;
            this.left = this.right = null;
        }

        public Node(Integer key, Integer value) {

            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }

        public void addNode(Integer key, Integer value) {

            if(key == this.key)
                this.value = value;

            else if(key < this.key) {
                if(left == null) {
                    left = new Node(key, value);
                    size++;
                }
                else
                    left.addNode(key, value);
            }
            else {
                // key > this.key
                if(right == null) {
                    right = new Node(key, value);
                    size++;
                }
                else
                    right.addNode(key, value);
            }
        }

        public Node lookupNode(Integer key) {

            if(key == this.key)
                return this;

            else if(key < this.key) {
                if(left != null)
                    return left.lookupNode(key);
            }
            else {
                // key > this.key
                if(right != null)
                    return right.lookupNode(key);
            }
            return null;
        }

        public void addNodeToQueue() {

            queue = new ArrayQueue(2);
            queue.printq();
            queue.enqueue(root);
            queue.printq();

            while(!queue.isEmpty()) {

                Node next = queue.dequeue();

                if(next.left != null)
                    queue.enqueue(next.left);

                if(next.right != null)
                    queue.enqueue(next.right);

                queue.printq();
            }
        }

        public void printNodes() {

            if(left != null)
                left.printNodes();

            System.out.println(" key: " + key + " \tvalue: " + value);

            if(right != null)
                right.printNodes();
        }
    }
    /***********************TREE_ITERATOR***********************/
    public class TreeIterator implements Iterator<Integer> {

        private Node next;
        //     	private ArrayQueue qu;
        private ListQueue qu;

        public TreeIterator() {

            next = root;
//            qu = new ArrayQueue(size);
//            qu = new ArrayQueue(2);
            qu = new ListQueue();

            if(next != null)
                qu.addlistqueue(next);
        }

        // returns true if there is still nodes in the queue
        @Override
        public boolean hasNext() {

            return !qu.isEmpty();
        }

        // returns the next element in the iteration
        @Override
        public Integer next() {
            next = qu.remlistqueue();
            if(next.left != null)
                qu.addlistqueue(next.left);
            if(next.right != null)
                qu.addlistqueue(next.right);
            return next.value;
        }

        @Override
        public void remove() {

            throw new UnsupportedOperationException();
        }
    }
    /***the end of tree iterator****/

    // instance variable
    Node root;
    int size;
    ArrayQueue queue;

    // constructor
    public BinaryTree() {

        root = null;
        size = 0;
    }

    // adds a leaf to the tree
    // if key already exists the value is updated
    public void add(Integer key, Integer value) {

        if(root == null) {
            root = new Node(key, value);
            size++;
        }
        else
            root.addNode(key, value);
    }

    // finds and returns the value associated with the key (returns null if key not found)
    public Integer lookup(Integer key) {

        Node tmp = root;

        if(tmp != null)
            tmp = tmp.lookupNode(key);

        if(tmp == null)
            return null;

        return tmp.value;
    }

    // prints all nodes in the tree in-order
    public void print() {

        if(root == null)
            System.out.println("empty tree");
        else
            root.printNodes();
    }

    public int size() {

        return size;
    }

    public void addToQueue() {

        if(root == null)
            System.out.println("empty tree");
        else
            root.addNodeToQueue();
    }

    // returns an iterator over the nodes in the list
    // called by Java when used in a “for each” loop
    public Iterator<Integer> iterator() {
        return new TreeIterator();
    }
}