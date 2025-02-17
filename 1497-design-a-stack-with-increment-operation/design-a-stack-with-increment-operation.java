class CustomStack {
    int size;
    int[] stack;
    int maxsize;

    public CustomStack(int maxSize) {
        maxsize=maxSize;
        stack=new int[maxSize];
        size=0;
        
    }
    
    public void push(int x) {
      if(size < maxsize){
            stack[size] = x;        
            size++;  
      }                 
        
    }
    public int size(){
        return size;
    }
    
    public int pop() {
        if (size == 0) { 
            return -1;         
        } else {
            int poppedValue = stack[size - 1]; 
            size--;             
            return poppedValue;   
        }

        
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i <Math.min(k,size); i++){
        
            stack[i]=stack[i]+val;
  

        }

 
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */