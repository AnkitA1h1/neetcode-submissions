class MyStack {

    private Queue<Integer> qe;

    public MyStack() {
        qe = new LinkedList();
    }
    
    public void push(int x) {
        qe.add(x);
        for(int i=1;i<qe.size();i++)
            qe.add(qe.remove());
    }
    
    public int pop() {
        return qe.remove();
    }
    
    public int top() {
        return qe.peek();
    }
    
    public boolean empty() {
        return qe.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */