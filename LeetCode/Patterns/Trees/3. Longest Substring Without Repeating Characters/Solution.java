class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(ch);
                j++;
                int len=j-i;
                max=Math.max(max,len);
            }
        }
        
        return max;
    }
}