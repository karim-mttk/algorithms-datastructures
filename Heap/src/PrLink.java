public class PrLink {
    static class Node {
        int data;
        Node next;
        }

    static Node node = new Node();

    static Node newNode(int d) {
        Node temp = new Node();
        temp.data = d;
        temp.next = null;

        return temp;
    }

    static int lookup(Node head) {
        return (head).data;
    }

    static Node add(Node head, int d) {
        Node temp = newNode(d);
        temp.next = (head);
        (head) = temp;

        return head;
    }

    //add nodes according to priority
    static Node addPri(Node head, int d) {
        Node begin = (head); //set pointer to head

        //new node
        Node temp = newNode(d);

        //inserting new nodes before the head node
        //change pointer of head node

        if ((head).data > d) {
            temp.next = head;
            (head) = temp;
        } else {
            //go through the list
            while (begin.next != null &&
                    begin.next.data < d) {
                begin = begin.next;
            }
        }
        return head;
    }

    static Node remove(Node head) {
        Node temp = head;
        (head) = (head).next;
        return head;
    }

    static Node remPri(Node head){
        Node smallest = head;
        Node temp = head;
        Node prev = null;

        while(temp != null) {
            if(temp.next != null && temp.next.data < smallest.data){
                smallest = temp.next;
                prev = temp;
            }
            temp = temp.next;
        }

        if(smallest != head) { //First element is not min
            prev.next = smallest.next;
        } else {
            head = head.next; //If first element is smallest, update the head
        }

        return head;
    }

    static int isEmpty(Node head) {
        return ((head) == null) ? 1 : 0;
    }

    public static void main(String args[]) {
        //create queue
        Node priQ = newNode(51200);

        int[] Arraysizes = {200, 400, 800, 1600, 3200, 6400, 12800, 25600, 51200};
        for (int n : Arraysizes) {

            double n0 = System.nanoTime();

            for (int i = 0; i <= n; i++) {
                priQ = add(priQ, i);
            }
            double n1 = System.nanoTime();
            double t = (n1 - n0);

            System.out.printf("%6d \t %.2fns\n ", n, ((t) / 1000));
        }
    }
}

