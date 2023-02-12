public class QueueExample {

    public static void main (String[] args)
    {
        //create queue using MyQueue that can hold 4 items
        MyQueue myQueue = new MyQueue(5);

        //i) Insert 3 elements in the queue
        myQueue.insert(3);
        myQueue.insert(5);
        myQueue.insert(7);
        System.out.println("Peek Front: " + myQueue.peekFront());
        System.out.println("Peek Rear: " + myQueue.peekRear());

        //ii) Insert an element and remove an element.
        //call isEmpty()to ensure that there are elements in the queue before calling remove()
        if (!myQueue.isEmpty())
            myQueue.remove();
        //insert an element
        myQueue.insert(9);
        System.out.println("Peek Front: " + myQueue.peekFront());
        System.out.println("Peek Rear: " + myQueue.peekRear());

        //iii) Queue with some more items removed.
        if (!myQueue.isEmpty())
            myQueue.remove();
        System.out.println("Peek Front: " + myQueue.peekFront());
        System.out.println("Peek Rear: " + myQueue.peekRear());

        //iv) Insert an element at rear
        myQueue.insert(10);
        System.out.println("Peek Front: " + myQueue.peekFront());
        System.out.println("Peek Rear: " + myQueue.peekRear());

        //v) Try to insert one more element when the rear of the queue is at the end of the array (max index)
        myQueue.insert(11);

        while (!myQueue.isEmpty())
        {
            long element = myQueue.remove();
            System.out.println(element);
        }

    }

}

class MyQueue
{
    //max queue array size
    private int maxQueueArraySize;

    //queue array
    private long[] myQueueArray;

    //queue front
    private int front;

    //queue rear
    private int rear;

    //number of elements
    private int nElements;

    //constructor
    public MyQueue(int size)
    {
        //set queue array size
        maxQueueArraySize = size;
        //create array
        myQueueArray = new long[maxQueueArraySize];
        front = 0;
        rear = -1;
        //no elements yet in the queue
        nElements = 0;

    }

    //insert element at rear of the queue
    public void insert(long element)
    {
        //handling wraparound
        //if(rear == maxQueueArraySize-1)
        //	rear = -1;

        //increment rear and insert element
        myQueueArray[++rear] = element;

        //added one more element in the Queue
        nElements++;

    }

    //remove element from front of the Queue.
    public long remove()
    {
        long temp = myQueueArray[front++];
        if(front == maxQueueArraySize)
            front = 0;
        //less by one element
        nElements--;

        return temp;
    }

    //to peek at front of the queue
    public long peekFront()
    {
        return myQueueArray[front];
    }

    //to peek at front of the queue
    public long peekRear()
    {
        return myQueueArray[rear];
    }

    //return true if queue is empty
    public boolean isEmpty()
    {
        return (nElements==0);
    }

    //return true is queue is full
    public boolean isFull()
    {
        return (nElements==maxQueueArraySize);
    }

    //return number of elements in the Queue
    public int size()
    {
        return nElements;
    }

}
/**
 *
 *
 */
