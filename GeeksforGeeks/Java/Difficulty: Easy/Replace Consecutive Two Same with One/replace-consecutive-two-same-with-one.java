class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(st.size()==0 || ch!=st.peek()) st.push(ch);
            i++;
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        sb.reverse();
        String ans=sb.toString();

        return ans;
    }
}