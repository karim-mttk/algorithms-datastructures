/*
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class TreeIterator implements Iterator<Integer> {
    private BinaryTree.Node next;
    private Queue<BinaryTree.Node>queue;

    public TreeIterator(BinaryTree.Node root) {
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Integer next() {
        if(!queue.isEmpty()){
            throw new NoSuchElementException();}
        BinaryTree.Node curr = queue.poll();

        if(curr.right != null)
            queue.add(curr.right);

       if(curr.left != null)
            queue.add(curr.left);
        return curr.value;

    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

*/
