import java.util.Random;
public class Heap{

    Node root;

    private class Node{

        Integer priority;
        Integer size;
        Node left, right;

        private Node(Integer pri){
            this.priority = pri;
            this.size = 0;
            this.left = null;
            this.right = null;
        }

        private Node remove(){
            if(this.left == null && this.right == null){
                return null;
            }
            else if(this.left == null){
                return this.right;
            }
            else if(this.right == null){
                return this.left;
            }
            else if(this.left.priority < this.right.priority){
                this.priority = this.left.priority;
                this.left = this.left.remove();
            }
            else{
                this.priority = this.right.priority;
                this.right = this.right.remove();
            }
            this.size -= 1;
        return this;
        }

        private Integer push(Integer incr) {

            // same priority
            if(incr == this.priority) {
                return 0;
            }

            if(this.left == null)
                if(this.right == null) {
                    this.priority = incr;
                    return 0;
                }
                else {
                    // this.right != null
                    if(this.right.priority < incr) {
                        this.priority = this.right.priority;
                        return this.right.push(incr) + 1;
                    }
                    // this.right.value >= incr
                    this.priority = incr;
                    return 0;
                }
            else {
                // this.left != null
                if(this.right == null) {
                    if(this.left.priority < incr) {
                        this.priority = this.left.priority;
                        return this.left.push(incr) + 1;
                    }
                    // this.left.value >= incr
                    this.priority = incr;
                    return 0;
                }
                else {
                    // this.right != null
                    if(this.left.priority <= this.right.priority && this.left.priority < incr) {
                        this.priority = this.left.priority;
                        return this.left.push(incr) + 1;
                    }
                    else {
                        // this.left.value > this.right.value
                        if(this.right.priority < incr) {
                            this.priority = this.right.priority;
                            return this.right.push(incr) + 1;
                        }
                        else {
                            // this.left.value/ this.right.value >= incr
                            this.priority = incr;
                            return 0;
                        }
                    }
                }
            }
        }

        private Integer add (Integer pri){
            if(pri < this.priority){
                Integer tmp = this.priority;
                this.priority = pri;
                pri = tmp;
            }
            this.size += 1;  
            if (this.left == null){
                this.left = new Node(pri);
                return 1;
            }
            else if(this.right == null){
                this.right = new Node(pri);
                return 1;
            }
            else if(this.right.size < this.left.size) {

            return   this.right.add(pri) +1;
            }
            else{
            return    this.left.add(pri) +1;
            }
            /*else{
                Integer d = this.right.add(pri);
                Node tmp = this.right;
                this.right = this.left;
                this.left = tmp;
               return d + 1;
            }*/
        }

        //går genom trädet och validerar att de är ett korrekt träd.
        private Boolean check(){
            Integer prio = this.priority;
            Boolean lc = true;
            Boolean rc = true;
            if(this.left!=null){
                if(this.left.priority >= prio){
                    lc = this.left.check();
                }
                else 
                    System.out.println("left branch higher prio");
                    lc = false;
            }

            if(this.right!=null){
                if(this.right.priority >= prio){
                    rc = this.right.check();
                }
                else 
                    System.out.println("right branch higher prio");
                    rc = false;
            }
            return (lc && rc);
        }

        private void print(Integer n){
            System.out.println(" ".repeat(n) + this.priority + "(" + this.size + ")");
            if(this.left == null && this.right == null){
                return;
            }
            if(this.left != null){
                this.left.print(n+2);
            }
            else{
                System.out.println(" ".repeat(n+2) + "----");
            }
            if(this.right != null){
                this.right.print(n + 2);
            }
            else{
                System.out.println(" ".repeat(n + 2) + "----");
            }
        }
    }
            public Integer enqueue(Integer prio){
                if(root!=null){
                return root.add(prio);
                }
                
                root = new Node(prio);
                return 0;
            }

            public Integer dequeue(){               //retunera root värde
                if(root != null){
                    Integer ret = root.priority;
                    root = root.remove();
                    return ret;
                }
                else{
                    return null;
                }
            }

            public void print(){
                if(root != null)
                    root.print(2);
                else
                    System.out.print("empty");
            }
            public Boolean check(){
                if(root != null){
                return root.check();
                }
                else
                    return true;
            }

    public Integer change(Integer incr) {

        Integer depth = 0;

        if(root == null) {
            return depth;
        }
        else
            return root.push(incr);
    }
            public static void main(String args[]){
                Heap queue = new Heap();
                Random rd = new Random(); //
                for (int i = 0; i<64; i++){
                    queue.enqueue(rd.nextInt(100));
                }
                queue.print();
                Integer d = queue.change(100);
                System.out.print("depth = " + d);

               /* queue.enqueue(12);
                queue.enqueue(5);
                queue.enqueue(10);
                queue.enqueue(30);
                queue.enqueue(11);
                queue.enqueue(3);
                queue.enqueue(2);
                queue.enqueue(1);
                queue.enqueue(20);
                queue.enqueue(8);
                queue.print();

                queue.dequeue();
                queue.print();

                System.out.println(" _________________________PUSH__________________________ ");
                queue.change(50);
                queue.print();
                */
                // System.out.print("check = " + queue.check());
            }
        
}