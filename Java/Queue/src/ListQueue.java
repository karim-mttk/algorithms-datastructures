import static java.lang.System.exit;

public class ListQueue {
    Node head ,tail;

    public class Node {
        BinaryTree.Node treeNode;
        Node next;


        public Node(BinaryTree.Node node, Node next) {
            this.treeNode = node;
            this.next = next;
        }
    }

    public ListQueue() {
        head = null;
        tail = null;
    }

    public void addlistqueue(BinaryTree.Node node) {
        if(isEmpty()){
            head = tail = new Node(node, null);
        }
        else{
            tail.next = new Node(node, null);
            tail = tail.next;
        }
    }

    public BinaryTree.Node remlistqueue() {
        if (!isEmpty()) {
            Node nxt = head;
            head = head.next;

            if (isEmpty())
                tail = null;
            return nxt.treeNode;
        }
        else
        return null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print() {
        Node nxt = head;
        while(nxt != null){
            System.out.print("|" + nxt.treeNode.value + " ");
            nxt = nxt.next;
        }
       System.out.println("|");
    }
}



