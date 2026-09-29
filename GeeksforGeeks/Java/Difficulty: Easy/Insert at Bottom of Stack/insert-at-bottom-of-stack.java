class Solution {
    public void push(int ele,Stack<Integer> st){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top=st.pop();
        push(ele,st);
        st.push(top);
        
    }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        push(x,st);
        return st;
    }
}