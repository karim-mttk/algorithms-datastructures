class Stack {
    int[] stack;
    int p = 0;

    Stack(){
        stack = new int[100];
    }

    int pop(){
        if(p < (stack.length/2 - 1)) {
            int[] newStack = new int[(stack.length / 2)];
            for(int i=0; i<stack.length/2; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        return stack[p--];
    }

    void push(int i){
        if(p == stack.length) {
            int[] newStack = new int[stack.length * 2];
            for(i=0; i<stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
         stack[++p] = i;
    }
}