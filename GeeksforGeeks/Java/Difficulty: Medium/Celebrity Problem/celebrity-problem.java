class Solution {
    public int celebrity(int arr[][]) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++) st.push(i);
        
        while(st.size()>1){   
            int a=st.pop();
            int b=st.pop();
            
            if(arr[a][b]==0) st.push(a);
            else st.push(b);
        }
        
        int c=st.peek();
        for(int i=0;i<arr.length;i++){
            if(c!=i){
                if(arr[c][i]==1 || arr[i][c]==0) return -1;
            }
        }
        
        return c;
    }
}