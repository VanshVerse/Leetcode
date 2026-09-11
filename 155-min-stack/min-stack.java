class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> smin=new Stack<>();
    
    public void push(int value) {
        s.push(value);
        if(smin.isEmpty()==true || value<=smin.peek())
            smin.push(value);
        
    }
    
    public void pop() {
        if(s.peek().equals(smin.peek())){
        //if(s.peek() == smin.peek()){
            smin.pop();
        }    
        s.pop();
        
    }
    
    public int top() {
        if (s.isEmpty() == true) {
            return -1;
        } 
        else {
            return s.peek();
        }
        //return s.isEmpty() ? -1 : s.peek();
        
    }
    
    public int getMin() {
        if (smin.isEmpty() == true) {
            return -1;
        }   
        else {
            return smin.peek();
        }
       // return smin.isEmpty() ? -1 : smin.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */