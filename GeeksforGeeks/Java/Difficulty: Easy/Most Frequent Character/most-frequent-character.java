class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        
        int maxFreq=1;
        for(char ele:map.keySet()){
            int freq=map.get(ele);
            maxFreq=Math.max(maxFreq,freq);
        }
        
        char ans='z';
        for(char ele:map.keySet()){
            int freq=map.get(ele);
            if(freq==maxFreq && ele<ans) ans=ele;
        }
        
        return ans;
        
    }
}