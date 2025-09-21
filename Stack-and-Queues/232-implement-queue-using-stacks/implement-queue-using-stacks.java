class MyQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;
    public MyQueue() {
       in=new Stack<>();
       out=new Stack<>();  
    }
    
    public void push(int x) {
        while(!in.isEmpty()){
            out.push(in.peek());
            in.pop();
        }
        in.push(x);
        while(!out.isEmpty()){
            in.push(out.peek());
            out.pop();
        }
    }
    
    public int pop() {
        int val=in.peek();
        in.pop();
        return val;
    }
    
    public int peek() {
        return in.peek();
    }
    
    public boolean empty() {
        return in.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */