class Solution {
    public static String pattern(int n){
        if(n==1) return "1";
        String ans="";
        int freq=0;
        String s=pattern(n-1);
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }
        freq=j-i;
        ans+=freq;
        ans+=s.charAt(i);
        i=j;
        
        return ans;
    }
    public String countAndSay(int n) {
        return pattern(n);
    }
}
