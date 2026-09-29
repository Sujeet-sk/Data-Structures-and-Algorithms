class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        int i=0;
        while(i<arr.length){
            if(st.size()==0 || arr[i]<arr[st.peek()]) ans.add(1);
            else{
                while(st.size()>0 && arr[i]>=arr[st.peek()]) st.pop();
                if(st.size()!=0) ans.add(i-st.peek());
                else ans.add(i+1);
            }
            st.push(i);
            i++;
        }
        
        return ans;
    }
}