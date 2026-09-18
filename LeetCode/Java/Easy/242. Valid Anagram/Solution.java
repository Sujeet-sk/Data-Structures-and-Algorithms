    class Solution {
        public boolean isAnagram(String s1, String s2) {
            if(s1.length()!=s2.length()) return false;
            int[] freq=new int[26];

            for(int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
                int idx=ch-97;
                freq[idx]++;
            }

            for(int i=0;i<s2.length();i++){
                char ch=s2.charAt(i);
                int idx=ch-97;
                freq[idx]--;
            }
            
            for(int i=0;i<freq.length;i++){
                if(freq[i]!=0) return false;
            }
            return true;
        }
    }