class Calculator {
    Item[] expr;
    int ip;
    Stack stack;
    public Calculator(Item[] expr) {
        this.expr = expr;
        this.ip = 0;
        this.stack = new Stack();

    }

    public int run() {
        while ( ip < expr.length ) {
            step();
        }
        return stack.pop();
    }

    public void step() {
        Item nxt = expr[ip++];

        switch(nxt.getType()) {
            case ADD:
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x + y);
                break;
            case SUB:
                y = stack.pop();
                x = stack.pop();
                stack.push(x - y);
                break;
            case MUL:
                y = stack.pop();
                x = stack.pop();
                stack.push(x * y);
                break;
            case DIV:
                y = stack.pop();
                x = stack.pop();
                stack.push(x / y);
                break;
            case VALUE:
                stack.push(nxt.getValue());
                break;
            default:
                System.out.println("Non-compatible char");
                break;
            case MOD:
                y = stack.pop();
                x = stack.pop();
                stack.push(x -(( x / y) * y));
                break;
           }
        }

    }


