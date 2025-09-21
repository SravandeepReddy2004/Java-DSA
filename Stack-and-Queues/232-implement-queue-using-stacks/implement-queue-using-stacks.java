class MyQueue { 
    private Stack<Integer> in;   // main stack (stores queue)
    private Stack<Integer> out;  // helper stack (used during push)

    // Constructor
    public MyQueue() {
       in = new Stack<>();
       out = new Stack<>();  
    }
    
    // Push element to the back of queue
    public void push(int x) {
        // Move all elements from in → out
        while (!in.isEmpty()) {
            out.push(in.pop());
        }

        // Add new element to in
        in.push(x);

        // Move everything back from out → in
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
    }
    
    // Remove element from the front
    public int pop() {
        return in.pop(); // top of in is the front of queue
    }
    
    // Get the front element
    public int peek() {
        return in.peek(); // top of in is the front
    }
    
    // Check if queue is empty
    public boolean empty() {
        return in.isEmpty();
    }
}
