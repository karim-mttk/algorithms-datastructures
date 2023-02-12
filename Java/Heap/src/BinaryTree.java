import java.util.Iterator;

public class BinaryTree {
    void print() {
        root.printRec();
    }
    public class Node {
        void printRec() {
            if (left != null)
                left.printRec();
            System.out.println("\tvalue: " + data);
            if (right != null)
                right.printRec();
        }

        public Integer data, size;
        public Node left, right;

        public Node(Integer d) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(Integer d) {
        root = addPri(root,d);
    }

    Node addPri(Node root, Integer data) {

        Node current = new Node(data);
        root.size++;

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data == root.data) {
            root.data = data;
            return root;
        }
        if (current.data < root.data) {
            int temp = root.data;
            root.data = current.data;
            addPri(root, temp);
        }

        if (root.left == null) {
            root.left = current;
            return current;
        }

        if (root.right == null) {
            root.right = current;
            return current;
        }
        return root;
    }
    /*
    public Integer lookup(Integer k) {
        if (k == null || k == root.key)
            return root.value;

        else if (k > root.key) {
            lookup(root.right.value);
        } else if (k < root.key) {
            lookup(root.left.value);
        }
        return root.value;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("k:" + root.key + "," + "v" + root.value);
            // System.out.println(root.right.key+ "," + root.right.value);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {*/

       /*
       System.out.println("Enter list size: ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("item to remove: ");

        int k = sc.nextInt();

        for (int i = 0; i<n;i++ ) {

                tree.add(i, i);
            }*/

        /* Manually adding values

        BinaryTree tree = new BinaryTree();

        tree.add(5,10);
        tree.add(5,20);
        tree.add(5,30);
        tree.add(8,40);
        tree.add(9,50);
        tree.add(12,60);
        tree.add(11,80);
        tree.add(19,40);
        tree.add(92,50);
        tree.add(2,60);
        tree.add(1,80);

        tree.inorder();
       // tree.print();
            */


            /*   //Benchmark test with random key, value
         Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            tree.add(i, rnd.nextInt(10));
        }

            long sum = 0;
            for (int j = 0; j < 10000; j++) {
                long n0 = System.nanoTime();
                tree.lookup(5);
                long n1 = System.nanoTime();
                long t = (n1 - n0);
                sum += t;
            }

            System.out.println(sum / 10000);*/

        //testing the iterator

    }



