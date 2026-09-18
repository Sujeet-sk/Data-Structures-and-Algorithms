class Solution {
    public int equalPairs(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int pairs=0;
        for(char ele:map.keySet()){
            int freq=map.get(ele);
            pairs+=freq*freq;
        }
        return pairs;
        
    }
}