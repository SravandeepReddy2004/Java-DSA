class MyQueue { 
    private Stack<Integer> s1;   // main stack (stores queue)
    private Stack<Integer> s2;  // helper stack (used during push)

    // Constructor
    public MyQueue() {
       s1 = new Stack<>();
       s2 = new Stack<>();  
    }
    
    // Push element to the back of queue
    public void push(int x) {
        // Move all elements from s1 → s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Add new element to s1
        s1.push(x);

        // Move everything back from s2 → s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    // Remove element from the front
    public int pop() {
        return s1.pop(); // top of s1 is the front of queue
    }
    
    // Get the front element
    public int peek() {
        return s1.peek(); // top of s1 is the front
    }
    
    // Check if queue is empty
    public boolean empty() {
        return s1.isEmpty();
    }
}
