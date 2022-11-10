class minHeap {

    private int[]Heap;
    private int size;
    private int maxsize;

    //initialize the front
    private static final int FRONT = 1;

    //constructor
    public minHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;

        Heap = new int [this.maxsize +1];
        Heap[0]= Integer.MIN_VALUE;
    }
    //RETURN PARENT NODE
    private int parent(int pos){return pos/ 2;}

    //RETURN LEFT NODE
    private int leftN(int pos){return(2*pos);}

    //RETURN RIGHT NODE
    private int rightN(int pos){return(2*pos)+1;}

    //CHECK FOR LEAF NODE
    private boolean leaf(int pos){
        if (pos > (size/2)){return true;}
        return false;
    }
    //SWAP TWO NODES
    private void swap(int fpos, int spos){
        int temp = Heap[fpos];

        Heap[fpos]= Heap[spos];
        Heap[spos]= temp;
    }

    //HEAP THE NODE AT POS
    private void heapPos(int pos){
        if(!leaf(pos)){
            int swapP = pos;
            //swap with minmum 2 nodes
            //to chekc if left node exits. or set value to 0
            //to be swapped with parent node

            if(rightN(pos)<=size)
                swapP=Heap[leftN(pos)]<Heap[rightN(pos)]?leftN(pos):rightN(pos);
                else
                    swapP= Heap[leftN(pos)];
                if(Heap[pos]>Heap[leftN(pos)] || Heap[pos]>Heap[rightN(pos)]){
                    swap(pos, swapP);
                    heapPos(swapP);
                }
        }
    }
    public void add(int e){
        if(size >= maxsize){return;}
        Heap[++size] = e;
        int curr = size;

        while(Heap[curr]<Heap[parent(curr)]){
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    public int remove(){
        int pop = Heap[FRONT];
        Heap[FRONT]=Heap[size--];
        heapPos(FRONT);

        return pop;
    }

    public void print(){
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(
                    " PARENT : " + Heap[i]
                            + " LEFT NODE : " + Heap[2 * i ]
                            + " RIGHT NODE :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main (String[]arg)
    {
        minHeap mheap= new minHeap(20);
        mheap.add(5);
        mheap.add(55);
        mheap.add(3);
        mheap.add(9);
        mheap.add(1);
        mheap.add(10);
        mheap.add(90);
        mheap.add(543);

        mheap.print();

    }
}
