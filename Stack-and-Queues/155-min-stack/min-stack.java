class MinStack {

    Stack<Integer> stack; //stores normal values
    Stack<Integer> minStack; //stores min
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>(); //always keeps track of the minimums seen so far
    }
    
    public void push(int x) {
        stack.push(x);   // always push to main stack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);    // push into minStack if it's the new min
        }
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();    // also pop from minStack if it was the min
        }
        stack.pop();  // pop from main stack
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}