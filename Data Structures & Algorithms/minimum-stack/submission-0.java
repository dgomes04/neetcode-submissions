class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    int min;
    public MinStack() {
        min = 0;
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(!minSt.isEmpty()){
            int stVal = minSt.peek();
           if(val < stVal){
            minSt.push(val);
           }else{
            minSt.push(stVal);
           }
        }else{
            minSt.push(val);
        }
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
