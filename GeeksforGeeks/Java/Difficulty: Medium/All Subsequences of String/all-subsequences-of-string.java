class Solution {
    public static void subset(String s,int idx,String s1,List<String>ans){
        if(idx==s.length()){
            ans.add(s1);
            return;
        }
        char ch=s.charAt(idx);
        subset(s,idx+1,s1+ch,ans);     //pick
        subset(s,idx+1,s1,ans);       //skip


    }
    public List<String> powerSet(String s) {
        List<String>ans=new ArrayList<>();
        int idx=0;
        String s1="";
        subset(s,idx,s1,ans);
        Collections.sort(ans);
        return ans;
        
    }
}