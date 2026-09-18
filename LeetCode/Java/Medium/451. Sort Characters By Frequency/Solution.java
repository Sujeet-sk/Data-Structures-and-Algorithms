class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }

        String[] bucket=new String[s.length()+1];
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(bucket[freq] == null){
                bucket[freq] = "";
            }
            bucket[freq] = bucket[freq] + ch;;
        }

        StringBuilder ans = new StringBuilder();

        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(char ch : bucket[i].toCharArray()){
                    for(int j = 0; j < i; j++){
                        ans.append(ch);
                    }
                }
            }
        }

        return ans.toString();

    }
}