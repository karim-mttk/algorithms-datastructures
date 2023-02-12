import java.util.Iterator;

public class BinaryTree implements Iterable<Integer> {

    public Iterator<Integer> iterator() {
        return new TreeIterator(root);
    }

    void print(){
        root.printRec();
    }
    public class Node {

        void printRec() {
            if(left != null)
                left.printRec();
            System.out.println(" key: " + key + "\tvalue: " + value);
            if(right != null)
                right.printRec();
        }

        public Integer key;
        public Integer value;
        public Node left, right;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }
    }
   /* */

    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(Integer k, Integer v) {
        root = addRec(root, k, v);
    }

    Node addRec(Node root, Integer key, Integer value) {

        if (root == null) {
            root = new Node(key, value);
            return root;
        }
        if (key == root.key) {
            root.value = value;
            return root;
        } else if (key < root.key)
            root.left = addRec(root.left, key, value);
        else if (key > root.key)
            root.right = addRec(root.right, key, value);

        return root;
    }

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
            System.out.println("k:"+root.key + "," + "v" + root.value);
            // System.out.println(root.right.key+ "," + root.right.value);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {

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

        BinaryTree tree = new BinaryTree();
        tree.add(5,105);
        tree.add(2,102);
        tree.add(7,107);
        tree.add(1,101);
        tree.add(8,108);
        tree.add(6,106);
        tree.add(3,103);

        /*Iterator<Integer> treeiterator = tree.iterator();
        treeiterator.next();
        treeiterator.next();
        tree.add(1, 204);
        System.out.println(treeiterator.next());*/
       for (int i : tree)
           System.out.println("next value " + i);
    }


}
