class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long countPairs(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long count=0;
        for(int num:arr){
            int g=gcd(num,k);
            for(int ele:map.keySet()){
                if(((long)g*ele)%k==0) count+=map.get(ele);
            }
            map.put(g,map.getOrDefault(g,0)+1);
        }
        return count;
    }
    
}