class MyStack {

    Queue<Integer> queue;
    public MyStack() {
        queue=new LinkedList<>();
        
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        if(queue.size()==0){
            return -1;
        }
        for(int i=0;i<queue.size()-1;i++){
            int store=queue.poll();
            queue.add(store);

        }
        int store=queue.peek();
        queue.poll();

        return store;
    }
    
    public int top() {
        if(queue.size()==0){
            return -1;
        }
        for(int i=0;i<queue.size()-1;i++){
            int store=queue.poll();
            queue.add(store);

        }
        int store=queue.peek();
        queue.add(queue.poll());

        return store;
        
    }
    
    public boolean empty() {
        if(queue.size()==0){
            return true;
        }
        return false;
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