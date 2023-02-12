import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class TreeIterator implements Iterator<Integer> {
    private BinaryTree.Node next;
    private Stack<BinaryTree.Node> stack;

    public TreeIterator(BinaryTree.Node root) {
     stack = new Stack<BinaryTree.Node>();
     goleft(root);
    }

    private void goleft(BinaryTree.Node curr){
        while(curr !=null){
            stack.push(curr);
            curr = curr.left;
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException();}
        BinaryTree.Node curr = stack.pop();

        if(curr.right != null)
            goleft(curr.right);
        return curr.value;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}


