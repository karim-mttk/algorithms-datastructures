 public class ArrayQueue {

    BinaryTree.Node[] nodes;

     private int k, i;

    public ArrayQueue(int n){
        nodes = new BinaryTree.Node[n];
        k = 0;
        i = 0;
    }

    public void enqueue(BinaryTree.Node newNode){
        if(isFull())
            getNewArray(newNode);
        else{
            nodes[k] = newNode;
        }
    }

    public BinaryTree.Node dequeue(){
        BinaryTree.Node temp = nodes[i];
        nodes[i] = null;
        i = (i + 1) % nodes.length;

        if(isEmpty()){
            i=0;
            k=0;
        }
        return temp;
    }

    public boolean isEmpty(){
        return (nodes[i]==null);
    }

    public boolean isFull(){
        return (isEmpty() &&(k==i));
    }

    public void getNewArray(BinaryTree.Node newNode){

        BinaryTree.Node[] largerArray = new BinaryTree.Node [2 * nodes.length];
        int j = 0;
        while(j< nodes.length){
            largerArray[j]=nodes[(i+j)%nodes.length];
            j++;
        }
        largerArray[j] = newNode;
        k = j +1;
        i = 0;
        nodes = largerArray;
    }

    // print queue elements//
    public void printq()
    {
        for (int p = 0; i < nodes.length; p++) {
          if(nodes[p]==null)
              System.out.print("|");
          else
              System.out.print("|" + nodes[p].value + " ");
        }
        System.out.println("|");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(2);

        q.printq();
    }
}




