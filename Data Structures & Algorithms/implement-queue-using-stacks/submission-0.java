class MyQueue {

    private Stack<Integer> st;
    private Stack<Integer> qe;
    
    public MyQueue() {
        st = new Stack<>();
        qe = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        peek();
        return qe.pop();
    }
    
    public int peek() {
        if(qe.isEmpty()){
            while(!st.isEmpty()){
                qe.push(st.pop());
            }
        }
        return qe.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && qe.isEmpty();
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